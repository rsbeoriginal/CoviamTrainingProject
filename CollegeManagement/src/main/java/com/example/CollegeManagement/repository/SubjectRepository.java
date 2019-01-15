package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,String> {
}
