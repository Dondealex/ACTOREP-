package repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import entities.Compte;
import entities.Profil;
import entities.Statut;
import entities.TypeActeur;
import entities.Ville;


public interface CompteDao {
	
	public Compte insertCompteIndividu(String nom, String prenom, String email, String mdp, String rue,
			String codePostal, String tel, Date dateNaiss, TypeActeur typeActeur,
			Statut statut, Ville ville);
	
	public Compte insertCompteOrganistion(String nomOrganisation, String email, String mdp, String rue,
			String codePostal, String tel, Date dateCrea, String numSiret, TypeActeur typeActeur,
			Statut statut, Ville ville);
	public Compte selectCompteById(Long idCompte);
	public List<Compte> selectAllCompte();
	public List<Compte> selectAllCompteByDept(Long idDept);
	public List<Compte> selectAllCompteByVille(Long idVille);
	public Compte updateCompteById(Long idCompte, String nom, String prenom, String nomOrganisation, String email, String mdp, String rue,
			String codePostal, String tel, Date dateNaiss, Date dateCrea, String numSiret, TypeActeur typeActeur,
			Statut statut, Ville ville);
	public void inactivationCompteById(Long idCompte);
	public void deleteCompteById(Long idCompte);

}
