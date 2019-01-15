package com.example.CollegeManagement.services;

import com.example.CollegeManagement.entity.Semester;

public interface SemesterServices
{
    Semester insert(Semester semester);
    void delete(String id);
    void update(Semester semester);
    Semester findById(String id);

    Integer getCurrentSemesterCGPA(String studentId);
}
