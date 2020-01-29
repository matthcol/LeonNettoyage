package com.formation.leon.nettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.leon.nettoyage.persistence.entities.Skill;

public interface ISkillRepository extends JpaRepository<Skill,Long>  {

}
