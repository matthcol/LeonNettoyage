package com.formation.LeonNettoyage.dto;

public class SkillLight {

	private Long id;

	private String skillName;
	
	public SkillLight(Long id, String skillName) {
		super();
		this.id = id;
		this.skillName = skillName;
	}
	
	public SkillLight() {
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

	
}
