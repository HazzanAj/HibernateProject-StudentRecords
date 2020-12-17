package repository;

import model.Departments;

import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryDepartments {

    private EntityManager dept;

    public RepositoryDepartments() {
        dept= DBUtil.getEntityManager();
    }

    public void saveDepartments (Departments departments) {
        try {
            dept.getTransaction().begin();
            dept.persist(departments);
            dept.getTransaction().commit();
        } catch (Exception ex) {
            dept.getTransaction().rollback();
        }
    }

    public void deleteDepartments(Departments departments) {
        try {
            dept.getTransaction().begin();
            dept.remove(departments);
            dept.getTransaction().commit();
        } catch (Exception ex) {
            dept.getTransaction().rollback();
        }
    }
    public void updateDepartments(Departments departments) {
        try {
            dept.getTransaction().begin();
            dept.remove(departments);
            dept.getTransaction().commit();
        } catch (Exception ex) {
            dept.getTransaction().rollback();
        }
    }

    public List<Departments> listAllDepartments() {
        String sql = "FROM Departments dept";
        return dept.createQuery(sql).getResultList();
    }

    public Departments findById(int id) {
        String sql = "FROM Departments d WHERE d.department_Id = :dId";
        return dept.createQuery(sql, Departments.class).setParameter("dId", id).getSingleResult();
    }
}
