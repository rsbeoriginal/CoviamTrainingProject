package com.example.CollegeManagement.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name=Professor.TABLE_NAME)
public class Professor {
    public static final String TABLE_NAME="PROFESSOR";
    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name="uuid",strategy = "uuid2")
    private String professorId;
    private String professorName;
//    private String primaryDepartment;
//    private String secondaryDepartment;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "primary_department_id")
    Department primaryDepartment;

    @ManyToOne
    @JoinColumn(name = "secondary_department_id")
    Department secondaryDepartment;

//    public String getSecondaryDepartment() {
//        return secondaryDepartment;
//    }
//
//    public void setSecondaryDepartment(String secondaryDepartment) {
//        this.secondaryDepartment = secondaryDepartment;
//    }

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


    public static String getTableName() {
        return TABLE_NAME;
    }

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
        return "Professor{" +
                "professorId='" + professorId + '\'' +
                ", professorName='" + professorName + '\'' +
                ", primaryDepartment='" + primaryDepartment + '\'' +
                ", secondaryDepartment='" + secondaryDepartment + '\'' +
                '}';
    }
}
