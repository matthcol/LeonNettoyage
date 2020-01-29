package com.formation.leon.nettoyage.dto;

import java.util.Date;

import com.formation.leon.nettoyage.persistence.entities.Status;

public class AttemptFull {

	
	
	public AttemptFull() {
	}
	
	private Long id;

	private Date date;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
