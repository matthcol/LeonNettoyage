package com.formation.LeonNettoyage.dto;

import com.formation.LeonNettoyage.persistence.entities.Target;
import com.formation.LeonNettoyage.persistence.entities.TypeOfTarget;

public class ContractLight {
	
	private Long id;
	
	private Long price;
	
	private Target target;

	private TypeOfTarget typeoftarget;
	
	
	public ContractLight(Long id, Long price, Target target, TypeOfTarget typeoftarget) {
		super();
		this.id = id;
		this.price = price;
		this.target = target;
		this.typeoftarget = typeoftarget;
	}

	public ContractLight() {
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
