package com.formation.leon.nettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.leon.nettoyage.persistence.entities.Target;
import com.formation.leon.nettoyage.persistence.repositories.ITargetRepository;
import com.formation.leon.nettoyage.services.ITargetService;
import com.formation.leon.nettoyage.services.common.AbstractService;

@Service
@Transactional
public class TargetService extends AbstractService<Target> implements ITargetService{
	@Autowired
	private ITargetRepository repo;
	
	public JpaRepository<Target, Long> getRepo() {
		return repo;
	}
}
