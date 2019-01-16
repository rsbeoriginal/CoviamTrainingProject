package com.example.CollegeManagement.services;

import com.example.CollegeManagement.dto.ProfessorDTO;
import com.example.CollegeManagement.entity.Professor;

public interface ProfessorService {
    Professor insert(Professor professor);

    Professor findById(String professorId);

    Professor update(Professor professor);

    void delete(String professorId);

    Double getRating(String professorId);

    Iterable<Professor> findAll();
}
