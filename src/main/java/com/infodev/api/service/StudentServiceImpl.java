package com.infodev.api.service;

import com.infodev.api.model.Student;
import com.infodev.api.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

}
