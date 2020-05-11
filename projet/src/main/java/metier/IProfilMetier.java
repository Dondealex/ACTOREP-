package metier;

import java.util.*;
import entities.*;

public interface IProfilMetier {
	
	public Profil addProfil(String presentation, byte[] photoProfil, String offre, Date dateCreation, Date dateModification,
			Date dateDesactivation, Compte compte);
	
	public Profil FindProfilById(Long id);
	
	public void updateProfil(Profil profil);
	
	public void deleteProfil(Profil profil);
	
	public void desactiverProfil(Profil profil);
	
	public void AddAdminToProfil(Profil profil, Administrateur admin);
	
	public void AddServiceToProfil(Profil profil, Service service);
	
	public void AddReseauToProfil(Profil profil, ReseauSocial reseau);
	
	public List<Profil> findProfilAValider();

}
