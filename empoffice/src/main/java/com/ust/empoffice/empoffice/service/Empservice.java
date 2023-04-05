package com.ust.empoffice.empoffice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.empoffice.empoffice.model.Employeedetails;
import com.ust.empoffice.empoffice.repository.Emprepository;
@Service
public class Empservice {
	
	@Autowired
	private Emprepository repo;

	public Employeedetails createEmp(Employeedetails emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	public List<Employeedetails> getAllEmps() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Employeedetails getEmpById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public Employeedetails updateEmpp(Employeedetails emp) {
		// TODO Auto-generated method stub
		Employeedetails oldemp = null;
		Optional<Employeedetails> optionalemp = repo.findById(emp.getId());
		if(optionalemp.isPresent()) {
			oldemp = optionalemp.get();
			oldemp.setEmail(emp.getEmail());
			oldemp.setDomain(emp.getDomain());
			oldemp.setExperience(emp.getExperience());
			repo.save(oldemp);
		}
		else {
			return new Employeedetails();
		}
		return oldemp;
	}


	public String deleteEmpp(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "details deleted";
	}

}
