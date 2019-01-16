package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.entity.Professor;
import com.example.CollegeManagement.entity.Subject;
import com.example.CollegeManagement.repository.ProfessorRepository;
import com.example.CollegeManagement.repository.SemesterRepository;
import com.example.CollegeManagement.repository.SubjectRepository;
import com.example.CollegeManagement.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    SemesterRepository semesterRepository;

    @Override
    @Transactional(readOnly = false)
    public Professor insert(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public Professor findById(String professorId) {
        return professorRepository.findOne(professorId);

    }

    @Override
    public Professor update(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public void delete(String professorId) {
        professorRepository.delete(professorId);
    }

    @Override
    public Double getRating(String professorId) {
        List<Subject> subjects = subjectRepository.findSubjectByProfessorId(professorId);
        Integer totalStudents = 0;
        Double rating = 0d;
        for (Subject subject : subjects) {
            //get no of students
            Integer students = semesterRepository.getNumberOfStudentBySubject(subject.getSubjectId());
            totalStudents += students;
            //get aggregate of subject
            Double aggregateSubject = semesterRepository.getAggregateBySubject(subject.getSubjectId());
            //apply formula
            rating += (students * aggregateSubject);
        }
        rating = rating / totalStudents;
        return rating;
    }

}
