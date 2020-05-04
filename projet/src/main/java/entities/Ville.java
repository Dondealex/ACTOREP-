package entities;

import javax.persistence.*;

@Entity

public class Ville {
	
	@Id
	@Column(name = "Nom",length = 256)
	private String nom;
	
	@ManyToOne
	private Departement departement;

	public Ville() {
	}

	public Ville(String nom, Departement departement) {
		this.nom = nom;
		this.departement = departement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
}
