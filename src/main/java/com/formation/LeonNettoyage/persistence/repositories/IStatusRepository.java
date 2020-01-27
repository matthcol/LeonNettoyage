package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Status;

public interface IStatusRepository extends JpaRepository<Status,Long>  {

}
