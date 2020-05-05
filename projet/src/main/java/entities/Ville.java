package entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity

public class Ville {
	
	@Id
	@Column(name = "Nom",length = 256)
	private String nom;
	
	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	@ManyToOne
	private Departement departement;
	
	@OneToMany
	private Collection<Compte> comptes;

	public Ville() {
		comptes = new ArrayList<>();
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
