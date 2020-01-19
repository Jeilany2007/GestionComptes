package com.example.metier;

import com.example.entities.Client;

import java.util.List;

public interface ClientMetier {
    public Client saveClient(Client c);
    public List<Client> listClient();
}
