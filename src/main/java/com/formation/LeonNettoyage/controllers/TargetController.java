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

import com.formation.LeonNettoyage.dto.TargetFull;
import com.formation.LeonNettoyage.dto.TargetLight;
import com.formation.LeonNettoyage.persistence.entities.Target;
import com.formation.LeonNettoyage.services.common.IServiceActions;

@RestController
@RequestMapping(path = "/target")
public class TargetController {

		@Autowired
		private ModelMapper mapperLight; // dto
		@Autowired
		private ModelMapper mapperFull; // dto
		
		@Autowired
		IServiceActions<Target> service;//*IClientService service;

		
		@RequestMapping(path = "/listLight", method = RequestMethod.GET) 
		public List<TargetLight> findAllLight() {
			
			return service.findAll()
					.stream()
					.map(c -> mapperLight.map(c, TargetLight.class))
					.collect(Collectors.toList());
		}
		
		@RequestMapping(path = "/listFull", method = RequestMethod.GET) 
		public List<TargetFull> findAllFull() {
			
			return service.findAll()
					.stream()
					.map(c -> mapperFull.map(c, TargetFull.class))
					.collect(Collectors.toList());
		}
		
		@GetMapping(path="/{identifier}") // associe à la méthode get, l'url à la fonction // {variable
		public Target findOne (@PathVariable (name = "identifier") Long id){
			return service.findOne(id);		
		}
		
		@DeleteMapping(path="/{identifier}") 
		public Boolean deleteOne (@PathVariable Long id) {
			return service.deleteById(id);
		}
		
		@PostMapping
		public Target save (@RequestBody Target target) {
			return service.save(target);
		}
	}
	
