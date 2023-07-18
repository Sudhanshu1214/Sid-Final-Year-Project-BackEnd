package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	private String username;
	private String useremail;
	private int userpassword;
	private String useraddress;
	

	
	@Override
	public String toString() {
		return "Contact [userId=" + userId + ", username=" + username + ", useremail=" + useremail + ", userpassword="
				+ userpassword + ", useraddress=" + useraddress + "]";
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int userId, String username, String useremail, int userpassword, String useraddress) {
		super();
		this.userId = userId;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.useraddress = useraddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public int getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(int userpassword) {
		this.userpassword = userpassword;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
	
	
	
}
