package com.formation.leon.nettoyage.dto;

public class ClientPassword {
	
	private Long id;
	private String password;

	public ClientPassword(Long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
