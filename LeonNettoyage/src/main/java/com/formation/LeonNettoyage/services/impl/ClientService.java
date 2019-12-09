package com.formation.LeonNettoyage.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.LeonNettoyage.persistence.entities.Client;
import com.formation.LeonNettoyage.services.IClientService;
import com.formation.LeonNettoyage.services.common.AbstractService;

@Service
@Transactional
public class ClientService extends AbstractService<Client> implements IClientService{

}
