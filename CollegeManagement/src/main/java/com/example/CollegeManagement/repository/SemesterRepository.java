package com.example.CollegeManagement.repository;

import com.example.CollegeManagement.entity.Semester;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SemesterRepository extends CrudRepository<Semester,String>{

    @Query(value = "SELECT AVG(S.marks) FROM Semester S WHERE S.studentId=?1 AND S.semesterNo=?2")
    Double getCGPABySemester(String studentId, int semesterNo);

    @Query(value = "SELECT AVG(S.marks) FROM Semester S WHERE S.studentId=?1")
    Double getCGPA(String studentId);

    @Query("SELECT count(*) FROM Semester S WHERE S.subjectId=?1")
    Integer getNumberOfStudentBySubject(String subjectId);

    @Query("SELECT AVG(S.marks) FROM Semester S WHERE S.subjectId=?1")
    Double getAggregateBySubject(String subjectId);
}
