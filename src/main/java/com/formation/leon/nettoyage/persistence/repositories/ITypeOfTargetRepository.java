package com.formation.leon.nettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.leon.nettoyage.persistence.entities.TypeOfTarget;

public interface ITypeOfTargetRepository extends JpaRepository<TypeOfTarget,Long> {

}
