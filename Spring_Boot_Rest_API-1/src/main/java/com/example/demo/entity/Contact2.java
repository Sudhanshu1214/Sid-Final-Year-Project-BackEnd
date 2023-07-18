package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Contact2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int id;
	public String name;
	public String email;
	public String mess;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMess() {
		return mess;
	}
	public void setMess(String mess) {
		this.mess = mess;
	}
	@Override
	public String toString() {
		return "Contact2 [id=" + id + ", name=" + name + ", email=" + email + ", mess=" + mess + "]";
	}
	public Contact2(int id, String name, String email, String mess) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mess = mess;
	}
	public Contact2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
