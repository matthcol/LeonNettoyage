package com.formation.LeonNettoyage.dto;

import javax.persistence.Column;

import com.formation.LeonNettoyage.persistence.entities.Target;
import com.formation.LeonNettoyage.persistence.entities.TypeOfTarget;

public class ContractLight {
	
	@Column
	private Long id;
	
	@Column
	private Long price;
	
	@Column
	private Target target;
	
	@Column
	private TypeOfTarget typeoftarget;
	
	
	public ContractLight(Long id, Long price, Target target, TypeOfTarget typeoftarget) {
		super();
		this.id = id;
		this.price = price;
		this.target = target;
		this.typeoftarget = typeoftarget;
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
