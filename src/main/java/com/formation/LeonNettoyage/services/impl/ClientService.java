package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.formation.LeonNettoyage.dto.ClientPassword;
import com.formation.LeonNettoyage.exception.AlreadyExistException;
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
