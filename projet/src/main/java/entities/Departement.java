package entities;


import javax.persistence.*;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column( length = 55, nullable = false)
	private String nom;
	
	@Column( length = 55, nullable = false)
	private String numéroD;
	
	@ManyToOne
	private Pays pays;

	public Departement() {
		super();
	}

	public Departement(String nom, String numéroD) {
		super();
		this.nom = nom;
		this.numéroD = numéroD;
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

	public String getNuméroD() {
		return numéroD;
	}

	public void setNuméroD(String numéroD) {
		this.numéroD = numéroD;
	}

	@Override
	public String toString() {
		return "Departement [nom=" + nom + ", numéroD=" + numéroD + "]";
	}	

}
