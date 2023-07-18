package com.example.demo.entity;

public class LoginRequest {

	
	    private String loginusername;
	    private String loginpassword;
		@Override
		public String toString() {
			return "LoginRequest [loginusername=" + loginusername + ", loginpassword=" + loginpassword + "]";
		}
		public String getLoginusername() {
			return loginusername;
		}
		public void setLoginusername(String loginusername) {
			this.loginusername = loginusername;
		}
		public String getLoginpassword() {
			return loginpassword;
		}
		public void setLoginpassword(String loginpassword) {
			this.loginpassword = loginpassword;
		}
		public LoginRequest(String loginusername, String loginpassword) {
			super();
			this.loginusername = loginusername;
			this.loginpassword = loginpassword;
		}
		public LoginRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
	
}
