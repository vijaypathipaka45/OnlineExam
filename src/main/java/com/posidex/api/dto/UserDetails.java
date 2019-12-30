package com.posidex.api.dto;

public class UserDetails {
	
	private String userName;
	
	private String emailId;
	
	private String password;
	
	private String firstName;
	
	private String middleNmae;
	
	private String lastName;
	
	private String image;
	
	private String message;
	
	public String getMessage() {
		
		return message;
	}
	
	public void setMessage(String message) {
		
		this.message=message;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleNmae() {
		return middleNmae;
	}

	public void setMiddleNmae(String middleNmae) {
		this.middleNmae = middleNmae;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", emailId=" + emailId + ", password=" + password + ", firstName="
				+ firstName + ", middleNmae=" + middleNmae + ", lastName=" + lastName + ", image=" + image +", message="+message+"]";
	}
	


}
