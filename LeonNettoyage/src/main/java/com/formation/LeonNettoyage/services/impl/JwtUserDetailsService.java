package com.formation.LeonNettoyage.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.services.ICleanerService;
import com.formation.LeonNettoyage.services.IClientService;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private IClientService clientService;
	
	@Autowired
	private ICleanerService cleanerService;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		
		/**
		 * I get a Client from the info I got from outside
		 */
		Client u = clientService.findByMail(username);
		
		/**
		 * If I do find a Client in my DB with it, I return it:
		 */
		if (u != null) {
			return new User(u.getEmail(), u.getPassword(), new ArrayList<>());
		} else {
			
			/**
			 * If I didn't find a Client, I look for a Cleaner and return it if found:
			 */
			Cleaner y  = cleanerService.findByName(username);
			if (y !=null) {
				return new User(y.getPseudo(), y.getPassword(), new ArrayList<>());
			}
			
			/**
			 * If I didn't find any corresponding User (client or Cleaner, I return an exception:
			 */
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}