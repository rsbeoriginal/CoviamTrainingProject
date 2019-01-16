package com.example.CollegeManagement.dto;

import com.example.CollegeManagement.entity.Department;
import com.example.CollegeManagement.entity.Professor;

public class SubjectDTO {
    private String subjectId;
    private String subjectName;
    private Department department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
