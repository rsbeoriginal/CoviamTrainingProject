package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.dto.ProfessorDTO;
import com.example.CollegeManagement.entity.Professor;

public interface ProfessorService {
    public Professor insert(Professor professor);
    public Professor findById(String professorId);
    public Professor update(Professor professor);
    public void delete(String professorId);

    Double getRating(String professorId);
}
