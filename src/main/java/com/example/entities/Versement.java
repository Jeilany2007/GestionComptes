package com.example.entities;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")

public class Versement extends Operation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateOperation, double monatnt, Compte compte) {
		super(dateOperation, monatnt, compte);
		// TODO Auto-generated constructor stub
	}
	
	
}
