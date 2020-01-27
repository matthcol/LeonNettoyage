package com.formation.LeonNettoyage.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.SkillOfCleaner;

public interface ISkillOfCleanerRepository extends JpaRepository<SkillOfCleaner, Long>{
	
	@Query(nativeQuery = true, value = "SELECT skill.skill_name, cleaner.pseudo FROM skill_of_cleaner, cleaner, skill WHERE skill_of_cleaner.id_cleaner = cleaner.id"
									 + " AND skill_of_cleaner.id_skill = skill.id AND cleaner.id = ?1")
	public Cleaner findByCleanerId(Long id_cleaner);
	
}
