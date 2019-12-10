package com.formation.LeonNettoyage.dto.jwt;

public class JwtUserResponse {

	public JwtUserResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	
	private String jwtToken;
		
		
	public String getjwtToken() {
		return jwtToken;
	}


	public void setToken(String token) {
		this.jwtToken = token;
	}



	
	
}
