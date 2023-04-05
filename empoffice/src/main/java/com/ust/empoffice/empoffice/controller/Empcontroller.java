package com.ust.empoffice.empoffice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.empoffice.empoffice.model.Employeedetails;
import com.ust.empoffice.empoffice.service.Empservice;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class Empcontroller {

	@Autowired
	private Empservice empservice;
	
	@PostMapping("/adddetails")
	public Employeedetails addEmp(@RequestBody Employeedetails emp) {
		return empservice.createEmp(emp);
	}
	
	@GetMapping("/emps")
	public List<Employeedetails> showEmp(){
		return empservice.getAllEmps();
	}
	
	@GetMapping("/emp/{id}")
	public Employeedetails showEmpById(@PathVariable int id) {
		return empservice.getEmpById(id);
	}
	
	@PutMapping("/updateemp/{id}")
	public Employeedetails updateEmp(@RequestBody Employeedetails emp) {
		return empservice.updateEmpp(emp);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmp(@PathVariable int id) {
		return empservice.deleteEmpp(id);
	}
	
}
