package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.entity.Subject;
import com.example.CollegeManagement.repository.SubjectRepository;
import com.example.CollegeManagement.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    @Transactional(readOnly = false)
    public Subject insert(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(String id) {
        subjectRepository.delete(id);

    }

    @Override
    public Subject update(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject findById(String id) {
        return subjectRepository.findOne(id);
    }

    @Override
    public Iterable<Subject> findAll() {
        return subjectRepository.findAll();
    }
}
