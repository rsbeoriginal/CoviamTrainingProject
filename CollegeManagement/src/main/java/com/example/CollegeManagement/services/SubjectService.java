package com.example.CollegeManagement.services;

import com.example.CollegeManagement.entity.Subject;

public interface SubjectService {
    Subject insert(Subject subject);

    void delete(String id);

    Subject update(Subject subject);

    Subject findById(String id);
}
