package com.formation.LeonNettoyage.dto;

import java.util.Date;

import com.formation.LeonNettoyage.persistence.entities.Status;

public class NewAttempt {
	
	private Long id;

	private Date date;

	private Long idContract;
	

	private Long idStatus;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Long getIdContract() {
		return idContract;
	}


	public void setIdContract(Long idContract) {
		this.idContract = idContract;
	}


	public Long getIdStatus() {
		return idStatus;
	}


	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}




}
