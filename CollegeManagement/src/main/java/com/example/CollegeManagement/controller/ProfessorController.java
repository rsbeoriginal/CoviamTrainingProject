package com.example.CollegeManagement.controller;

import com.example.CollegeManagement.dto.ProfessorDTO;
import com.example.CollegeManagement.entity.Professor;
import com.example.CollegeManagement.services.ProfessorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ProfessorDTO insert(@RequestBody ProfessorDTO professorDTO) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        ProfessorDTO newProfessorDTO = new ProfessorDTO();
        BeanUtils.copyProperties(professorService.insert(professor), newProfessorDTO);
        return newProfessorDTO;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public ProfessorDTO findById(@RequestParam String professorId) {
        ProfessorDTO professordto = new ProfessorDTO();
        BeanUtils.copyProperties(professorService.findById(professorId), professordto);
        return professordto;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ProfessorDTO update(@RequestBody ProfessorDTO professorDTO) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(professorDTO, professor);
        ProfessorDTO newProfessorDTO = new ProfessorDTO();
        BeanUtils.copyProperties(professorService.update(professor), newProfessorDTO);
        return newProfessorDTO;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam String professorId) {
        professorService.delete(professorId);
    }

    @RequestMapping(value = "/rating/{professorId}", method = RequestMethod.GET)
    public Double getRating(@PathVariable("professorId") String professorId) {
        return professorService.getRating(professorId);
    }

    @RequestMapping(value = "/getAllProfessors",method = RequestMethod.GET)
    public Iterable<Professor> getAllProfessors(){
        return professorService.findAll();
    }
}
