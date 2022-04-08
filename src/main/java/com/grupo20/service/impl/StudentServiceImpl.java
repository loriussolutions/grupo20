package com.grupo20.service.impl;

import com.grupo20.model.Student;
import com.grupo20.repository.StudentRepository;
import com.grupo20.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
	return repository.findAll();
    }

    @Override
    public void save(String studentName) {
        if(studentName == null){
            throw new IllegalArgumentException("Student name must be not empty");
        }
        repository.save(new Student(studentName));
    }
}
