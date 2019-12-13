package com.formation.LeonNettoyage.dto;

public class CleanerFull {
	
	private Long id;
	private Long pseudo;
	private Long price;
	
	public CleanerFull(Long id, Long pseudo, Long price) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPseudo() {
		return pseudo;
	}
	public void setPseudo(Long pseudo) {
		this.pseudo = pseudo;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	
}
