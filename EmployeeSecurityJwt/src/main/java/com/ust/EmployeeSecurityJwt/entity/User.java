/**
 * 
 */
package com.ust.EmployeeSecurityJwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "user_tbl")
public class User {

	@Id
	private int id;
	private String name;
	private String password;
	private String email;
	private String phno;
	public User() {
		
	}
	public User(int id, String name, String password, String email, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	
	
	
	
}
