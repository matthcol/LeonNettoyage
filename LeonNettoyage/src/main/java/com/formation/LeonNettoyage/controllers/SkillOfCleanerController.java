package com.formation.LeonNettoyage.controllers;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.formation.LeonNettoyage.dto.SkillFull;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.services.impl.CleanerService;
import com.formation.LeonNettoyage.services.impl.SkillOfCleanerService;


@RestController
@RequestMapping(path="/skillOfCleaner", method = RequestMethod.GET)
public class SkillOfCleanerController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private SkillOfCleanerService service;
	
	@Autowired
	private CleanerService serviceCleaner;
	
	public SkillOfCleanerController() {
		mapper = new ModelMapper();
	}
	
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
