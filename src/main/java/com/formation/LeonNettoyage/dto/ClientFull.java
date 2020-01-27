package com.formation.LeonNettoyage.dto;

import java.util.Date;

public class ClientFull {

	private Long id;
	private String name;
	private String firstName;
	private String email;
	private String phone;
	private Date dateOfBirth;
	
	public ClientFull(Long id, String name, String firstName, String email, String phone, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}

	public ClientFull() {

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}