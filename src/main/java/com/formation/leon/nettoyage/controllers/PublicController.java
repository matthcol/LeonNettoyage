package com.formation.leon.nettoyage.controllers;

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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.formation.leon.nettoyage.config.JwtTokenUtil;
import com.formation.leon.nettoyage.dto.NewUser;
import com.formation.leon.nettoyage.dto.jwt.JwtRequest;
import com.formation.leon.nettoyage.dto.jwt.JwtResponse;
import com.formation.leon.nettoyage.exception.NotAuthorizedException;
import com.formation.leon.nettoyage.persistence.entities.Cleaner;
import com.formation.leon.nettoyage.persistence.entities.Client;
import com.formation.leon.nettoyage.services.ICleanerService;
import com.formation.leon.nettoyage.services.IClientService;


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
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
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
	
	@PostMapping(path = "/register") // post signifie écrire dans la base de donnée
	@ResponseStatus(code = HttpStatus.OK)
	public void save(@RequestBody NewUser u) {
			
			/**
			 * I test if the userType is of type client
			 */
			if (u.getUserType().equals("client")) {
				
				/**
				 * I create a new client
				 */
				Client c = new Client();
				
				/**
				 * I set its information email and password
				 */
				c.setEmail(u.getEmail());
				c.setPassword(encoder.encode(u.getPassword()));
				
				/**
				 * I save my new client in the database
				 */
				serviceClient.save(c); 
				
			}
			if ("cleaner".equals(u.getUserType())) {
				Cleaner c = new Cleaner();
				c.setPseudo(u.getEmail());
				c.setPassword(encoder.encode(u.getPassword()));
				serviceCleaner.save(c);
			}	
	}	
}
