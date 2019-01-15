package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.dto.StudentDTO;
import com.example.CollegeManagement.entity.Student;
import com.example.CollegeManagement.services.StudentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Student insert(@RequestBody StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        return studentServices.insert(student);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam String id){
        studentServices.delete(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Student update(@RequestBody StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        return studentServices.insert(student);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Student findById(@RequestParam String id){
        return studentServices.findById(id);
    }
}
