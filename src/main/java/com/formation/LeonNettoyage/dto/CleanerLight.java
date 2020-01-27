package com.formation.LeonNettoyage.dto;

public class CleanerLight {

	private Long id;

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
