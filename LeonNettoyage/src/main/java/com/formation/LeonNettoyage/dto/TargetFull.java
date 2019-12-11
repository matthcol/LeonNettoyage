package com.formation.LeonNettoyage.dto;

import java.util.Date;


public class TargetFull {

	private Long id;
	private String name;
	private String firstName;
	private String adress;
	private Date dateOfBirth;
	private String otherInfo;
	
	public TargetFull(Long id, String name, String firstName, String adress, Date dateOfBirth, String otherInfo) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.adress = adress;
		this.dateOfBirth = dateOfBirth;
		this.otherInfo = otherInfo;
	}

	public TargetFull() {
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	
}
