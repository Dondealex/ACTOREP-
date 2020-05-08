package repository;

import java.util.List;

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
	public List<Acteur> selectActeurById(String labelActeur) {
		String jpql ="select * from Acteur a where a.acteurs.label = :paramLabel";
		TypedQuery<Acteur> qr = em.createQuery(jpql,Acteur.class);
		qr.setParameter("paramLabel", labelActeur);
		List<Acteur> result = qr.getResultList();
		return result;
	}
	
}
