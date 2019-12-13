package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Contract;
import com.formation.LeonNettoyage.persistence.entities.TypeOfTarget;
import com.formation.LeonNettoyage.persistence.repositories.ITypeOfTargetRepository;
import com.formation.LeonNettoyage.services.ITypeOfTargetService;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class TypeOfTargetService extends AbstractService<TypeOfTarget> implements ITypeOfTargetService{

	@Autowired
	ITypeOfTargetRepository repo;
	
	@Override
	public JpaRepository<TypeOfTarget, Long> getRepo() {
		return repo;
	}

	
	/// j'ai fait un commit   
}
