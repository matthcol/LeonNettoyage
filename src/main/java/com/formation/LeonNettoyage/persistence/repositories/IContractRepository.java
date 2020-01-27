package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Contract;

public interface IContractRepository extends JpaRepository<Contract,Long> {

}
