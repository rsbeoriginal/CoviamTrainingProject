package com.example.CollegeManagement.dto;

public class StudentDTO {
    private String studentId;
    private String studentName;
    private String departmentId;
    private int currentSemester;

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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }
}
