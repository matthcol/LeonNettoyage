package com.formation.leon.nettoyage.persistence.repositories.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.formation.leon.nettoyage.persistence.entities.Attempt;
import com.formation.leon.nettoyage.persistence.entities.Contract;
import com.formation.leon.nettoyage.persistence.repositories.IContractRepository;

@DataJpaTest
class TestContractRepository {

	@Autowired
	EntityManager entityManager;
	
	@Autowired
	IContractRepository contractRepository;
	
	@Test
	void testFindByAttemptsDate() {
		// given
		Date date = new Date(2019, 2, 1);
		Attempt attempt = new Attempt();
		attempt.setDate(date);
		Contract contract = new Contract();
		Set<Attempt> attempts = new HashSet<>();
		attempts.add(attempt);
		contract.setAttempts(attempts);
		entityManager.persist(attempt);
		entityManager.persist(contract);
		// when
		Set<Contract> result = contractRepository.findByAttemptsDate(date);
		// then
		System.out.println(result);
	}

}
