package com.example.CollegeManagement.dto;

import com.example.CollegeManagement.entity.Department;

public class ProfessorDTO {
    private String professorId;
    private String professorName;
//    private String primaryDepartment;
//    private String secondaryDepartment;

    Department primaryDepartment;
    Department secondaryDepartment;

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

//    public String getPrimaryDepartment() {
//        return primaryDepartment;
//    }
//
//    public void setPrimaryDepartment(String primaryDepartment) {
//        this.primaryDepartment = primaryDepartment;
//    }
//
//    public String getSecondaryDepartment() {
//        return secondaryDepartment;
//    }
//
//    public void setSecondaryDepartment(String secondaryDepartment) {
//        this.secondaryDepartment = secondaryDepartment;
//    }


    public Department getPrimaryDepartment() {
        return primaryDepartment;
    }

    public void setPrimaryDepartment(Department primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    public Department getSecondaryDepartment() {
        return secondaryDepartment;
    }

    public void setSecondaryDepartment(Department secondaryDepartment) {
        this.secondaryDepartment = secondaryDepartment;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorId='" + professorId + '\'' +
                ", professorName='" + professorName + '\'' +
                ", primaryDepartment='" + primaryDepartment + '\'' +
                ", secondaryDepartment='" + secondaryDepartment + '\'' +
                '}';
    }
}
