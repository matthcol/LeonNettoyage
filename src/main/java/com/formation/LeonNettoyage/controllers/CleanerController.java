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

import com.formation.LeonNettoyage.dto.CleanerFull;
import com.formation.LeonNettoyage.dto.CleanerLight;
import com.formation.LeonNettoyage.dto.CleanerPassword;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.services.ICleanerService;

@RestController
@RequestMapping(path="/cleaner")
public class CleanerController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private ICleanerService service;

	
	@RequestMapping(path = "/listLight", method = RequestMethod.GET) 
	public List<CleanerLight> findAllLight() {
		
		return service.findAll()
				.stream()
				.map(c -> mapper.map(c, CleanerLight.class))
				.collect(Collectors.toList());
	}
	
	@RequestMapping(path = "/listFull", method = RequestMethod.GET) 
	public List<CleanerFull> findAllFull() {
		
		return service.findAll()
				.stream()
				.map(c -> mapper.map(c, CleanerFull.class))
				.collect(Collectors.toList());
	}

	@PostMapping
	public CleanerFull save(@RequestBody CleanerFull cleanerFull) {
		Cleaner c = mapper.map(cleanerFull, Cleaner.class);
		 c = service.save(c);
		return mapper.map(c,CleanerFull.class);
	}
	
	@PostMapping (value = "/cleanerPassword")
	public Cleaner changePassword(@RequestBody CleanerPassword cleanerPassword) {
		return service.changePassword(cleanerPassword);
	}

}