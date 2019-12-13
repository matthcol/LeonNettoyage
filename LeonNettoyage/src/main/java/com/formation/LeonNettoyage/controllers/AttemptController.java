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
import com.formation.LeonNettoyage.persistence.entities.Attempt;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.services.IAttemptService;
import com.formation.LeonNettoyage.services.IStatusService;

@RestController
public class AttemptController {

	@Autowired
	IAttemptService serviceAttempt;
	
	@Autowired
	IStatusService serviceStatus;
	
	@Autowired
	private ModelMapper mapper;
	
	public AttemptController() {
		mapper = new ModelMapper();
	}
	
	@RequestMapping(path = "/attemptlist", method = RequestMethod.GET) 
	public List<AttemptFull>findAll(){
		
		return serviceAttempt.findAll()
				.stream()
				.map(c -> mapper.map(c, AttemptFull.class))
				.collect(Collectors.toList());
		
	}
	
	@PostMapping
	public AttemptFull save(@RequestBody AttemptFull attemptFull) {
		Attempt c = mapper.map(attemptFull, Attempt.class);
		 c = serviceAttempt.save(c);
		return mapper.map(c,AttemptFull.class);
	}
	
}
