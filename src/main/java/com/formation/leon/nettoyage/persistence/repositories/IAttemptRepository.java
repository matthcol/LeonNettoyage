package com.formation.leon.nettoyage.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.leon.nettoyage.persistence.entities.Attempt;

public interface IAttemptRepository extends JpaRepository<Attempt,Long> {
	
	@Query(nativeQuery = true, value = "SELECT * FROM attempt WHERE id_contract LIKE ?1%")
	public List<Attempt> findByContract(Long id_contract);

}
