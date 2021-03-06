package com.example.CollegeManagement.services;

import com.example.CollegeManagement.entity.Semester;

public interface SemesterServices {
    Semester insert(Semester semester);

    void delete(String id);

    Semester update(Semester semester);

    Semester findById(String id);

    Double getCurrentSemesterCGPA(String studentId);

    Double getCGPA(String studentId);
}
