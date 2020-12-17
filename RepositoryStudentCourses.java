package repository;

import model.StudentCourses;

import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryStudentCourses {

    private EntityManager em;

    public RepositoryStudentCourses() {
        em= DBUtil.getEntityManager();
    }

    public void saveStudentCourses (StudentCourses studentCourses) {
        try {
            em.getTransaction().begin();
            em.persist(studentCourses);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void deleteStudentCourses (StudentCourses studentCourses) {
        try {
            em.getTransaction().begin();
            em.remove( studentCourses);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }
    public void updateDepartments(StudentCourses studentCourses) {
        try {
            em.getTransaction().begin();
            em.remove( studentCourses);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<StudentCourses> listAllDepartments() {
        String sql = "FROM StudentCourses em";
        return em.createQuery(sql).getResultList();
    }

    public StudentCourses findById(int id) {
        String sql = "FROM StudentCourse s WHERE s.course_Id = :scId";
        return em.createQuery(sql, StudentCourses.class).setParameter("scId", id).getSingleResult();
    }
}
