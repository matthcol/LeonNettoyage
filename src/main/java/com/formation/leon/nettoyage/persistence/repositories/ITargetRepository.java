package com.formation.leon.nettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.leon.nettoyage.persistence.entities.Target;

public interface ITargetRepository extends JpaRepository<Target,Long>  {

}
