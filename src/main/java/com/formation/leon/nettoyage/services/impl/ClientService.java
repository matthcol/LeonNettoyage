package com.formation.leon.nettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.leon.nettoyage.dto.ClientPassword;
import com.formation.leon.nettoyage.exception.AlreadyExistException;
import com.formation.leon.nettoyage.persistence.entities.Client;
import com.formation.leon.nettoyage.persistence.repositories.IClientRepository;
import com.formation.leon.nettoyage.services.IClientService;
import com.formation.leon.nettoyage.services.common.AbstractService;

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

	
	@Override
	public Client save(Client t) {
		
		try {
			t = super.save(t);
		} catch (Exception e) {
		
			throw new AlreadyExistException("Impossible d'utiliser ces credentials");
		}
		
		return t;
	}

	@Override
	public Client changePassword(ClientPassword clientPassword) {
		Client c = repo.getOne(clientPassword.getId());	
		c.setPassword(clientPassword.getPassword());
		return repo.save(c);
	}
}
