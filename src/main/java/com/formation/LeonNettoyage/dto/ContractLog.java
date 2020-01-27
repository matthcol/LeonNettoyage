package com.formation.LeonNettoyage.dto;


import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Client;

public class ContractLog {


	private Long id;
	
	private Client client;
	
	private Cleaner cleaner;
	
	public ContractLog(Long id, Client client, Cleaner cleaner) {
		super();
		this.id = id;
		this.client = client;
		this.cleaner = cleaner;
	}

	public ContractLog() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

}
