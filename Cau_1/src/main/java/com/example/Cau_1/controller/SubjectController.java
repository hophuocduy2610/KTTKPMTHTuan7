package com.example.Cau_1.controller;

import com.example.Cau_1.entity.Subject;
import com.example.Cau_1.service.SubjectRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SubjectController {
    @Autowired
    SubjectRepository subjectRepository;

    @PostMapping("/add")
    public Subject addSubject(@RequestBody Subject subject){
        if(subject!=null){
            subjectRepository.save(subject);
            return subject;
        }
        return null;
    }
    @GetMapping("/getSubject/{id}")
    public Subject getSubject(@PathVariable("id") String subId){
        return subjectRepository.getSubject(subId);
    }

}
