package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;

import com.formation.LeonNettoyage.persistence.entities.Attempt;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Service;
import com.formation.LeonNettoyage.persistence.entities.Target;
import com.formation.LeonNettoyage.persistence.entities.TypeOfTarget;

public class ContractFull {
	
	@Column
	private Long id;
	
	@Column
	private Long price;
	
	@Column
	private Target target;
	
	@Column
	private TypeOfTarget typeoftarget;
	
	@Column
	private Service service;
	
	@Column 
	private Cleaner cleaner;
	
	@Column
	private Attempt attempt;
	
	
	public ContractFull(Long id, Long price, Target target, TypeOfTarget typeoftarget, Service service, Cleaner cleaner, Attempt attempt) {
		super();
		this.id = id;
		this.price = price;
		this.target = target;
		this.typeoftarget = typeoftarget;
		this.service = service;
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

}
