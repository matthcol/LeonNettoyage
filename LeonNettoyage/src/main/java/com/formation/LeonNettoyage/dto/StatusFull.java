package com.formation.LeonNettoyage.dto;



public class StatusFull {

	public StatusFull(Long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	
	public StatusFull() {
	}
	
	
	private Long id;

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
