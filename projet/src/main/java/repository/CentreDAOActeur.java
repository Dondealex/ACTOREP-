package repository;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.*;


@Repository
@Transactional
public class CentreDAOActeur {
	
	@Autowired
	private EntityManager em;
	
	public Acteur insertActeur (String nom, String description) {
		Acteur a = new Acteur(nom,description);
		em.persist(a);
		return a;
	}
	public Acteur selectActeurById(Long idActeur) {
		Acteur result = em.find(Acteur.class, idActeur);
		return result;
	}
	
}
