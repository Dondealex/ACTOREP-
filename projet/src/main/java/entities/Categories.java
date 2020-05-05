package entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Categories {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column()
	private Long id;
	@Column (length = 75, nullable = false)
	private String nom;
	
	@Column(length = 300,nullable =false)
	private String description;
	
	@OneToMany(mappedBy ="Catégories")
	private Collection<Acteur> acteur;
	
	public Categories(String nom, String description) {
		this.nom = nom;
		this.description=description;
		
	}
	public Categories() {
		acteur = new ArrayList<>();
			
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
		return "Catégories [id=" + id +"Nom=  "+ nom + ", Description=" + description + "]";
	}

}
