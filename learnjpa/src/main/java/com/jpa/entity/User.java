package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
	//JPA expects default const.
	public User() {
		super();
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	
}
