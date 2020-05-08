package repository;

import java.util.List;

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
	public List<Categorie> selectCategorieById(String labelCategorie) {
		String jpql ="select * from Categorie s where c.categories.label = :paramLabel";
		TypedQuery<Categorie> qr = em.createQuery(jpql,Categorie.class);
		qr.setParameter("paramLabel", labelCategorie);
		List<Categorie> result = qr.getResultList();
		return result;
	}
	

}
