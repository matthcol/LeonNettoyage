package com.formation.leon.nettoyage.persistence.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="target")
@Entity
public class Target {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	@Column
	private String name;
	@Column
	private String firstName;
	@Column
	private String adress;
	@Column 
	private Date dateOfBirth;
	@Column
	private String otherInfo;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_type_of_target", referencedColumnName = "id")
	private TypeOfTarget typeOfTarget;
	
	public TypeOfTarget getTypeOfTarget() {
		return typeOfTarget;
	}
	public void setTypeOfTarget(TypeOfTarget typeOfTarget) {
		this.typeOfTarget = typeOfTarget;
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
