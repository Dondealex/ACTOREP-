package metier;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import entities.*;
import repository.*;
import metier.IProfilMetier;

@Service("profilMetier")
public class ProfilMetierImpl implements IProfilMetier {
	
	private static String stDesact = "P002";
	private static String stVlid = "P003";
	
	@Autowired
	@Qualifier("profilRep")
	private IProfilRepository profilRep;
	
	@Autowired
	private StatutDaoImpl statutRep;
	
	@Override
	public Profil addProfil(String presentation, byte[] photoProfil, String offre, Date dateCreation,
			Date dateModification, Date dateDesactivation, Compte compte) {
		
		Profil profil = new Profil();
		Statut statut = statutRep.selectStatutById(stVlid);
		profil.setCompte(compte);
		profil.setDateCreation(new Date());
		profil.setDateDesactivation(null);
		profil.setDateModification(new Date());
		profil.setOffre(offre);
		profil.setPhotoProfil(photoProfil);
		profil.setPresentation(presentation);
		profil.setStatut(statut);
		profilRep.save(profil);
		
		return profil;
	}
	
	@Override
	public void AddAdminToProfil(Profil profil, Administrateur admin) {
		profil.getAdmins().add(admin);
	}

	@Override
	public void AddServiceToProfil(Profil profil, entities.Service service) {
		profil.getServices().add(service);
	}

	@Override
	public void AddReseauToProfil(Profil profil, ReseauSocial reseau) {
		profil.getReseaux().add(reseau);
	}

	@Override
	public Profil FindProfilById(Long id) {
		Profil profil = profilRep.findById(id).orElse(null);// il faut vérifier dans le controller la possibilité d'avoir un null
		return profil;
	}

	@Override
	public void updateProfil(Profil profil) {
		profil.setDateModification(new Date());
		profilRep.save(profil);
	}

	@Override
	public void deleteProfil(Profil profil) {
		profilRep.deleteById(profil.getId());
	}

	@Override
	public void desactiverProfil(Profil profil) {
		Statut statut = statutRep.selectStatutById(stDesact);
		profil.setDateDesactivation(new Date());
		profil.setStatut(statut);
	}

	@Override
	public List<Profil> findProfilAValider() {
		List<Profil> profils = profilRep.findProfilByIdStatus(stVlid);
		return profils;
	}

}
