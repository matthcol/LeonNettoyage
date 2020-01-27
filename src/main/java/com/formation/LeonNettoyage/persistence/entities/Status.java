package com.formation.LeonNettoyage.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="status")
@Entity
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	@Column
	private String label;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

}
