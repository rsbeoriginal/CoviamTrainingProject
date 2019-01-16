package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Semester;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SemesterRepository extends CrudRepository<Semester,String>{

    @Query(value = "SELECT AVG(marks) FROM Semester WHERE student_id=?1 AND semesterNo=?2")
    Double getCGPABySemester(String studentId, int semesterNo);

    @Query(value = "SELECT AVG(marks) FROM Semester WHERE student_id=?1")
    Double getCGPA(String studentId);

    @Query("SELECT count(*) FROM Semester WHERE subject_id=?1")
    Integer getNumberOfStudentBySubject(String subjectId);

    @Query("SELECT AVG(marks) FROM Semester WHERE subject_id=?1")
    Double getAggregateBySubject(String subjectId);
}
