package com.example.CollegeManagement.dto;

import com.example.CollegeManagement.entity.Student;
import com.example.CollegeManagement.entity.Subject;

public class SemesterDTO {
    private String semesterId;

    private int semesterNo;
//    private String studentId;
//    private String subjectId;
    private Integer marks;

    private Student student;

    private Subject subject;

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public int getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(int semesterNo) {
        this.semesterNo = semesterNo;
    }

//    public String getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getSubjectId() {
//        return subjectId;
//    }
//
//    public void setSubjectId(String subjectId) {
//        this.subjectId = subjectId;
//    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
