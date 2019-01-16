package com.example.CollegeManagement.dto;

import com.example.CollegeManagement.entity.Department;

public class StudentDTO {
    private String studentId;
    private String studentName;
    private int currentSemester;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }
}
