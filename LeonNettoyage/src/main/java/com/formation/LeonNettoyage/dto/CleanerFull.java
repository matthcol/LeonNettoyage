package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CleanerFull {
	
	@Id
	private Long id;
	@Column
	private String pseudo;
	@Column
	private Long price;
	public CleanerFull(Long id, String pseudo, Long price) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.price = price;
	}
	
	public CleanerFull() {
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() { //string

		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	
}
