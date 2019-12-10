package com.formation.LeonNettoyage.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.LeonNettoyage.dto.ClientLight;
import com.formation.LeonNettoyage.services.ICleanerService;

@RestController
@RequestMapping(path="/cleaner")
public class CleanerController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private ICleanerService service;

	public CleanerController() {
		mapper = new ModelMapper();
	}
}
	
