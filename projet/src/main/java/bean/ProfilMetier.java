package bean;

import java.io.Serializable;
import entities.Profil;
import repository.ProfilRepository;

public class ProfilMetier implements Serializable{
	
	ProfilRepository profilRep;
	
	public void saveProfil(Profil profil) {
		profilRep.save(profil);
	}
	
	
	
	

}
