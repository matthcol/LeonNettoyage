package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Service;

public interface IServiceRepository extends JpaRepository<Service,Long>  {

}
