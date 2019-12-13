package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.LeonNettoyage.persistence.entities.Cleaner;

public interface ICleanerRepository extends JpaRepository<Cleaner,Long>  {
	@Query(nativeQuery = true, value = "SELECT * FROM cleaner WHERE pseudo = ?1 LIMIT 0,1")
	Cleaner findByName(String username);

}
