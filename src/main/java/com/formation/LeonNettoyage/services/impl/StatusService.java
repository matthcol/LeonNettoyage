package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Status;
import com.formation.LeonNettoyage.persistence.repositories.IStatusRepository;
import com.formation.LeonNettoyage.services.IStatusService;
import com.formation.LeonNettoyage.services.common.AbstractService;

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
