package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,String> {
}
