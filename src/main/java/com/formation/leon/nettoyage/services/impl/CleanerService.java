package com.formation.leon.nettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.leon.nettoyage.dto.CleanerPassword;
import com.formation.leon.nettoyage.exception.AlreadyExistException;
import com.formation.leon.nettoyage.persistence.entities.Cleaner;
import com.formation.leon.nettoyage.persistence.repositories.ICleanerRepository;
import com.formation.leon.nettoyage.services.ICleanerService;
import com.formation.leon.nettoyage.services.common.AbstractService;


@Service
@Transactional
public class CleanerService extends AbstractService<Cleaner> implements ICleanerService{
	
	@Autowired
	private ICleanerRepository repo;
	
	public JpaRepository<Cleaner, Long> getRepo() {
		return repo;
	}
	@Override
	public Cleaner findByName(String username) {
		return repo.findByPseudo(username);
	}
	
	public Cleaner findByCleanerId(Long id) {
		return repo.getOne(id);
	}
	@Override
	public Cleaner save(Cleaner t) {
		
		try {
			t = super.save(t);
		} catch (Exception e) {
			throw new AlreadyExistException("impossible d'utiliser ces credentials");
		}
		
		return t;
	}
	
	@Override
	public Cleaner changePassword(CleanerPassword cleanerPassword) {
		Cleaner c = repo.getOne(cleanerPassword.getId());	
		c.setPassword(cleanerPassword.getPassword());
		return repo.save(c);
	}
}
