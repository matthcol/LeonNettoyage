package com.formation.LeonNettoyage.dto;

public class NewUser {

	public NewUser(String userType, String email, String password) {
		this.userType = userType;
		this.email = email;
		this.password = password;
	}
	
	public NewUser() {
		
	}
	
	
	private String userType;
	
	private String email;
	
	private String password;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
