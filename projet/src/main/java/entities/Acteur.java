package entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;


@Entity
public class Acteur {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column()
	private Long id;
	@Column( length = 75, nullable = false)
	private String nom;
	
	@Column( length = 300,nullable =false)
	private String description;
	
	@ManyToOne
	private Categories categorie;
	
	@OneToMany (mappedBy = "Acteur")
	private Collection<Service>service;
	
	public Acteur() {
	service = new ArrayList<>();
}

	
public Acteur(String nom, String description) {
	this.nom = nom;
	this.description=description;
	
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
	return "Acteur [id=" + id +"Nom=  "+ nom + ", Description=" + description + "]";
}
}
