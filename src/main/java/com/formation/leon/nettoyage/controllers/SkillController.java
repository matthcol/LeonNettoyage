package com.formation.leon.nettoyage.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.leon.nettoyage.dto.SkillFull;
import com.formation.leon.nettoyage.services.ISkillService;


@RestController
@RequestMapping(path = "/skill")
public class SkillController {

	
	@Autowired
	ISkillService serviceSkill;
	
	@Autowired
	ModelMapper mapper;
	
	
	@RequestMapping(path = "/list")
	public List<SkillFull> getSkillList(){
		
		return serviceSkill.findAll()
				.stream()
				.map(c -> mapper.map(c, SkillFull.class))
				.collect(Collectors.toList());
	}
	
	
	
}
