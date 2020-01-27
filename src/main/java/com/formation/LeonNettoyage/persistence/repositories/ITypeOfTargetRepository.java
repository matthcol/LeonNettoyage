package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.TypeOfTarget;

public interface ITypeOfTargetRepository extends JpaRepository<TypeOfTarget,Long> {

}
