package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Service {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	
	@Column()
	private Long id;
	
	@Column(length = 75, nullable = false)
	private String nom;
	
	@Column( length = 200,nullable =false)
	private String description;
	
	@ManyToOne
	private Acteur acteurs;
	
	@ManyToMany
	private Collection<Profil> profils;
	
	
	public Service(String nom, String description) {
		this.nom = nom;
		this.description=description;
		
	}
	
	public Service() {
		
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
