package com.formation.leon.nettoyage.persistence.repositories;

import java.util.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.leon.nettoyage.persistence.entities.Attempt;
import com.formation.leon.nettoyage.persistence.entities.Contract;

public interface IContractRepository extends JpaRepository<Contract,Long> {
	
	Set<Contract> findByAttemptsDate(Date date);
}
