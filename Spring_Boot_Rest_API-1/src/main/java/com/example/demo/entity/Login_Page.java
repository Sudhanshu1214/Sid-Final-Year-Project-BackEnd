package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Register_Data")
public class Login_Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int lid;
	private String lname;
	private String lemail;
	private String lpass;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public Login_Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login_Page(int lid, String lname, String lemail, String lpass) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lemail = lemail;
		this.lpass = lpass;
	}
	@Override
	public String toString() {
		return "Login_Page [lid=" + lid + ", lname=" + lname + ", lemail=" + lemail + ", lpass=" + lpass + "]";
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLemail() {
		return lemail;
	}
	public void setLemail(String lemail) {
		this.lemail = lemail;
	}
	public String getLpass() {
		return lpass;
	}
	public void setLpass(String lpass) {
		this.lpass = lpass;
	}
	
}
