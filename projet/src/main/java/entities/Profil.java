package entities;

import java.util.*;
import javax.persistence.*;

@Entity
public class Profil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "Presentation", length = 612, nullable = false)
	private String presentation;
	
	@Lob
	@Column(name = "Photo")
	private byte[] photoProfil;
	
	@Column(name = "Offre", length = 612, nullable = false)
	private String offre;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateCreation", nullable = false)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModification;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDesactivation;
	
	@ManyToOne
	private Compte compte;
	
	@ManyToOne
	private Statut statut;
	
	@OneToMany//(mappedBy = "Profil")
	private Collection<ReseauSocial> reseaux;
	
	@ManyToMany//(mappedBy = "Profil")
	private Collection<Administrateur> admins;

	@ManyToMany//(mappedBy = "Profil")
	private Collection<Service> services;


	public Profil() {
		reseaux= new ArrayList<>();
		admins= new ArrayList<>();
		services= new ArrayList<>();
	}

	public Profil(String presentation, byte[] photoProfil, String offre, Date dateCreation,
			Date dateModification, Date dateDesactivation) {
		this();
		this.presentation = presentation;
		this.photoProfil = photoProfil;
		this.offre = offre;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.dateDesactivation = dateDesactivation;
	}

	public Profil(String presentation, String offre, Date dateCreation, Date dateModification, Date dateDesactivation) {
		this();
		this.presentation = presentation;
		this.offre = offre;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.dateDesactivation = dateDesactivation;
	}


	public Profil(String presentation, byte[] photoProfil, String offre, Date dateCreation, Date dateModification,
			Date dateDesactivation, Compte compte, Statut statut, Collection<ReseauSocial> reseaux,
			Collection<Administrateur> admins, Collection<Service> services) {
		this();
		this.presentation = presentation;
		this.photoProfil = photoProfil;
		this.offre = offre;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.dateDesactivation = dateDesactivation;
		this.compte = compte;
		this.statut = statut;
		this.reseaux = reseaux;
		this.admins = admins;
		this.services = services;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Collection<ReseauSocial> getReseaux() {
		return reseaux;
	}

	public void setReseaux(Collection<ReseauSocial> reseaux) {
		this.reseaux = reseaux;
	}

	public Collection<Administrateur> getAdmins() {
		return admins;
	}

	public void setAdmins(Collection<Administrateur> admins) {
		this.admins = admins;
	}

	public Collection<Service> getServices() {
		return services;
	}

	public void setServices(Collection<Service> services) {
		this.services = services;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public byte[] getPhotoProfil() {
		return photoProfil;
	}

	public void setPhotoProfil(byte[] photoProfil) {
		this.photoProfil = photoProfil;
	}

	public String getOffre() {
		return offre;
	}

	public void setOffre(String offre) {
		this.offre = offre;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public Date getDateDesactivation() {
		return dateDesactivation;
	}

	public void setDateDesactivation(Date dateDesactivation) {
		this.dateDesactivation = dateDesactivation;
	}
	
	

	@Override
	public String toString() {
		return "Profil [id=" + id + ", presentation=" + presentation + ", offre=" + offre + ", dateCreation=" + dateCreation 
				+ ", dateModification=" + dateModification + ", dateDesactivation=" + dateDesactivation + "]";
	}
	
	

}

