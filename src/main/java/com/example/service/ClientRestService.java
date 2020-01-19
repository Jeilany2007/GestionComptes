package com.example.service;

import com.example.entities.Client;
import com.example.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientRestService {
    @Autowired
    private ClientMetier clientMetier;

    @PostMapping(value = "/listclients")
    public Client saveClient(@RequestBody Client c) {
        return clientMetier.saveClient(c);
    }
    @GetMapping(value = "/listclients")
    public List<Client> listClient() {
        return clientMetier.listClient();
    }


}
