package repository;

import javax.persistence.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.*;

@Repository
@Transactional
public class CentreDAOService {
	
	@Autowired
	private EntityManager em;
	
	
	
	public Service insertService(String nom, String description, Acteur acteur) {
		Service s = new Service(nom, description, acteur);
		em.persist(s);
		return s ;
	
}
	
	
	public List<Service> selectServiceById(String labelService) {
	
		String jpql ="select * from Service s where s.services.label = :paramLabel";
		TypedQuery<Service> qr = em.createQuery(jpql,Service.class);
		qr.setParameter("paramLabel", labelService);
		List<Service> result = qr.getResultList();
		return result;
	}
}
