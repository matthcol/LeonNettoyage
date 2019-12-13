package com.formation.LeonNettoyage.dto;




public class ContractFull {
	
	private Long id;
	
	private Long price;
	
	private TargetFull target;
	
	private TypeOfTargetFull typeoftarget;

	private SkillFull skill;
	
	private CleanerFull cleaner;
	
	private AttemptFull attempt;
	
	
	public ContractFull(Long id, Long price, TargetFull target, TypeOfTargetFull typeoftarget, SkillFull skill, CleanerFull cleaner, AttemptFull attempt) {
		super();
		this.id = id;
		this.price = price;
		this.target = target;
		this.typeoftarget = typeoftarget;
		this.skill = skill;
		this.cleaner = cleaner;
		this.attempt = attempt;
	}

	public ContractFull() {
	}
	
	public TargetFull getTarget() {
		return target;
	}

	public void setTarget(TargetFull target) {
		this.target = target;
	}

	public TypeOfTargetFull getTypeoftarget() {
		return typeoftarget;
	}

	public void setTypeoftarget(TypeOfTargetFull typeoftarget) {
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

	public SkillFull getSkill() {
		return skill;
	}

	public void setSkill(SkillFull skill) {
		this.skill = skill;
	}

	public CleanerFull getCleaner() {
		return cleaner;
	}

	public void setCleaner(CleanerFull cleaner) {
		this.cleaner = cleaner;
	}

	public AttemptFull getAttempt() {
		return attempt;
	}

	public void setAttempt(AttemptFull attempt) {
		this.attempt = attempt;
	}

	
}
