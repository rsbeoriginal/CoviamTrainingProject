package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.dto.ProfessorDTO;
import com.example.CollegeManagement.entity.Professor;

public interface ProfessorService {
    public void insert(Professor employee);
    public Professor findById(String employee_id);
    public void update(Professor employee);
    public void delete(String employee_id);
}
