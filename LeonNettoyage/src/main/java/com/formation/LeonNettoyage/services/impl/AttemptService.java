package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Attempt;
import com.formation.LeonNettoyage.persistence.repositories.IAttemptRepository;
import com.formation.LeonNettoyage.services.IAttemptService;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class AttemptService extends AbstractService<Attempt> implements IAttemptService{

	@Autowired
	IAttemptRepository repo;
	
	
	@Override
	public JpaRepository<Attempt, Long> getRepo() {
		return repo;
	}

}
