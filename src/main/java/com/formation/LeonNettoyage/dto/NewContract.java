package com.formation.LeonNettoyage.dto;

public class NewContract {

	private Long id;
	
	private String targetname;
	
	private String targetfirstname;
	
	private String targetadress;
	
	private Long typeoftargetId;
	
	private Long clientId;
	
	private Long skillId;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTargetname() {
		return targetname;
	}

	public void setTargetname(String targetname) {
		this.targetname = targetname;
	}

	public String getTargetfirstname() {
		return targetfirstname;
	}

	public void setTargetfirstname(String targetfirstname) {
		this.targetfirstname = targetfirstname;
	}

	public String getTargetadress() {
		return targetadress;
	}

	public void setTargetadress(String targetadress) {
		this.targetadress = targetadress;
	}

	public long getTypeoftargetId() {
		return typeoftargetId;
	}

	public void setTypeoftargetId(long typeoftargetId) {
		this.typeoftargetId = typeoftargetId;
	}
	
		public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

}
