package com.groupe9.model;
// Generated 9 mars 2022, 10:44:53 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ComandePlats generated by hbm2java
 */
@SuppressWarnings({ "serial", "unused" })
@Entity
@Table(name = "comande_plats", catalog = "restaurant")
public class ComandePlats implements java.io.Serializable {

	private Integer id;
	private Commandes commandes;
	private Plats plats;

	public ComandePlats() {
	}

	public ComandePlats(Commandes commandes, Plats plats) {
		this.commandes = commandes;
		this.plats = plats;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commande_id", nullable = false)
	public Commandes getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Commandes commandes) {
		this.commandes = commandes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plat_id", nullable = false)
	public Plats getPlats() {
		return this.plats;
	}

	public void setPlats(Plats plats) {
		this.plats = plats;
	}

}
