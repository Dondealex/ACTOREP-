package repository;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.*;


@Repository
@Transactional
public class CentreDAOTypeActeur {
	
	@Autowired
	private EntityManager em;
	
	public TypeActeur insertTypeActeur(String nom, String description) {
		TypeActeur ta = new TypeActeur(nom, description);
		em.persist(ta);		
		return ta;
	}
	
	public TypeActeur selectTypeActeurById(Long id) {
		TypeActeur ta = em.find(TypeActeur.class, id);
		return ta;
	}
	
	public List<TypeActeur> selectTypeActeur() {
		String jpql = "select t from TypeActeur t ";
		Query qr = em.createQuery(jpql);
		List<TypeActeur> result = qr.getResultList();
		return result; 
	}
	
	public void updateTypeActeurById(Long id, String nom, String description) {
		TypeActeur ta = em.find(TypeActeur.class, id);
		ta.setNom(nom);
		ta.setDescription(description);
	}
	
	public void deleteTypeActeurById(Long id) {
		TypeActeur ta = em.find(TypeActeur.class, id);
		em.remove(ta);		
		
	}

}
