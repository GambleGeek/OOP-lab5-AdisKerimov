package com.adiskerimov.spring.mvc_hibernate_aop.controller;

import com.adiskerimov.spring.mvc_hibernate_aop.entity.Client;
import com.adiskerimov.spring.mvc_hibernate_aop.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String showAllClients(Model model){

        List<Client> allClients = clientService.getAllClients();
        model.addAttribute("allClients", allClients);

        return "all-clients";
    }

    @RequestMapping("/addNewClient")
    public String addNewClient(Model model){

        Client client = new Client();
        model.addAttribute("newClient", client);

        return "client-info";
    }

    @RequestMapping("/saveClient")
    public String saveClient(@ModelAttribute("newClient")
                             @Valid final Client client,
                             final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "client-info";
        }
        clientService.saveClient(client);
        return "redirect:/";
    }
}
