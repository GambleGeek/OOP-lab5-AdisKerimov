package com.adiskerimov.spring.mvc_hibernate_aop.service;

import com.adiskerimov.spring.mvc_hibernate_aop.dao.ClientDAO;
import com.adiskerimov.spring.mvc_hibernate_aop.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientDAO clientDAO;

    @Override
    @Transactional
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Override
    @Transactional
    public void saveClient(Client client) {
        clientDAO.saveClient(client);
    }
}
