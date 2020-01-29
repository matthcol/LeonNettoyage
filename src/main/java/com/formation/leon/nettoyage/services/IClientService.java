package com.formation.leon.nettoyage.services;

import com.formation.leon.nettoyage.dto.ClientPassword;
import com.formation.leon.nettoyage.persistence.entities.Client;
import com.formation.leon.nettoyage.services.common.IServiceActions;

public interface IClientService extends IServiceActions<Client>{

	Client findByMail(String username);
	
	public Client changePassword(ClientPassword clientPassword);
	
}
