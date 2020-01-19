package com.example.metier;

import com.example.dao.CompteRepository;
import com.example.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CompteMetierImp implements CompteMetier {
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public Compte saveCompte(Compte cp) {
        cp.setDateCreation(new Date());
        return compteRepository.save(cp);
    }

    @Override
    public Compte getCompte(String code) {
        return compteRepository.getOne(code);
    }
}
