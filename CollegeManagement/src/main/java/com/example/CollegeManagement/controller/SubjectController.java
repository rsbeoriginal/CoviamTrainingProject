package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.dto.SubjectDTO;
import com.example.CollegeManagement.entity.Subject;
import com.example.CollegeManagement.services.SubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    Subject insert(@RequestBody SubjectDTO subjectDTO) {
        Subject subject = new Subject();
        //System.out.println(subjectDTO);
        BeanUtils.copyProperties(subjectDTO, subject);
        //Department department=departmentService.findById(subjectDTO.getDepartmentId());
        //subject.setDepartment(department);
        Subject subjectCreated = subjectService.insert(subject);
        return subjectCreated;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    void delete(@RequestParam String id) {

        subjectService.delete(id);

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    SubjectDTO findById(@RequestParam String id) {
        SubjectDTO subjectCreatedDTO = new SubjectDTO();
        Subject subjectCreated = subjectService.findById(id);
        BeanUtils.copyProperties(subjectCreated, subjectCreatedDTO);
        return subjectCreatedDTO;

    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    Subject updateRecord(@RequestBody SubjectDTO subjectDTO) {
        Subject subject = new Subject();
        System.out.println(subjectDTO);
        BeanUtils.copyProperties(subjectDTO, subject);
        Subject subjectCreated = subjectService.update(subject);
        return subjectCreated;
    }
}

