package repository;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entities.*;
@Repository
@Transactional
public class CentreDAOCategorie {

	
	@Autowired
	private EntityManager em;
	
	public Categorie insertCategorie (String nom, String description) {
		
		
		Categorie c = new Categorie(nom,description);
		em.persist(c);
		return c;
	}
	public Categorie selectCategorieById(Long idCategorie) {
		Categorie result = em.find(Categorie.class, idCategorie);
		return result;
	}
}
