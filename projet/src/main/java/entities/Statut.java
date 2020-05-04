package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

	public Statut() {
		
	}

	public Statut(Long id, String nom) {
		this.id = id;
		this.nom = nom;
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
