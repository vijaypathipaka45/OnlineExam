package com.posidex.api.dto;

public class LoginDetails {
	
	private String emailId;
	
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDetails [emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	

}
