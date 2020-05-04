package entities;


import javax.persistence.*;

@Entity
public class Pays {
	
	@Id
	private String ISO3166;
	
	@Column( length = 55, nullable = false)
	private String nom;

	public Pays() {
		super();
	}

	public Pays(String iSO3166, String nom) {
		super();
		ISO3166 = iSO3166;
		this.nom = nom;
	}

	public String getISO3166() {
		return ISO3166;
	}

	public void setISO3166(String iSO3166) {
		ISO3166 = iSO3166;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Pays [ISO3166=" + ISO3166 + ", nom=" + nom + "]";
	}
	
	

}

