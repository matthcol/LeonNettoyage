package com.formation.leon.nettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.leon.nettoyage.persistence.entities.Client;

public interface IClientRepository extends JpaRepository<Client,Long> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM client WHERE email = ?1 LIMIT 0,1")
	Client findByMail(String username);
	
}
