package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Semester;
import org.springframework.data.repository.CrudRepository;

public interface SemesterRepository
    extends CrudRepository<Semester,String>{
}
