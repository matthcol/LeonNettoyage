package com.formation.leon.nettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.leon.nettoyage.persistence.entities.Status;

public interface IStatusRepository extends JpaRepository<Status,Long>  {

}
