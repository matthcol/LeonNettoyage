package com.formation.LeonNettoyage.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.LeonNettoyage.dto.ContractFull;
import com.formation.LeonNettoyage.dto.ContractLight;
import com.formation.LeonNettoyage.dto.ContractLog;
import com.formation.LeonNettoyage.persistence.entities.Contract;
import com.formation.LeonNettoyage.services.common.IServiceActions;

@RestController
	@RequestMapping(path="/contract")
	public class ContractController {
	
	@Autowired
	private ModelMapper mapperLight;
	
	@Autowired
	private ModelMapper mapperFull;
	
	@Autowired
	private ModelMapper mapperLog;
	
	@Autowired 
	IServiceActions<Contract> toto;
	
	public ContractController() {
		mapperLight = new ModelMapper();
		mapperFull = new ModelMapper();
		mapperLog = new ModelMapper();
	}
	
	

	@RequestMapping(path = "/contract/light", method = RequestMethod.GET) 
	public List<ContractLight> findAllLight() {
		
		return toto.findAll()
				.stream()
				.map(c -> mapperLight.map(c, ContractLight.class))
				.collect(Collectors.toList());
	}
	
	
	@RequestMapping(path = "/contract/full", method = RequestMethod.GET) 
	public List<ContractFull> findAllFull() {
		
		return toto.findAll()
				.stream()
				.map(c -> mapperFull.map(c, ContractFull.class))
				.collect(Collectors.toList());
	}
	

	@RequestMapping(path = "/contract/log", method = RequestMethod.GET) 
	public List<ContractLog> findAllLog() {
		
		return toto.findAll()
				.stream()
				.map(c -> mapperLog.map(c, ContractLog.class))
				.collect(Collectors.toList());
	}
	

	@GetMapping(path="/{identifier}") // associe à la méthode get, l'url à la fonction // {variable
	public Contract findOne (@PathVariable (name = "identifier") Long id){
		return toto.findOne(id);		
	}
	
	@DeleteMapping(path="/{identifier}") 
	public Boolean deleteOne (@PathVariable Long id) {
		return toto.deleteById(id);
	}
	
	@PostMapping
	public Contract save (@RequestBody Contract contract) {
		return toto.save(contract);
	}
}
