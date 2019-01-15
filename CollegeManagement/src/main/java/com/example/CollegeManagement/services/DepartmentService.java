package com.example.CollegeManagement.services;

import com.example.CollegeManagement.entity.Department;

public interface DepartmentService {

    Department insert(Department department);

    Department findById(String departmentId);

    Department update(Department department);

    void delete(String departmentId);
}
