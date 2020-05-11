package entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class Service implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 75, nullable = false)
	private String nom;
	
	@Column( length = 200, nullable = false)
	private String description;
	
	@ManyToOne
	private Acteur acteur;
	
	@ManyToMany
	private Collection<Profil> profils;
	
	public Service() {
		profils = new ArrayList<>();
	}
	
	public Service(String nom, String description) {
		this();
		this.nom = nom;
		this.description=description;
		
	}
	
	
	public Service(String nom, String description, Acteur acteur) {
		this();
		this.nom = nom;
		this.description = description;
		this.acteur = acteur;
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
	
	@Override
	public String toString() {
		return "Service [id=" + id +"Nom=  "+ nom + ", Description=" + description + "]";
	}

}
