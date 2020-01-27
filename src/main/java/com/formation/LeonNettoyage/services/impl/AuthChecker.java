package com.formation.LeonNettoyage.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.formation.LeonNettoyage.exception.NotAuthorizedException;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.services.IAuthChecker;
import com.formation.LeonNettoyage.services.ICleanerService;
import com.formation.LeonNettoyage.services.IClientService;



@Component
public class AuthChecker implements IAuthChecker {

	@Autowired
	private IClientService userService;
	
	@Autowired
	private ICleanerService userCleanerService;
	
	@Override
	public Client getCurrentUser() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			UserDetails ud = (UserDetails)principal;
			return userService.findByMail(ud.getUsername());
		} else {
			throw new NotAuthorizedException("NO CURRENT USER");
		}
	}
	
	@Override
	public Cleaner getCurrentCleaner() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			UserDetails ud = (UserDetails)principal;
			return userCleanerService.findByName(ud.getUsername());
		} else {
			throw new NotAuthorizedException("NO CURRENT USER");
		}
	}
}
