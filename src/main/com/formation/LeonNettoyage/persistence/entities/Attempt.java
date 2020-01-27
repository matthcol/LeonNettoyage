package com.formation.LeonNettoyage.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="attempt")
@Entity
public class Attempt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	@Column
	private Long idStatus;
	@Column
	private Long idContract;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}
	public Long getIdContract() {
		return idContract;
	}
	public void setIdContract(Long idContract) {
		this.idContract = idContract;
	}

}
