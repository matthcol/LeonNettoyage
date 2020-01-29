package com.formation.leon.nettoyage.persistence.entities;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Table(name="skill")
@Entity
public class Skill {
	
	
	public Skill() {
		skillOfCleaner = new HashSet<SkillOfCleaner>();
	}
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	@Column(name = "skill_name")
	private String skillName;
	@Column
	private Long price;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_skill")
	private Set<SkillOfCleaner> skillOfCleaner;

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

	public Set<SkillOfCleaner> getSkillOfCleaner() {
		return skillOfCleaner;
	}

	public void setSkillOfCleaner(Set<SkillOfCleaner> skillOfCleaner) {
		this.skillOfCleaner = skillOfCleaner;
	}
	
	
	
}
