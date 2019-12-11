package com.formation.LeonNettoyage.dto;

import com.formation.LeonNettoyage.persistence.entities.Status;

public class AttemptLight {

	public AttemptLight(Long id, Status status) {
		super();
		this.id = id;
		this.status = status;
	}
	
	
	public AttemptLight() {
	}
	
	
	private Long id;
	
	private Status status;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
