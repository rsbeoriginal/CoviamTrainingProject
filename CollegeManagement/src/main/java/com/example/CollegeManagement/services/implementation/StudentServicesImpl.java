package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.entity.Student;
import com.example.CollegeManagement.repository.StudentRepository;
import com.example.CollegeManagement.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class StudentServicesImpl implements StudentServices {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student insert(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(String id) {
        studentRepository.delete(id);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(String id) {
        return studentRepository.findOne(id);
    }

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }
}
