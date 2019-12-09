package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Cleaner;

public interface ICleanerRepository extends JpaRepository<Cleaner,Long>  {

}
