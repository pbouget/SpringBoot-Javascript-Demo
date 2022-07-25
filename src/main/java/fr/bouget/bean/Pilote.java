package fr.bouget.bean;

import java.io.Serializable;

public class Pilote implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nom;
	private String site;

	public Pilote() {this(0,null, null);}
	
	/**
	 * Constructeur
	 * @param id
	 * @param nom
	 * @param site
	 */
	public Pilote(int id, String nom, String site) {
		super();
		this.id = id;
		this.nom = nom;
		this.site = site;
	}
	
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom 
	 */
	public void setNom(String nom) {
		this.nom = nom.toUpperCase();
	}

	/**
	 * @return site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site 
	 */
	public void setSite(String site) {
		this.site = site.toUpperCase();;
	}

	@Override
	public String toString() {
		return "Pilote : "+this.getId()+ " "+this.getNom()+ " "+this.getSite();
	}
	


}
