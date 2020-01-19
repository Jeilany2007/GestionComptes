package com.example.metier;

import com.example.dao.ClientRepository;
import com.example.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientMetierImp implements ClientMetier {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public List<Client> listClient() {
        return clientRepository.findAll();
    }
}
