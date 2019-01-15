package com.example.CollegeManagement.dto;

public class SemesterDTO {
    private String semesterId;

    private int semesterNo;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    private String studentId;
    private String subjectId;
    private Integer marks;
}
