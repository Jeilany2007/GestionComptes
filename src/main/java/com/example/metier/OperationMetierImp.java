package com.example.metier;

import com.example.dao.CompteRepository;
import com.example.dao.EmployeeRepository;
import com.example.dao.OpertaionRepository;
import com.example.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
@Transactional
@Service
public class OperationMetierImp implements OperationMetier {
    @Autowired
    private OpertaionRepository opertaionRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override

    public boolean verser(String code, double montant, Long codeEmp) {
        Compte cp = compteRepository.getOne(code);
        Employee e= employeeRepository.getOne(codeEmp);
        Operation op = new Versement();
        op.setDateOperation(new Date());
        op.setMonatnt(montant);
        op.setCompte(cp);
        op.setEmployee(e);
        opertaionRepository.save(op);
        cp.setSolde(cp.getSolde()+montant);
        return true;
    }

    @Override
    public boolean retirer(String code, double montant, Long codeEmp) {
        Compte cp = compteRepository.getOne(code);
        if (cp.getSolde()<montant) throw new RuntimeException("Solde Insuffisant!");
        Employee e= employeeRepository.getOne(codeEmp);
        Operation op = new Retrait();
        op.setDateOperation(new Date());
        op.setMonatnt(montant);
        op.setCompte(cp);
        op.setEmployee(e);
        opertaionRepository.save(op);
        cp.setSolde(cp.getSolde()-montant);
        return true;
    }

    @Override
    public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
        retirer(cpte1,montant,codeEmp);
        verser(cpte2,montant,codeEmp);
        return true;
    }

    @Override
    public PageOperation getOperation(String code, int page, int size) {
        Page<Operation> ops=opertaionRepository.getOperation(code, PageRequest.of( page,size));
        PageOperation pageOperation= new PageOperation();
        pageOperation.setOperations(ops.getContent());
        pageOperation.setNombreOperations(ops.getNumberOfElements());
        pageOperation.setPage(ops.getNumber());
        pageOperation.setTotalPages(ops.getTotalPages());
        return pageOperation;
    }
}
