package entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;


@Entity
public class TypeActeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 75, nullable = false)
	private String nom;
	
	@Column(unique = true, length = 100, nullable = false)
	private String description;
	
	@OneToMany //(mappedBy = "typeActeur")
	private Collection<Compte> comptes;

	public TypeActeur() {
		comptes = new ArrayList<>();
	}

	public TypeActeur(Long id, String nom, String description, Collection<Compte> comptes) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.comptes = comptes;
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

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "TypeActeur [id=" + id + ", nom=" + nom + ", description=" + description + ", comptes=" + comptes + "]";
	}

	
	
	
	
	
	
	

}
