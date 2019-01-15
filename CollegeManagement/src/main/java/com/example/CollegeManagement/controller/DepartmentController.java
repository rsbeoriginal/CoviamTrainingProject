package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.dto.DepartmentDTO;
import com.example.CollegeManagement.entity.Department;
import com.example.CollegeManagement.services.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/insert")
    public void insert(@RequestBody DepartmentDTO departmentDTO){
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        departmentService.insert(department);
    }

    @GetMapping("/findById/{departmentId}")
    public DepartmentDTO findById(@PathVariable("departmentId") String departmentId){
        DepartmentDTO departmentDTO = new DepartmentDTO();
        BeanUtils.copyProperties(departmentService.findById(departmentId),departmentDTO);
        return  departmentDTO;
    }

    @PutMapping("/update")
    public void update(@RequestBody DepartmentDTO departmentDTO){
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        departmentService.update(department);
    }

    @DeleteMapping("/delete/{departmentId}")
    public void delete(@PathVariable("departmentId") String departmentId){
        departmentService.delete(departmentId);
    }
}
