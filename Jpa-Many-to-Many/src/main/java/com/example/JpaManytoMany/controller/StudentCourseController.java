package com.example.JpaManytoMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaManytoMany.entity.Courses;
import com.example.JpaManytoMany.entity.Students;
import com.example.JpaManytoMany.repository.Courserepo;
import com.example.JpaManytoMany.repository.Studentrepo;

@RestController
@RequestMapping("/students/courses")
public class StudentCourseController {

	@Autowired
	private Studentrepo repo;
	
	
	
	@PostMapping
	public Students saveStudentWithCourse(@RequestBody Students student) {
		return repo.save(student);
	}
	
	@GetMapping
	public List<Students> findAllStudents(){
		return repo.findAll();
	}
	
	@GetMapping("/{studentid}")
	public Students findStudent(@PathVariable long id) {
		return repo.findById(id).orElse(null);
	}
	
	@GetMapping("/find/{name}")
	public List<Students> findStudentByName(@PathVariable String name){
		return repo.findByNameContaining(name);
	}
	
//	@GetMapping("/search/{price}")
//	public List<Courses> findCourselessthanprice(@PathVariable double price) {
//		return crepo.findlessthanprice(price);
//	}
	
}
