package model;

import javax.persistence.*;

import java.util.List;


@Entity
public class Lecturers{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lecturer_Id;
    private String lecturerName;
    @ManyToMany()
    private List<StudentCourses> studentCourses;


    // Getter and Setter
    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getLecturer_Id() {
        return lecturer_Id;
    }

    public void setLecturer_Id(int lecturer_Id) {
        this.lecturer_Id = lecturer_Id;
    }

    public List<StudentCourses> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourses> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public String toString() {
        return "Lecturers{lecturer_Id=" + lecturer_Id +
                ", lecturerName=" + lecturerName +
                "}";

    }
}