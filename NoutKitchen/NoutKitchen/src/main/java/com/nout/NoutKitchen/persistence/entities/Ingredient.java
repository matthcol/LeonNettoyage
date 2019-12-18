package com.nout.NoutKitchen.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// il faut lui amener les dependences et bibliothèques pour fonctionner
@Table(name = "ingredients")
@Entity
public class Ingredient {

	@Column
	private Long id;
	
	@Column
	private String label;
	
	
	//connection with month table
	//connection with allergy table
}
