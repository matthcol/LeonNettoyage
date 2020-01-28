package com.formation.LeonNettoyage.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.formation.LeonNettoyage.persistence.entities.Contract;
import com.formation.LeonNettoyage.persistence.repositories.IContractRepository;
import com.formation.LeonNettoyage.services.IContractService;
import com.formation.LeonNettoyage.services.common.AbstractService;

import exceptions.ContractNotFoundException;

@Service
@Transactional
public class ContractService extends AbstractService<Contract> implements IContractService{
	
	@Autowired
	private IContractRepository tutu;

	@Override
	public JpaRepository<Contract, Long> getRepo() {
		
		return tutu;
	}
	
	@Override
	public List<Contract> findAll() {
		
		return getRepo().findAll();
	}

	@Transactional(readOnly=true)
	@Override
	public Contract findOne(Long id) {
		
		Optional<Contract> opt = getRepo().findById(id);
		if (!opt.isPresent()) {
			throw new ContractNotFoundException("");
		}
		
		return opt.get();
	}

	@Override
	public boolean deleteById(Long id) {
		return false;
	}

	@Override
	public boolean delete(Contract contract) {
		return false;
	}
	
	@PostMapping
	@Override
	public Contract save(@RequestBody Contract contract) {
		return getRepo().save(contract);
	}
	
	
	
}