package com.example.Students.service;

import com.example.Students.entity.Institution;
import com.example.Students.entity.Student;
import com.example.Students.entity.Student$;
import com.example.Students.repository.InstituteRepo;
import com.example.Students.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    public StudentRepo repo;

    @Autowired
    public InstituteRepo irepo;

    @Autowired
    public JPAStreamer jpastream;
    public Student addStudents(Student student) {
        return repo.save(student);
    }

    public long getCountOfCourses(String courses) {
        Predicate<Student> courseFilter = student -> student.getCourses().contains(courses);
        return jpastream.stream(Student.class)
                .filter(courseFilter)
                .count();
    }

    public List<Student> getListByLocation(String location) {
        return jpastream.stream(Student.class)
                .filter(Student$.address.contains(location))
                .collect(Collectors.toList());
    }

    public List<Student> getNamesByInstitute(String institutename) {
        Optional<Institution> inst = irepo.findByInstitutename(institutename);
        if(i)
    }
}
