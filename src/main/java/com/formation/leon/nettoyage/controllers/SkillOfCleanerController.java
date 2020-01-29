package com.formation.leon.nettoyage.controllers;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.leon.nettoyage.dto.SkillFull;
import com.formation.leon.nettoyage.persistence.entities.Cleaner;
import com.formation.leon.nettoyage.services.impl.CleanerService;
import com.formation.leon.nettoyage.services.impl.SkillOfCleanerService;


@RestController
@RequestMapping(path="/skillOfCleaner", method = RequestMethod.GET)
public class SkillOfCleanerController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private SkillOfCleanerService service;
	
	@Autowired
	private CleanerService serviceCleaner;
	
	
	@GetMapping(path="/cleaner/{identifier}")
	public Cleaner findByIdCleaner(@PathVariable (name = "identifier") Long id){
		return serviceCleaner.findByCleanerId(id);
	}
	
	@RequestMapping(path="/list", method = RequestMethod.GET)
	public List<SkillFull> listSkillOfCleanerFull(){
		return service.findAll()
				.stream()
				.map(c -> mapper.map(c, SkillFull.class))
				.collect(Collectors.toList());
	}
	/*
	@PostMapping
	public SkillOfCleaner 
	*/
	
	
	
	
	
	
	
	
}
