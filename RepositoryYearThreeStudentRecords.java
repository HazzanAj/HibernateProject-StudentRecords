package repository;

import model.YearThreeStudentRecords;
import util.DBUtil;
import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryYearThreeStudentRecords {

    private EntityManager em;
    public RepositoryYearThreeStudentRecords() {
        em = DBUtil.getEntityManager();
    }

    public void saveYearThreeStudentRecords( YearThreeStudentRecords yrs3_stuRecords)
    {
        try {
            em.getTransaction().begin();
            em.persist(yrs3_stuRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }
    public void updateYearThreeStudentRecords(YearThreeStudentRecords yrs3_stuRecords) {
        try {
            em.getTransaction().begin();
            em.merge(yrs3_stuRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void deleteYearThreeStudentRecords(YearThreeStudentRecords yrs3_stuRecords) {
        try {
            em.getTransaction().begin();
            em.remove(yrs3_stuRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<YearThreeStudentRecords> listAllYearThreeStudentRecords() {
        String sql = "FROM YearThreeStudentRecords sr3";
        return em.createQuery(sql).getResultList();
    }

}
