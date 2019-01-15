package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.dto.SemesterDTO;
import com.example.CollegeManagement.entity.Semester;
import com.example.CollegeManagement.services.SemesterServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semester")
public class SemsterController {
    @Autowired
    SemesterServices semesterService ;

    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public void update(@RequestBody SemesterDTO semesterdto)
    {
        Semester semester=new Semester();
        BeanUtils.copyProperties(semesterdto,semester);
        semesterService.update(semester);
    }
    @RequestMapping(value ="/insert",method=RequestMethod.POST)
    public Semester insert(@RequestBody SemesterDTO semesterdto)
    {
        Semester semester=new Semester();
        BeanUtils.copyProperties(semesterdto,semester);
        return semesterService.insert(semester);

    }
    @RequestMapping(value ="/findById",method=RequestMethod.GET)
    public SemesterDTO findById(@RequestParam String id)
    {
        Semester semester = semesterService.findById(id);
        SemesterDTO semesterdto = new SemesterDTO();
        BeanUtils.copyProperties(semester, semesterdto);
        return semesterdto;
    }
    @RequestMapping(value ="/delete",method=RequestMethod.DELETE)
    public void delete(@RequestParam String id) {
        semesterService.delete(id);
    }

}

