package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Target;
import com.formation.LeonNettoyage.persistence.repositories.ITargetRepository;
import com.formation.LeonNettoyage.services.ITargetService;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class TargetService extends AbstractService<Target> implements ITargetService{
	@Autowired
	private ITargetRepository repo;
	
	public JpaRepository<Target, Long> getRepo() {
		return repo;
	}
}
