package entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Statut {
	@Id
	private Long id;
	
	@Column(unique = true, length = 80, nullable = false)
	private String nom;
	
	@Column(length = 200, nullable = true)
	private String description;
	
	@Column(nullable = true) 
	private Boolean admin;
	
	@OneToMany(mappedBy = "statut")
	private Collection<Administrateur> admins;
	
	@OneToMany(mappedBy = "statut")
	private Collection<Compte> comptes;
	
	@OneToMany(mappedBy = "statut" )
	private Collection<Profil> profils;

	// CONSTRUCTORS
	public Statut() {
		admins = new ArrayList<>();
		comptes = new ArrayList<>();
	}

	public Statut(Long id, String nom) {
		this();
		this.id = id;
		this.nom = nom;
	}
	
	// GETTERS AND SETTERS
	public Collection<Profil> getProfils() {
		return profils;
	}

	public void setProfils(Collection<Profil> profils) {
		this.profils = profils;
	}
	
	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
	public Collection<Administrateur> getAdmins() {
		return admins;
	}

	public void setAdmins(Collection<Administrateur> admins) {
		this.admins = admins;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Statut [id=" + id + ", nom=" + nom + ", admin=" + admin + "]";
	}	
}
