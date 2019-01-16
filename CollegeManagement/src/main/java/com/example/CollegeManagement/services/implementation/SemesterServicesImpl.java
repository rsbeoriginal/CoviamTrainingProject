package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.entity.Semester;
import com.example.CollegeManagement.entity.Student;
import com.example.CollegeManagement.repository.SemesterRepository;
import com.example.CollegeManagement.repository.StudentRepository;
import com.example.CollegeManagement.services.SemesterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class SemesterServicesImpl implements SemesterServices {

    @Autowired
    private SemesterRepository semesterRepository;

    @Autowired
    private StudentRepository studentRepository;


    @Override
    @Transactional(readOnly = false)
    public Semester insert(Semester semester) {

        semesterRepository.save(semester);
        return semester;

    }

    @Override
    public void delete(String id) {
        semesterRepository.delete(id);
    }

    @Override
    public Semester update(Semester semester) {
        return semesterRepository.save(semester);
    }

    @Override
    @Transactional(readOnly = true)
    public Semester findById(String id) {
        return semesterRepository.findOne(id);
    }

    @Override
    public Double getCurrentSemesterCGPA(String studentId) {
        Student student = studentRepository.findOne(studentId);

        return semesterRepository.getCGPABySemester(studentId, student.getCurrentSemester());
    }

    @Override
    public Double getCGPA(String studentId) {
        return semesterRepository.getCGPA(studentId);
    }

}


