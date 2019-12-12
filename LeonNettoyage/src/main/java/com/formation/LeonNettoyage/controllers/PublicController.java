package com.formation.LeonNettoyage.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.formation.LeonNettoyage.config.JwtTokenUtil;
import com.formation.LeonNettoyage.dto.ClientFull;
import com.formation.LeonNettoyage.dto.NewUser;
import com.formation.LeonNettoyage.dto.jwt.JwtRequest;
import com.formation.LeonNettoyage.dto.jwt.JwtResponse;
import com.formation.LeonNettoyage.exception.NotAuthorizedException;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.services.ICleanerService;
import com.formation.LeonNettoyage.services.IClientService;


@RestController
@RequestMapping(path = "/api/public")
public class PublicController {

	@Autowired
	ModelMapper mapper;
	
	@Autowired
	IClientService serviceClient;
	
	@Autowired
	ICleanerService serviceCleaner;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	
	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
			final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
			final String token = jwtTokenUtil.generateToken(userDetails);
			return ResponseEntity.ok(new JwtResponse(token));
		} catch (DisabledException | BadCredentialsException e) {
			throw new NotAuthorizedException(e.getMessage());
		}		
	}
	
	
	@PostMapping // post signifie écrire dans la base de donnée
	@ResponseStatus(code = HttpStatus.OK)
	public void save(@RequestBody NewUser u) {
		
		if (u.getUserType().equals("client")) {
			
			serviceClient.save(mapper.map(u, Client.class)); 
		}
		if ("cleaner".equals(u.getUserType())) {
			
			serviceCleaner.save(mapper.map(u, Cleaner.class));
		}

	}
	
	
	
}
