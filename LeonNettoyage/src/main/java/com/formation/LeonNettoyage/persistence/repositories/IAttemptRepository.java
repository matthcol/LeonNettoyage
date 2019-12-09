package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Attempt;

public interface IAttemptRepository extends JpaRepository<Attempt,Long> {

}
