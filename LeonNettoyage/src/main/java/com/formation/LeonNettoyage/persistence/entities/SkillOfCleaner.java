package com.formation.LeonNettoyage.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.formation.LeonNettoyage.persistence.repositories.ISkillOfCleanerRepository;

@Table(name="skill_of_cleaner")
@Entity
public class SkillOfCleaner{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_cleaner")
	private Cleaner cleaner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Cleaner getCleaner() {
		return cleaner;
	}


	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	
	public Cleaner findByCleanerId(Long id_cleaner) {
	return null;
	}

	
}
