package com.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE",discriminatorType = DiscriminatorType.STRING,length = 2)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type")
@JsonSubTypes({
		@JsonSubTypes.Type(name = "CC",value = CompteCourant.class),
		@JsonSubTypes.Type(name = "CE",value = CompteEpargne.class)
})

public abstract class Compte implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    private String codeCompte;
    private Date dateCreation;
    private double solde;
    
    @ManyToOne
    @JoinColumn(name = "CODE_CLIENT")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Client client;
    @ManyToOne
	@JoinColumn(name="CODE_EMP")
    private Employee employee;
    @OneToMany(mappedBy = "compte")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Operation> operations;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}

}
