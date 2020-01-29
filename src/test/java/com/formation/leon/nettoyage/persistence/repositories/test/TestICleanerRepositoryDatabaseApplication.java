package com.formation.leon.nettoyage.persistence.repositories.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import com.formation.leon.nettoyage.persistence.entities.Cleaner;
import com.formation.leon.nettoyage.persistence.repositories.ICleanerRepository;

/**
 * Test ICleanerRepository with mysql database 
 * @author Matthias
 *
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE) // don't replace mysql with h2
class TestICleanerRepositoryDatabaseApplication {

	@Autowired
	ICleanerRepository cleanerRepository;
	
	@Autowired
	EntityManager entityManager;
	
	@Test
	void testFindByPseudo() {
		// given
		String pseudo = "Leon";
		Cleaner leon = new Cleaner();
		leon.setPseudo(pseudo);
		entityManager.persist(leon);
		Cleaner notLeon = new Cleaner();
		notLeon.setPseudo("Stansfield");
		entityManager.persist(notLeon);
		// when
		Cleaner result = cleanerRepository.findByPseudo(pseudo);
		// then
		assertEquals(pseudo, result.getPseudo());
	}
	
	// this test failed is there is existing data with cheapest price
	@Test
	void testFindByLowestPrice() {
		// given
		long lowestPrice = 100000;
		Cleaner cheapest1 = new Cleaner();
		cheapest1.setPseudo("Cheapest 1");
		cheapest1.setPrice(lowestPrice);
		entityManager.persist(cheapest1);
		Cleaner cheapest2 = new Cleaner();
		cheapest2.setPseudo("Cheapest 2");
		cheapest2.setPrice(lowestPrice);
		entityManager.persist(cheapest2);
		Cleaner notCheapest = new Cleaner();
		notCheapest.setPseudo("Expensive 1");
		notCheapest.setPrice(lowestPrice*2+1);
		entityManager.persist(notCheapest);
		// when
		Set<Cleaner> result = cleanerRepository.findByLowestPrice();
		// then
		System.out.println(result); // to see details
		assertEquals(2, result.size());
		assertTrue(result.contains(cheapest1));
		assertTrue(result.contains(cheapest2));
		assertFalse(result.contains(notCheapest));
	}

}
