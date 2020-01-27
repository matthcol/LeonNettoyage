package com.formation.LeonNettoyage.services;

import com.formation.LeonNettoyage.dto.ClientPassword;
import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.services.common.IServiceActions;

public interface IClientService extends IServiceActions<Client>{

	Client findByMail(String username);
	
	public Client changePassword(ClientPassword clientPassword);
	
}
