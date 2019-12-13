package com.formation.LeonNettoyage.dto;


public class SkillFull {
	
	private Long id;
	private String skillName;
	private Long price;
	public SkillFull(Long id, String skillName, Long price) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.price = price;
	}
	
	public SkillFull() {
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	

}
