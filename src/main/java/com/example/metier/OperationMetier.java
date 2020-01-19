package com.example.metier;

import com.example.entities.Compte;

public interface OperationMetier {
    public boolean verser(String code,double montant,Long codeEmp);
    public boolean retirer(String code,double montant,Long codeEmp);
    public boolean virement(String cpte1,String cpte2,double montant,Long codeEmp);
    public PageOperation getOperation(String code,int page,int size);


}
