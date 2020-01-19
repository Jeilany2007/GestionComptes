package com.example.service;

import com.example.metier.OperationMetier;
import com.example.metier.PageOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationRestService {


    @Autowired
    private OperationMetier operationMetier;
    @PutMapping(value = "/versement")
    public boolean verser(
            @RequestParam String code,
            @RequestParam double montant,
            @RequestParam Long codeEmp) {
        return operationMetier.verser(code, montant, codeEmp);
    }

    @PutMapping(value = "/retrait")
    public boolean retirer(
            @RequestParam String code,
            @RequestParam double montant,
            @RequestParam Long codeEmp) {
        return operationMetier.retirer(code, montant, codeEmp);
    }

    @PutMapping(value = "/virement")
    public boolean virement(
            @RequestParam String cpte1,
            @RequestParam String cpte2,
            @RequestParam double montant,
            @RequestParam Long codeEmp) {
        return operationMetier.virement(cpte1, cpte2, montant, codeEmp);
    }

    @GetMapping(value = "/operations")
    public PageOperation getOperation(
            @RequestParam String code,
            @RequestParam int page,
            @RequestParam int size) {
        return operationMetier.getOperation(code, page, size);
    }

}
