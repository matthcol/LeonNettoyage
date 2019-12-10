package com.formation.LeonNettoyage.dto;

import com.formation.LeonNettoyage.persistence.entities.Status;

public class AttemptFull {

	
	public AttemptFull(Long id, Long idContract, Status status) {
		super();
		this.id = id;
		this.idContract = idContract;
		this.status = status;
		
	}
	
	
	private Long id;


	private Long idContract;
	

	private Status status;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdContract() {
		return idContract;
	}


	public void setIdContract(Long idContract) {
		this.idContract = idContract;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
