package com.formation.leon.nettoyage.services;

import java.util.List;

import com.formation.leon.nettoyage.persistence.entities.Attempt;
import com.formation.leon.nettoyage.services.common.IServiceActions;

public interface IAttemptService extends IServiceActions<Attempt> {
	public List<Attempt> findByContact(Long id_contract);

}
