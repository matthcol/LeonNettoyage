package com.formation.LeonNettoyage.dto;

public class TypeOfTargetFull {
	private Long id;
	private Long price;
	private String label;
	
	public TypeOfTargetFull(Long id, Long price, String label) {
	super();
	this.id = id;
	this.price = price;
	this.label = label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
