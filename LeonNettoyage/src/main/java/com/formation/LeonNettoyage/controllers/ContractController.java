package com.formation.LeonNettoyage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.LeonNettoyage.services.IContractService;

@RestController
	@RequestMapping(value="/contract")
	public class ContractController {
	
	@Autowired 
	private IContractService service;
	
	
	 // blahblah
}
