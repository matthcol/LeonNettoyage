package com.formation.LeonNettoyage.dto;

import com.formation.LeonNettoyage.persistence.entities.Attempt;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Skill;
import com.formation.LeonNettoyage.persistence.entities.Target;
import com.formation.LeonNettoyage.persistence.entities.TypeOfTarget;

public class ContractFull {
	
	private Long id;
	
	private Long price;
	
	private Target target;
	
	private TypeOfTarget typeoftarget;

	private Skill skill;
	
	private Cleaner cleaner;
	
	private Attempt attempt;
	
	
	public ContractFull(Long id, Long price, Target target, TypeOfTarget typeoftarget, Skill skill, Cleaner cleaner, Attempt attempt) {
		super();
		this.id = id;
		this.price = price;
		this.target = target;
		this.typeoftarget = typeoftarget;
		this.skill = skill;
		this.cleaner = cleaner;
		this.attempt = attempt;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public TypeOfTarget getTypeoftarget() {
		return typeoftarget;
	}

	public void setTypeoftarget(TypeOfTarget typeoftarget) {
		this.typeoftarget = typeoftarget;
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

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	public Attempt getAttempt() {
		return attempt;
	}

	public void setAttempt(Attempt attempt) {
		this.attempt = attempt;
	}

	
}
