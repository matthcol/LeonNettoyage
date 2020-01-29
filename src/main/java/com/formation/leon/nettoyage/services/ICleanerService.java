package com.formation.leon.nettoyage.services;

import com.formation.leon.nettoyage.dto.CleanerPassword;
import com.formation.leon.nettoyage.persistence.entities.Cleaner;
import com.formation.leon.nettoyage.services.common.IServiceActions;

public interface ICleanerService extends IServiceActions<Cleaner> {

	Cleaner findByName(String username);
	
	public Cleaner changePassword(CleanerPassword cleanerPassword);

}
