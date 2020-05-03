package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Administrateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 30, nullable = false)
	private String identifiant;
	
	@Column(unique = true, length = 30, nullable = false)
	private String mdp;
	
	@Column(length = 80, nullable = false)
	private String nom;
	
	@Column(length = 80, nullable = false)
	private String prenom;
	
	@Column(unique = true, length = 20, nullable = false)
	private String numEmploye;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEntree;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateSortie;

	public Administrateur() {
		
	}

	public Administrateur(String identifiant, String mdp, String nom, String prenom, String numEmploye,
			Date dateEntree) {
		this.identifiant = identifiant;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.numEmploye = numEmploye;
		this.dateEntree = dateEntree;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumEmploye() {
		return numEmploye;
	}

	public void setNumEmploye(String numEmploye) {
		this.numEmploye = numEmploye;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Administrateur [id=" + id + ", identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom
				+ ", numEmploye=" + numEmploye + ", dateEntree=" + dateEntree + ", dateSortie=" + dateSortie + "]";
	}
	
}
