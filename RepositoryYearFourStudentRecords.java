package repository;

import model.YearFourStudentRecords;
import util.DBUtil;
import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryYearFourStudentRecords {

    private EntityManager em;
    public RepositoryYearFourStudentRecords() {
        em = DBUtil.getEntityManager();
    }

    public void saveYearFourStudentRecords( YearFourStudentRecords yrs4_stuRecords)
    {
        try {
            em.getTransaction().begin();
            em.persist(yrs4_stuRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }
    public void updateYearFourStudentRecords(YearFourStudentRecords yrs4_stuRecords) {
        try {
            em.getTransaction().begin();
            em.merge(yrs4_stuRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void deleteYearFourStudentRecords(YearFourStudentRecords yrs4_stuRecords) {
        try {
            em.getTransaction().begin();
            em.remove(yrs4_stuRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<YearFourStudentRecords> listAllYearFourStudentRecords() {
        String sql = "FROM YearThreeStudentRecords sr4";
        return em.createQuery(sql).getResultList();
    }

}
