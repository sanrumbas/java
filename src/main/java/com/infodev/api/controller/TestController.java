package com.infodev.api.controller;

import com.infodev.api.model.Student;
import com.infodev.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    StudentService studentService;

    @GetMapping("/version")
    public String getVersion(){
        return "Version 1.0.0.";
    }

    @PostMapping("/saveStudent")
    public String save(@RequestBody Student student){
        studentService.save(student);
        return "success";
    }

}
