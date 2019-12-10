package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.SkillOfCleaner;
import com.formation.LeonNettoyage.persistence.repositories.ISkillOfCleanerRepository;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class SkillOfCleanerService extends AbstractService<SkillOfCleaner>{
	
	@Autowired
	private ISkillOfCleanerRepository repo;
	
	public JpaRepository<SkillOfCleaner, Long> getRepo() {
		return repo;
	}

}
