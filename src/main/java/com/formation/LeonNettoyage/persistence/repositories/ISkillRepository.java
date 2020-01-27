package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.LeonNettoyage.persistence.entities.Skill;

public interface ISkillRepository extends JpaRepository<Skill,Long>  {

}
