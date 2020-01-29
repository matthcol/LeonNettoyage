package com.formation.leon.nettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.leon.nettoyage.persistence.entities.SkillOfCleaner;
import com.formation.leon.nettoyage.persistence.repositories.ISkillOfCleanerRepository;
import com.formation.leon.nettoyage.services.common.AbstractService;

@Service
@Transactional
public class SkillOfCleanerService extends AbstractService<SkillOfCleaner>{
	
	@Autowired
	private ISkillOfCleanerRepository repo;
	
	public JpaRepository<SkillOfCleaner, Long> getRepo() {
		return repo;
	}


}
