package com.example.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@SuppressWarnings("serial")
@Entity
public class Client implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String nom;
  
    private String email;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Compte> comptes;
    
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}


}
