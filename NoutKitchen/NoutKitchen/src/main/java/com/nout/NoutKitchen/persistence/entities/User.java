package com.nout.NoutKitchen.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "Utilisateur")
@Entity
public class User {

	private Long id;
	
	private String Pseudo;
	
	private String email;

	/**
	 * should be used to set admin status to one or a couple of users (0 is user, 1 is admin)
	 * Only the admin should have access to this column. See how to do that.
	 */
	private Integer Admin;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return Pseudo;
	}

	public void setPseudo(String pseudo) {
		Pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAdmin() {
		return Admin;
	}

	public void setAdmin(Integer admin) {
		Admin = admin;
	}
	
	
	
	
}
