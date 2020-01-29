package com.formation.leon.nettoyage.controllers;

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

import com.formation.leon.nettoyage.dto.ContractFull;
import com.formation.leon.nettoyage.dto.ContractLight;
import com.formation.leon.nettoyage.dto.ContractLog;
import com.formation.leon.nettoyage.dto.NewContract;
import com.formation.leon.nettoyage.persistence.entities.Client;
import com.formation.leon.nettoyage.persistence.entities.Contract;
import com.formation.leon.nettoyage.persistence.entities.Skill;
import com.formation.leon.nettoyage.persistence.entities.Target;
import com.formation.leon.nettoyage.persistence.entities.TypeOfTarget;
import com.formation.leon.nettoyage.services.IAuthChecker;
import com.formation.leon.nettoyage.services.IClientService;
import com.formation.leon.nettoyage.services.IContractService;
import com.formation.leon.nettoyage.services.ISkillService;
import com.formation.leon.nettoyage.services.ITargetService;
import com.formation.leon.nettoyage.services.ITypeOfTargetService;

@RestController
	@RequestMapping(path="/contract")
	public class ContractController {
	
	@Autowired
	private ModelMapper mapper;
	
	
	
	@Autowired 
	IContractService servicecontrat;
	

	@Autowired 
	ITargetService serviceTarget;
	
	@Autowired 
	ITypeOfTargetService serviceTypeTarget;
	
	@Autowired
	IClientService serviceClient;
	
	@Autowired
	ISkillService serviceSkill;
	
	@Autowired
	private IAuthChecker authChecker;
	
	public ContractController() {
		
	}
	
	@PostMapping(path = "/newcontract")
	public ContractFull create(@RequestBody NewContract newcontract ) {
				
		TypeOfTarget typeOfTarget = serviceTypeTarget.findOne(newcontract.getTypeoftargetId());
		
		Target t = new Target();
		t.setName(newcontract.getTargetname());
		t.setFirstName(newcontract.getTargetfirstname());
		t.setAdress(newcontract.getTargetadress());
		t.setTypeOfTarget(typeOfTarget);
		t = serviceTarget.save(t);
		
		Client cl = authChecker.getCurrentUser();
		
		Skill s = serviceSkill.findOne(newcontract.getSkillId());
		
		Contract c = new Contract();
		c.setTarget(t);
		c.setClient(cl);
		c.setSkill(s);
		c = servicecontrat.save(c);
		
		return mapper.map(c, ContractFull.class);
		
	}

	
	
	@RequestMapping(path = "/contract/light", method = RequestMethod.GET) 
	public List<ContractLight> findAllLight() {
		
		return servicecontrat.findAll()
				.stream()
				.map(c -> mapper.map(c, ContractLight.class))
				.collect(Collectors.toList());
	}
	
	@RequestMapping(path = "/contract/full", method = RequestMethod.GET) 
	public List<ContractFull> findAllFull() {
		
		return servicecontrat.findAll()
				.stream()
				.map(c -> mapper.map(c, ContractFull.class))
				.collect(Collectors.toList());
	}
	

	@RequestMapping(path = "/contract/log", method = RequestMethod.GET) 
	public List<ContractLog> findAllLog() {
		
		return servicecontrat.findAll()
				.stream()
				.map(c -> mapper.map(c, ContractLog.class))
				.collect(Collectors.toList());
	}
	

	@GetMapping(path="/{identifier}") // associe à la méthode get, l'url à la fonction // {variable
	public Contract findOne (@PathVariable (name = "identifier") Long id){
		return servicecontrat.findOne(id);		
	}
	
	@DeleteMapping(path="/{identifier}") 
	public Boolean deleteOne (@PathVariable Long id) {
		return servicecontrat.deleteById(id);
	}
	
	@PostMapping
	public Contract save (@RequestBody Contract contract) {
		return servicecontrat.save(contract);
	}
}
