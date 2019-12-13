package com.formation.LeonNettoyage.services;

import java.util.List;

import com.formation.LeonNettoyage.persistence.entities.Attempt;
import com.formation.LeonNettoyage.services.common.IServiceActions;

public interface IAttemptService extends IServiceActions<Attempt> {
	public List<Attempt> findByContact(Long id_contract);

}
