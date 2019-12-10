package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class SkillFull {
	
	@Id
	private Long id;
	@Column
	private String skillName;
	@Column
	private Long price;
	public SkillFull(Long id, String skillName, Long price) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.price = price;
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
