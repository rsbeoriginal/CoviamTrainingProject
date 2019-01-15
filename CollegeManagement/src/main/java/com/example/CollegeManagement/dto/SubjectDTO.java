package com.example.CollegeManagement.dto;


import com.example.CollegeManagement.entity.Professor;

public class SubjectDTO {
    public String subjectId;
    public String subjectName;
    public String departmentId;
    //public String professorId;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    //    public String getProfessorId() {
//        return professorId;
//    }
//
//    public void setProfessorId(String professorId) {
//        this.professorId = professorId;
//    }
//
//    @Override
//    public String toString() {
//        return "SubjectDTO{" +
//                "subjectId='" + subjectId + '\'' +
//                ", subjectName='" + subjectName + '\'' +
//                ", departmentId='" + departmentId + '\'' +
//                ", professorId='" + professorId + '\'' +
//                '}';
//    }
}
