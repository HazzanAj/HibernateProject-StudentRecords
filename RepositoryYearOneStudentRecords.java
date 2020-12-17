package repository;

import model.Departments;
import model.YearOneStudentRecords;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryYearOneStudentRecords {

    private EntityManager em;

    public RepositoryYearOneStudentRecords() {
        em = DBUtil.getEntityManager();
    }

    public void saveYearOneStudentRecords(YearOneStudentRecords yearOneStudentRecords) {
        try {
            em.getTransaction().begin();
            em.persist(yearOneStudentRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void updateYearOneStudentRecords(YearOneStudentRecords yearOneStudentRecords) {
        try {
            em.getTransaction().begin();
            em.merge(yearOneStudentRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void deleteYearOneStudentRecords(YearOneStudentRecords yearOneStudentRecords) {
        try {
            em.getTransaction().begin();
            em.remove(yearOneStudentRecords);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<YearOneStudentRecords> listAllYearOneStudentRecords() {
        String sql = "FROM YearOneStudentRecords sr1";
        return em.createQuery(sql).getResultList();
    }


    public List<YearOneStudentRecords> findByFirstName(String fName) {
                String sql = "FROM YearOneStudentRecords sr1 " +
                        "WHERE sr1.firstName = :fN";
                return em.createQuery(sql)
                        .setParameter("fN", fName)
                        .getResultList();
            }

            public Object findById(int id) {
                String sql = "FROM YearOneStudentRecords sr1 WHERE sr1.student_Id = :sr1_Id";
                return em.createQuery(sql)
                        .setParameter("sr1_Id", id)
                        .getSingleResult();
            }

            public List<Departments> listStudentWithDepartmentName() {
                String sql = "SELECT new model.Department(sr1.student_Id, sr1.firstName, d.name) " +
                        "FROM YearOneStudentRecords sr1 " +
                        "JOIN sr1.departments d";
                return em.createQuery(sql, Departments.class).getResultList();
            }
}
