package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "Nom", length = 75, nullable = false)
	private String nom;
	
	@Column(name = "Description", length = 300,nullable =false)
	private String description;
	public Categories(String nom, String description) {
		this.nom = nom;
		this.description=description;
		
	}
	public Categories() {
		
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
