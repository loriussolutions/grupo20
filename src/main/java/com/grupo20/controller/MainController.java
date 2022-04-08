package com.grupo20.controller;

import com.grupo20.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    @ResponseBody
    public ResponseEntity list() {

        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }

    @RequestMapping("/student/save")
    public ResponseEntity save(@RequestParam String name){

        service.save(name);

        return new ResponseEntity<>("Student successfully created.",HttpStatus.OK);
    }
}
