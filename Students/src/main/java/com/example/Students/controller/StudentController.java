package com.example.Students.controller;

import com.example.Students.entity.Institution;
import com.example.Students.entity.Student;
import com.example.Students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentService service;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return service.addStudents(student);
    }

    @GetMapping("/{course}")
    public long getCountOfCourse(@PathVariable String course){
        return service.getCountOfCourses(course);
    }

    @GetMapping("/location/{location}")
    public List<Student> getListByLocation(@PathVariable String location){
        return service.getListByLocation(location);
    }

    @GetMapping("/studentinfo/{institutename}")
    public List<Student> getNameByInstitution(@PathVariable String institutename){
        return service.getNamesByInstitute(institutename);
    }

}
