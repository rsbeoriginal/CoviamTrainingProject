package com.example.CollegeManagement.services;

import com.example.CollegeManagement.entity.Student;

public interface StudentServices {
    Student insert(Student student);

    void delete(String id);

    Student update(Student student);

    Student findById(String id);

    Iterable<Student> findAll();
}
