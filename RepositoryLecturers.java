package repository;

import model.Lecturers;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryLecturers {

    private EntityManager lec;

    public RepositoryLecturers() {
        lec = DBUtil.getEntityManager();
    }

    public void saveLecturer(Lecturers Lecturer) {
        try {
            lec.getTransaction().begin();
            lec.persist(Lecturer);
            lec.getTransaction().commit();
        } catch (Exception ex) {
            lec.getTransaction().rollback();
        }
    }

    public void updateLecturer(Lecturers Lecturer) {
        try {
            lec.getTransaction().begin();
            lec.merge(Lecturer);
            lec.getTransaction().commit();
        } catch (Exception ex) {
            lec.getTransaction().rollback();
        }
    }

    public void deleteLecturer(Lecturers Lecturer) {
        try {
            lec.getTransaction().begin();
            lec.remove(Lecturer);
            lec.getTransaction().commit();
        } catch (Exception ex) {
            lec.getTransaction().rollback();
        }
    }
    public List<Lecturers> listAllLecturer() {
        String sql = "FROM Lecturer lec";
        return lec.createQuery(sql).getResultList();
    }
}