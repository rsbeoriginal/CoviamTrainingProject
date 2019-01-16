package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, String> {

    @Query("FROM Subject WHERE professor_id=?1")
    List<Subject> findSubjectByProfessorId(String professorId);

}
