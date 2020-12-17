package model;

import javax.persistence.*;

import java.util.List;
@Entity
public class StudentCourses{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_Id;
    private String courseName;

    @ManyToMany(mappedBy = "studentCourses")
    private List<Lecturers> lecturers;

   // Getter and Setter

    public int getStudentCourse_Id() {
        return studentCourse_Id;
    }

    public void setStudentCourse_Id(int studentCourse_Id) {
        this.studentCourse_Id = studentCourse_Id;
    }

    private int studentCourse_Id;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(int course_Id) {
        this.course_Id = course_Id;
    }
    public List<Lecturers> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturers> lecturers) {
        this.lecturers = lecturers;
    }

    public String toString() {
        return "StudentCourses { course_Id=" + course_Id +
                ", courseName=" + courseName +
                "}";

    }
}