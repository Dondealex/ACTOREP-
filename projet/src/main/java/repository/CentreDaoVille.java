package repository;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.*;


@Repository
@Transactional
public class CentreDaoVille {
	
	@Autowired
	private EntityManager em;
	
	
	public Ville insertVille (String nom, Departement departement) {
		System.out.println("insert ville");
		Ville v = new Ville (nom);
		v.setDepartement(departement);
		em.persist(v);
		return v ;
	}
	
	

}
