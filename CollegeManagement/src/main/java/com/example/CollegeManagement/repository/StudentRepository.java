package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
}
