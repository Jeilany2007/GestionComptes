package com.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OP",discriminatorType = DiscriminatorType.STRING,length = 1)

public abstract class Operation implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
    private Long numero;
  
    private Date dateOperation;
   
    private double monatnt;
   
    @ManyToOne
    @JoinColumn(name = "CODE_CPTE")
    private Compte compte;
	@ManyToOne
	@JoinColumn(name = "CODE_EMP")
    private Employee employee;

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Date dateOperation, double monatnt, Compte compte) {
		super();
		this.dateOperation = dateOperation;
		this.monatnt = monatnt;
		this.compte = compte;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMonatnt() {
		return monatnt;
	}

	public void setMonatnt(double monatnt) {
		this.monatnt = monatnt;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

}
