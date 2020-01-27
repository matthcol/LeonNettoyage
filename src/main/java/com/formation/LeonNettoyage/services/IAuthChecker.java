package com.formation.LeonNettoyage.services;

import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.persistence.entities.Client;

public interface IAuthChecker {

	Client getCurrentUser();
	Cleaner getCurrentCleaner();
}
