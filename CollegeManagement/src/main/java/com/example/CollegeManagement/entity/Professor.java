package com.example.CollegeManagement.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name=Professor.TABLE_NAME)
public class Professor {
    public static final String TABLE_NAME="PROFESSOR";
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    private String professorId;
    private String professorName;
    private String primaryDepartment;
    private String secondaryDepartment;

    public String getSecondaryDepartment() {
        return secondaryDepartment;
    }

    public void setSecondaryDepartment(String secondaryDepartment) {
        this.secondaryDepartment = secondaryDepartment;
    }

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

    public String getPrimaryDepartment() {
        return primaryDepartment;
    }

    public void setPrimaryDepartment(String primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorId='" + professorId + '\'' +
                ", professorName='" + professorName + '\'' +
                ", primaryDepartment='" + primaryDepartment + '\'' +
                ", secondaryDepartment='" + secondaryDepartment + '\'' +
                '}';
    }
}
