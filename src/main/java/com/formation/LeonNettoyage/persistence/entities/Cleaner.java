package com.formation.LeonNettoyage.persistence.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cleaner")
@Entity
public class Cleaner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	
	@Column(unique = true)
	private String pseudo;
	@Column
	private Long price;
	@Column
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(pseudo);
		return builder.append("[")
				.append(Objects.toString(price, "no price"))
				.append("]#")
				.append(Objects.toString(id,"?"))
				.toString();
	}
}
