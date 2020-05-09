package metier;

import entities.Profil;
import repository.ProfilRepository;

public class ProfilMetierImpl implements ProfilMetier {
	
	ProfilRepository profilRep;
	
	public void saveProfil(Profil profil) {
		profilRep.save(profil);
	}
	
	
	
	

}
