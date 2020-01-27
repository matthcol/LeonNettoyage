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

import com.formation.LeonNettoyage.dto.ClientFull;
import com.formation.LeonNettoyage.dto.ClientLight;
import com.formation.LeonNettoyage.dto.ClientPassword;
import com.formation.LeonNettoyage.exception.NotAuthorizedException;
import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.services.IAuthChecker;
import com.formation.LeonNettoyage.services.IClientService;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
	
	@Autowired
	private ModelMapper mapper; // dto

	@Autowired
	IClientService service;//*IClientService service;
	
	@Autowired
	IAuthChecker authChecker;

	
	@RequestMapping(path = "/listLight", method = RequestMethod.GET) 
	public List<ClientLight> findAllLight() {
		
		
		
		return service.findAll()
				.stream()
				.map(c -> mapper.map(c, ClientLight.class))
				.collect(Collectors.toList());
	}
	
	@RequestMapping(path = "/listFull", method = RequestMethod.GET) 
	public List<ClientFull> findAllFull() {
		
		return service.findAll()
				.stream()
				.map(c -> mapper.map(c, ClientFull.class))
				.collect(Collectors.toList());
	}
	
	@GetMapping(path="/{identifier}") // associe à la méthode get, l'url à la fonction // {variable
	public ClientFull findOne (@PathVariable (name = "identifier") Long id){
		
		Client me = authChecker.getCurrentUser();
		
		System.out.println("called by " + me.getName());
		
		if (me.getId().equals(id))
			return mapper.map(service.findOne(id), ClientFull.class) ;	

		
		throw new NotAuthorizedException("Unauthorized");
			
	}
	
	@DeleteMapping(path="/{identifier}") 
	public Boolean deleteOne (@PathVariable Long id) {
		return service.deleteById(id);
	}
	
	@PostMapping
	public Client save (@RequestBody Client client) {
		return service.save(client);
	}
	
	@PostMapping (value = "/clientPassword")
	public Client changePassword(@RequestBody ClientPassword clientPassword) {
		return service.changePassword(clientPassword);
	}
}