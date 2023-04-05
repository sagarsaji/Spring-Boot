/**
 * 
 */
package com.example.JpaManytoMany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="COURSE_TBL")
public class Courses {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String abbrevation;
	private int modules;
	private double fee;
	
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	@JsonBackReference
	private Set<Students> students;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public int getModules() {
		return modules;
	}

	public void setModules(int modules) {
		this.modules = modules;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Set<Students> getStudents() {
		return students;
	}

	public void setStudents(Set<Students> students) {
		this.students = students;
	}

	public Courses(long id, String title, String abbrevation, int modules, double fee, Set<Students> students) {
		
		this.id = id;
		this.title = title;
		this.abbrevation = abbrevation;
		this.modules = modules;
		this.fee = fee;
		this.students = students;
	}
	
	public Courses() {
		
	}
	
}
