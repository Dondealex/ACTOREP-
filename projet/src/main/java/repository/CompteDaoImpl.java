package repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Compte;
import entities.Profil;
import entities.Statut;
import entities.TypeActeur;
import entities.Ville;

@Repository("compteDao")
@Transactional
public class CompteDaoImpl implements CompteDao  {	
	
	@Autowired
	private EntityManager em;

	
	@Override
	public Compte insertCompteIndividu(String nom, String prenom, String email, String mdp, String rue,
			String codePostal, String tel, Date dateNaiss, TypeActeur typeActeur,
			Statut statut, Ville ville) {
		Compte c = new Compte(nom, prenom, email, mdp, rue, codePostal, tel, dateNaiss, typeActeur, statut, ville);
		em.persist(c);
		return c;
	}

	@Override
	public Compte insertCompteOrganistion(String nomOrganisation, String email, String mdp, String rue,
			String codePostal, String tel, Date dateCrea, String numSiret, TypeActeur typeActeur, Statut statut,
			Ville ville) {
		Compte c = new Compte(nomOrganisation, email, mdp, rue,
				 codePostal, tel, dateCrea,  numSiret, typeActeur, statut,
				 ville);
		em.persist(c);
		return c;
	}

	@Override
	public Compte selectCompteById(Long idCompte) {
		Compte c = em.find(Compte.class, idCompte);
		return c;
	}

	@Override
	public List<Compte> selectAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> selectAllCompteByDept(Long idDept) {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public List<Compte> selectAllCompteByVille(Long idVille) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte updateCompteById(Long idCompte, String nom, String prenom, String nomOrganisation, String email,
			String mdp, String rue, String codePostal, String tel, Date dateNaiss, Date dateCrea, String numSiret,
			TypeActeur typeActeur, Statut statut, Ville ville) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inactivationCompteById(Long idCompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompteById(Long idCompte) {
		// TODO Auto-generated method stub
		
	}
	
}

	