package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;

public class ClientLight {

	@Column
	private Long id;
	@Column
	private String name;
	
	public ClientLight(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ClientLight() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
	