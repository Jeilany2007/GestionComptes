package com.example.service;

import com.example.entities.Compte;
import com.example.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompteRestService {
    @Autowired
    private CompteMetier compteMetier;

    @PostMapping(value = "/listComptes")
    public Compte saveCompte(@RequestBody Compte cp) {
        return compteMetier.saveCompte(cp);
    }

    @GetMapping(value = "/listComptes/{code}")
    public Compte getCompte(@PathVariable String code) {
        return compteMetier.getCompte(code);
    }


}
