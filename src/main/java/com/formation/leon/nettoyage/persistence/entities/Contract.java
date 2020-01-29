package com.formation.leon.nettoyage.persistence.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="contract")
@Entity
public class Contract {
	
	public Contract() {
		attempts = new HashSet<Attempt>();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	
	@Column
	private Long price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_client", referencedColumnName = "id") // commande en premier en client ensuite, ceux qui sont link
	private Client client;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_service", referencedColumnName = "id")
	private Skill skill;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_cleaner", referencedColumnName = "id")
	private Cleaner cleaner;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_contract", referencedColumnName = "id")
	private Set<Attempt> attempts;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_target", referencedColumnName = "id")
	private Target target;
	
	
	
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
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Cleaner getCleaner() {
		return cleaner;
	}
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	public Set<Attempt> getAttempts() {
		return attempts;
	}
	public void setAttempts(Set<Attempt> attempts) {
		this.attempts = attempts;
	}
	public Target getTarget() {
		return target;
	}
	public void setTarget(Target target) {
		this.target = target;
	}

	
}
