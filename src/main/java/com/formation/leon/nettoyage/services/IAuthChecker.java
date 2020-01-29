package com.formation.leon.nettoyage.services;

import com.formation.leon.nettoyage.persistence.entities.Cleaner;
import com.formation.leon.nettoyage.persistence.entities.Client;

public interface IAuthChecker {

	Client getCurrentUser();
	Cleaner getCurrentCleaner();
}
