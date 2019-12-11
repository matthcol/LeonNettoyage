package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CleanerLight {
	
	@Id
	private Long id;
	
	@Column
	private String pseudo;
	
	public CleanerLight(Long id, String pseudo) {
		super();
		this.id = id;
		this.pseudo = pseudo;
	}

	public CleanerLight() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	

}
