package repository;

import model.YearTwoStudentRecords;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryYearTwoStudentRecords {

    private EntityManager em;

    public RepositoryYearTwoStudentRecords() {
        em = DBUtil.getEntityManager();
    }

    public void saveYearTwoStudentRecords(YearTwoStudentRecords YearTwoStudentRecords) {
        try {
            em.getTransaction().begin();
            em.persist(YearTwoStudentRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void updateYearTwoStudentRecords(YearTwoStudentRecords YearTwoStudentRecords) {
        try {
            em.getTransaction().begin();
            em.merge(YearTwoStudentRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void deleteYearOneStudentRecords(YearTwoStudentRecords YearTwoStudentRecords) {
        try {
            em.getTransaction().begin();
            em.remove(YearTwoStudentRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<YearTwoStudentRecords> listAllYearTwoStudentRecords() {
        String sql = "FROM YearTwoStudentRecords sr2";
        return em.createQuery(sql).getResultList();
    }
}