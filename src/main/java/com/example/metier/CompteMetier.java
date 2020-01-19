package com.example.metier;

import com.example.entities.Compte;

import java.util.List;

public interface CompteMetier {
    public Compte saveCompte(Compte cp);
    public Compte getCompte(String code);
}
