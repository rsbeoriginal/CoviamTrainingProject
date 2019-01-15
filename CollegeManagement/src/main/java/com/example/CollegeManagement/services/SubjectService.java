package com.example.CollegeManagement.services;

import com.example.CollegeManagement.entity.Subject;

public interface SubjectService {
    public Subject insert(Subject subject);
    public void delete(String id);
    public Subject update(Subject subject);
    public Subject findById(String id);
}
