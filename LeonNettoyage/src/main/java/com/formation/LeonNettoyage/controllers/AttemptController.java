package com.formation.LeonNettoyage.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.LeonNettoyage.dto.AttemptFull;
import com.formation.LeonNettoyage.dto.CleanerFull;
import com.formation.LeonNettoyage.dto.NewAttempt;
import com.formation.LeonNettoyage.persistence.entities.Attempt;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.persistence.entities.Contract;
import com.formation.LeonNettoyage.persistence.entities.Status;
import com.formation.LeonNettoyage.services.IAttemptService;
import com.formation.LeonNettoyage.services.IContractService;
import com.formation.LeonNettoyage.services.IStatusService;
import com.formation.LeonNettoyage.services.impl.ContractService;

@RestController
@RequestMapping(path = "/attempt")
public class AttemptController {
	
	@Autowired
	IContractService serviceContract;
	
	@Autowired
	IAttemptService serviceAttempt;
	
	@Autowired
	IStatusService serviceStatus;
	
	@Autowired
	private ModelMapper mapper;
	
	public AttemptController() {
		mapper = new ModelMapper();
	}
	
	@RequestMapping(path = "/list", method = RequestMethod.GET) 
	public List<AttemptFull>findAll(){
		
		return serviceAttempt.findAll()
				.stream()
				.map(c -> mapper.map(c, AttemptFull.class))
				.collect(Collectors.toList());
		
	}
	
	@PostMapping(path = "/newattempt")
	public boolean create(@RequestBody NewAttempt newAttempt) {
		Contract c = serviceContract.findOne(newAttempt.getIdContract());
		Status s = serviceStatus.findOne(newAttempt.getIdStatus());
		Attempt a = new Attempt();
		
		a.setStatus(s);
		
		
		c.getAttempts().add(a);
		serviceContract.save(c);
		
		return true;
		
	}
	
}
