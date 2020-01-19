package com.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings("serial")
@Entity
@Table(name = "GROUPES")
public class Groupe implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeGroup;
    private String nomGroup;
    @ManyToMany(mappedBy = "groupes")
    private Collection<Employee> employee;

    public Groupe() {
        super();
    }
    public Groupe(String nomGroup) {
        super();
        this.nomGroup=nomGroup;
    }

    public Long getCodeGroup() {
        return codeGroup;
    }

    public void setCodeGroup(Long codeGroup) {
        this.codeGroup = codeGroup;
    }

    public String getNomGroup() {
        return nomGroup;
    }

    public void setNomGroup(String nomGroup) {
        this.nomGroup = nomGroup;
    }

    public Collection<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Collection<Employee> employee) {
        this.employee = employee;
    }
}
