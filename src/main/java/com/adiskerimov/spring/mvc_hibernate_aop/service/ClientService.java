package com.adiskerimov.spring.mvc_hibernate_aop.service;

import com.adiskerimov.spring.mvc_hibernate_aop.entity.Client;

import java.util.List;

public interface ClientService {

    public List<Client> getAllClients();

    public void saveClient(Client client);
}
