package com.example.entities;


 

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")

public class Retrait extends Operation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Date dateOperation, double monatnt, Compte compte) {
		super(dateOperation, monatnt, compte);
		// TODO Auto-generated constructor stub
	}
	
	
}
