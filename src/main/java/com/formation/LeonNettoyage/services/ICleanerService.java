package com.formation.LeonNettoyage.services;

import com.formation.LeonNettoyage.dto.CleanerPassword;
import com.formation.LeonNettoyage.persistence.entities.Cleaner;
import com.formation.LeonNettoyage.services.common.IServiceActions;

public interface ICleanerService extends IServiceActions<Cleaner> {

	Cleaner findByName(String username);
	
	public Cleaner changePassword(CleanerPassword cleanerPassword);

}
