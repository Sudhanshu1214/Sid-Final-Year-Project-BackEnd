package com.example.demo.entity;

public class LoginResponse {
	
	
	private boolean success;

	public LoginResponse(boolean success) {
		super();
		this.success = success;
	}

	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
