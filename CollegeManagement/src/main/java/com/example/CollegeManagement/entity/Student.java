package com.example.CollegeManagement.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student {
    public static final String TABLE_NAME = "Student";

    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String studentId;
    private String studentName;
    private int currentSemester;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studenId) {
        this.studentId = studenId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public static String getTableName() {
        return TABLE_NAME;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
