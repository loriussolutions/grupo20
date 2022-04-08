package com.grupo20.service;

import com.grupo20.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    void save(String studentName);
}
