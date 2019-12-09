package com.formation.LeonNettoyage.persistence.entities;

import java.util.List;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Colonne générée
	private Long id;
	
	@Column
	private Long price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_client", referencedColumnName = "id") // commande en premier en client ensuite, ceux qui sont link
	private Client idClient;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_service", referencedColumnName = "id")
	private Service idService;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_cleaner", referencedColumnName = "id")
	private Cleaner idCleaner;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_attempt", referencedColumnName = "id")
	private List<Attempt> attempts;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "id_type_of_target", referencedColumnName = "id")
	private TypeOfTarget idTypeOfTarget;
	
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
	public Client getIdClient() {
		return idClient;
	}
	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}
	public Service getIdService() {
		return idService;
	}
	public void setIdService(Service idService) {
		this.idService = idService;
	}
	public Cleaner getIdCleaner() {
		return idCleaner;
	}
	public void setIdCleaner(Cleaner idCleaner) {
		this.idCleaner = idCleaner;
	}
	public List<Attempt> getAttempts() {
		return attempts;
	}
	public void setAttempts(List<Attempt> attempts) {
		this.attempts = attempts;
	}
	public TypeOfTarget getIdTypeOfTarget() {
		return idTypeOfTarget;
	}
	public void setIdTypeOfTarget(TypeOfTarget idTypeOfTarget) {
		this.idTypeOfTarget = idTypeOfTarget;
	}
	
}
