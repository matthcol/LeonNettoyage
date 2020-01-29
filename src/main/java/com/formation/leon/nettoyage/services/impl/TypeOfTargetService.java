package com.formation.leon.nettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.leon.nettoyage.persistence.entities.TypeOfTarget;
import com.formation.leon.nettoyage.persistence.repositories.ITypeOfTargetRepository;
import com.formation.leon.nettoyage.services.ITypeOfTargetService;
import com.formation.leon.nettoyage.services.common.AbstractService;

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
