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
    public DepartmentDTO insert(@RequestBody DepartmentDTO departmentDTO){
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        DepartmentDTO newDepartmentDTO = new DepartmentDTO();
        BeanUtils.copyProperties(departmentService.insert(department),newDepartmentDTO);
        return newDepartmentDTO;
    }

    @GetMapping("/findById/{departmentId}")
    public DepartmentDTO findById(@PathVariable("departmentId") String departmentId){
        DepartmentDTO departmentDTO = new DepartmentDTO();
        BeanUtils.copyProperties(departmentService.findById(departmentId),departmentDTO);
        return  departmentDTO;
    }

    @PutMapping("/update")
    public DepartmentDTO update(@RequestBody DepartmentDTO departmentDTO){
        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        DepartmentDTO newDepartmentDTO = new DepartmentDTO();
        BeanUtils.copyProperties(departmentService.update(department),newDepartmentDTO);
        return newDepartmentDTO;
    }

    @DeleteMapping("/delete/{departmentId}")
    public void delete(@PathVariable("departmentId") String departmentId){
        departmentService.delete(departmentId);
    }
}
