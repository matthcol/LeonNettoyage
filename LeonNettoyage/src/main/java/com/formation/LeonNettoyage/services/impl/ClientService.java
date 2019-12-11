package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.persistence.repositories.IClientRepository;
import com.formation.LeonNettoyage.services.IClientService;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class ClientService extends AbstractService<Client> implements IClientService {
	
	@Autowired
	IClientRepository repo;
	
	@Override
	public JpaRepository<Client, Long> getRepo() {
		return repo;
	}

	@Override
	public Client findByMail(String username) {

		return repo.findByMail(username);
	}

}
