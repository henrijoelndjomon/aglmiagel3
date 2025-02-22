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
 * Tables generated by hbm2java
 */
@Entity
@Table(name = "tables", catalog = "restaurant", uniqueConstraints = @UniqueConstraint(columnNames = "numero"))
public class Tables implements java.io.Serializable {

	private Integer id;
	private int numero;
	private boolean etat;
	private Set<Commandes> commandeses = new HashSet<Commandes>(0);

	public Tables() {
	}

	public Tables(int numero, boolean etat) {
		this.numero = numero;
		this.etat = etat;
	}

	public Tables(int numero, boolean etat, Set<Commandes> commandeses) {
		this.numero = numero;
		this.etat = etat;
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

	@Column(name = "numero", unique = true, nullable = false)
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Column(name = "etat", nullable = false)
	public boolean isEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tables")
	public Set<Commandes> getCommandeses() {
		return this.commandeses;
	}

	public void setCommandeses(Set<Commandes> commandeses) {
		this.commandeses = commandeses;
	}

}
