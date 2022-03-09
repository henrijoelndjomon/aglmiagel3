package com.groupe9.model;
// Generated 9 mars 2022, 10:44:53 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Paiements generated by hbm2java
 */
@Entity
@Table(name = "paiements", catalog = "restaurant")
public class Paiements implements java.io.Serializable {

	private Integer id;
	private int montant;
	private int modePaiement;
	private boolean etat;
	private Date datePaiement;
	private Set<Commandes> commandeses = new HashSet<Commandes>(0);

	public Paiements() {
	}

	public Paiements(int montant, int modePaiement, boolean etat) {
		this.montant = montant;
		this.modePaiement = modePaiement;
		this.etat = etat;
	}

	public Paiements(int montant, int modePaiement, boolean etat, Date datePaiement, Set<Commandes> commandeses) {
		this.montant = montant;
		this.modePaiement = modePaiement;
		this.etat = etat;
		this.datePaiement = datePaiement;
		this.commandeses = commandeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "montant", nullable = false)
	public int getMontant() {
		return this.montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	@Column(name = "mode_paiement", nullable = false)
	public int getModePaiement() {
		return this.modePaiement;
	}

	public void setModePaiement(int modePaiement) {
		this.modePaiement = modePaiement;
	}

	@Column(name = "etat", nullable = false)
	public boolean isEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_paiement", length = 19)
	public Date getDatePaiement() {
		return this.datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paiements")
	public Set<Commandes> getCommandeses() {
		return this.commandeses;
	}

	public void setCommandeses(Set<Commandes> commandeses) {
		this.commandeses = commandeses;
	}

}
