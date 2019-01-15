package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.dto.ProfessorDTO;
import com.example.CollegeManagement.entity.Professor;
import com.example.CollegeManagement.services.implementation.ProfessorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public void insert(@RequestBody ProfessorDTO professorDTO)
    {
        Professor professor= new Professor();
        BeanUtils.copyProperties(professorDTO,professor);
        professorService.insert(professor);

    }
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public ProfessorDTO findById(@RequestParam String professorId)
    {
        ProfessorDTO professordto=new ProfessorDTO();
        BeanUtils.copyProperties(professorService.findById(professorId),professordto);
        System.out.println(professordto);
        return professordto;
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public void update(@RequestBody ProfessorDTO professorDTO)
    {
        Professor professor= new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        professorService.update(professor);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam String professorId)
    {

        professorService.delete(professorId);
    }




}
