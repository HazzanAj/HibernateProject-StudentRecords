package model;
import javax.persistence.*;

import java.util.List;

@Entity
public class YearOneStudentRecords{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int YearOneStuRec_Id;
    @ManyToOne
    private Departments departments;

    private String firstName;
    private String lastName;
    private String student_Id;
    private String studentDateOfBirth;
    private String studentHomeAddress;
    private String student1stSemResult;
    private String student2ndSemResult;
    private String student3rdSemResult;
    private String student4thSemResult;
    private String studentFinalGrade;

    //Getter and Setter
    public int getYearOneStuRec_Id() {
        return YearOneStuRec_Id;
    }

    public void setYearOneStuRec_Id(int yearOneStuRec_Id) {
        YearOneStuRec_Id = yearOneStuRec_Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(String student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(String studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentHomeAddress() {
        return studentHomeAddress;
    }

    public void setStudentHomeAddress(String studentHomeAddress) {
        this.studentHomeAddress = studentHomeAddress;
    }

    public String getStudent1stSemResult() {
        return student1stSemResult;
    }

    public void setStudent1stSemResult(String student1stSemResult) {
        this.student1stSemResult = student1stSemResult;
    }

    public String getStudent2ndSemResult() {
        return student2ndSemResult;
    }

    public void setStudent2ndSemResult(String student2ndSemResult) {
        this.student2ndSemResult = student2ndSemResult;
    }

    public String getStudent3rdSemResult() {
        return student3rdSemResult;
    }

    public void setStudent3rdSemResult(String student3rdSemResult) {
        this.student3rdSemResult = student3rdSemResult;
    }

    public String getStudent4thSemResult() { return student4thSemResult; }

    public void setStudent4thSemResult(String student4thSemResult) { this.student4thSemResult = student4thSemResult; }

    public String getStudentFinalGrade() {
        return studentFinalGrade;
    }

    public void setStudentFinalGrade(String studentFinalGrade) {
        this.studentFinalGrade = studentFinalGrade;
    }

    public Departments getDepartments() { return departments; }

    public void setDepartments(Departments departments) { this.departments = departments; }

    public String toString() {
        return " YearOneStudentRecords { YearOneStuRec_Id =" + YearOneStuRec_Id +
                ", firstName =" + firstName +
                ",  lastName =" + lastName +
                ", student_Id =" + student_Id +
                ",studentDateOfBirth =" + studentDateOfBirth +
                ", studentHomeAddress =" + studentHomeAddress +
                ", student1stSemResult =" + student1stSemResult +
                ",student2ndSemResult=" + student2ndSemResult +
                ", student3rdSemResult =" + student3rdSemResult +
                ",student4thSemResult=" + student4thSemResult +
                ", studentFinalGrade=" + studentFinalGrade +
                "}";
    }
}


