package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import entities.Profil;
import repository.ProfilRepository;

@Service("profilMetier")
public class ProfilMetierImpl implements ProfilMetier {
	
	@Autowired
	@Qualifier("profilRep")
	private ProfilRepository profilRep;
	
	public void saveProfil(Profil profil) {
		profilRep.save(profil);
	}
	
	
	
	

}
