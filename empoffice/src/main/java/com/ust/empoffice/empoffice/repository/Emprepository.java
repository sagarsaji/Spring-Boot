package com.ust.empoffice.empoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.empoffice.empoffice.model.Employeedetails;

@Repository
public interface Emprepository extends JpaRepository<Employeedetails,Integer> {

}
