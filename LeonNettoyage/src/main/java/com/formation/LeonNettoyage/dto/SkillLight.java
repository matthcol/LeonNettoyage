package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class SkillLight {
	@Id
	private Long id;
	@Column
	private String skillName;
	public SkillLight(Long id, String skillName) {
		super();
		this.id = id;
		this.skillName = skillName;
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
