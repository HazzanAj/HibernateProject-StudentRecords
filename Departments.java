package model;

import javax.persistence.*;

import java.util.List;


@Entity
public class Departments{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_Id;
    private String nameOfDepartments;
    @OneToMany(mappedBy = "departments")
    private List<YearOneStudentRecords> yearOneStudentRecords;
    @OneToMany(mappedBy = "departments")
    private List<YearTwoStudentRecords> yearTwoStudentRecords;
    @OneToMany(mappedBy = "departments")
    private List<YearThreeStudentRecords> yearThreeStudentRecords;
    @OneToMany(mappedBy = "departments")
    private List<YearFourStudentRecords> yearFourStudentRecords;

    // Getters and setters
    public int getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(int department_Id) {
        this.department_Id = department_Id;
    }

    public String getNameOfDepartments() {
        return nameOfDepartments;
    }
    public void setNameOfDepartments(String nameOfDepartments) {
        this.nameOfDepartments = nameOfDepartments;
    }
    public List<YearOneStudentRecords> getYearOneStudentRecords() {
        return yearOneStudentRecords;
    }

    public void setYearOneStudentRecords(List<YearOneStudentRecords> yearOneStudentRecords) {
        this.yearOneStudentRecords = yearOneStudentRecords;
    }

    public List<YearTwoStudentRecords> getYearTwoStudentRecords() {
        return yearTwoStudentRecords;
    }

    public void setYearTwoStudentRecords(List<YearTwoStudentRecords> yearTwoStudentRecords) {
        this.yearTwoStudentRecords = yearTwoStudentRecords;
    }

    public List<YearThreeStudentRecords> getYearThreeStudentRecords() {
        return yearThreeStudentRecords;
    }

    public void setYearThreeStudentRecords(List<YearThreeStudentRecords> yearThreeStudentRecords) {
        this.yearThreeStudentRecords = yearThreeStudentRecords;
    }

    public List<YearFourStudentRecords> getYearFourStudentRecords() {
        return yearFourStudentRecords;
    }

    public void setYearFourStudentRecords(List<YearFourStudentRecords> yearFourStudentRecords) {
        this.yearFourStudentRecords = yearFourStudentRecords;
    }

    public String toString() {
        return "Departments{department_Id=" + department_Id +
                ", nameOfDepartments=" + nameOfDepartments +
                "}";
    }

}