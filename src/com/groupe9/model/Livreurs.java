package com.groupe9.model;
// Generated 9 mars 2022, 10:44:53 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Livreurs generated by hbm2java
 */
@Entity
@Table(name = "livreurs", catalog = "restaurant", uniqueConstraints = { @UniqueConstraint(columnNames = "cni"),
		@UniqueConstraint(columnNames = "contact") })
public class Livreurs implements java.io.Serializable {

	private Integer id;
	private String nom;
	private String adresse;
	private String cni;
	private String contact;
	private Set<Commandes> commandeses = new HashSet<Commandes>(0);

	public Livreurs() {
		
	}

	public Livreurs(String nom, String adresse, String cni, String contact) {
		this.nom = nom;
		this.adresse = adresse;
		this.cni = cni;
		this.contact = contact;
	}

	public Livreurs(String nom, String adresse, String cni, String contact, Set<Commandes> commandeses) {
		this.nom = nom;
		this.adresse = adresse;
		this.cni = cni;
		this.contact = contact;
		this.commandeses = commandeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nom", nullable = false, length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "adresse", nullable = false, length = 50)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "cni", unique = true, nullable = false, length = 50)
	public String getCni() {
		return this.cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	@Column(name = "contact", unique = true, nullable = false, length = 50)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "livreurs")
	public Set<Commandes> getCommandeses() {
		return this.commandeses;
	}

	public void setCommandeses(Set<Commandes> commandeses) {
		this.commandeses = commandeses;
	}

}
