package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.dto.ProfessorDTO;
import com.example.CollegeManagement.entity.Professor;
import com.example.CollegeManagement.repository.ProfessorRepository;
import com.example.CollegeManagement.services.implementation.ProfessorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;
    @Override
    @Transactional(readOnly = false)
    public void insert(Professor professor) {
        //Professor professor1=professorRepository.findOne(professor.getProfessorId());
//        employee.setDepartment(department.get());
        professorRepository.save(professor);
    }

    @Override
    public Professor findById(String professorId) {
        return professorRepository.findOne(professorId);

    }

    @Override

    public void update(Professor professor) {
        professorRepository.save(professor);
    }

    @Override
    public void delete(String professorId) {
        professorRepository.delete(professorId);
    }

}
