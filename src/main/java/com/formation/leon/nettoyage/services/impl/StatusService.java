package com.formation.leon.nettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.leon.nettoyage.persistence.entities.Status;
import com.formation.leon.nettoyage.persistence.repositories.IStatusRepository;
import com.formation.leon.nettoyage.services.IStatusService;
import com.formation.leon.nettoyage.services.common.AbstractService;

@Service
@Transactional
public class StatusService extends AbstractService<Status> implements IStatusService {

	@Autowired
	IStatusRepository repo;
	
	
	@Override
	public JpaRepository<Status, Long> getRepo() {
		return repo;
	}

}
