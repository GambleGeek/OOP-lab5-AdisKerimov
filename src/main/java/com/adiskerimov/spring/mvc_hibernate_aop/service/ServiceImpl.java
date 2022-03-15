package com.adiskerimov.spring.mvc_hibernate_aop.service;

import com.adiskerimov.spring.mvc_hibernate_aop.dao.ClientDAO;
import com.adiskerimov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.adiskerimov.spring.mvc_hibernate_aop.entity.Client;
import com.adiskerimov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceImpl implements ServiceI{

    @Autowired
    private ClientDAO clientDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

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

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }


}
