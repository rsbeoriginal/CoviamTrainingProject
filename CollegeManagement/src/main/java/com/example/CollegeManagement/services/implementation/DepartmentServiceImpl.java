package com.example.CollegeManagement.services.implementation;

import com.example.CollegeManagement.entity.Department;
import com.example.CollegeManagement.repository.DepartmentRepository;
import com.example.CollegeManagement.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department insert(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    @Transactional(readOnly = true)
    public Department findById(String departmentId) {
        return departmentRepository.findOne(departmentId);
    }

    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(String departmentId) {
        departmentRepository.delete(departmentId);
    }
}
