package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Target;

public interface ITargetRepository extends JpaRepository<Target,Long>  {

}
