package com.example.CollegeManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name=Subject.TABLE_NAME)
public class Subject {

    public static final String TABLE_NAME="SUBJECT";



    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    public String subjectId;
    public String subjectName;
    public String departmentId;
    //public String professorId;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

//    public String getProfessorId() {
//        return professorId;
//    }
//
//    public void setProfessorId(String professorId) {
//        this.professorId = professorId;
//    }

    public static String getTableName() {
        return TABLE_NAME;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

//    @Override
//    public String toString() {
//        return "Subject{" +
//                "subjectId='" + subjectId + '\'' +
//                ", subjectName='" + subjectName + '\'' +
//                ", departmentId='" + departmentId + '\'' +
//                ", professorId='" + professorId + '\'' +
//                '}';
//    }
}
