	package com.ACTOREP.demo;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import entities.Compte;
import entities.Departement;
import entities.Statut;
import entities.TypeActeur;
import entities.Ville;
import repository.CompteDao;
import repository.CompteDaoImpl;
import repository.TypeActeurDao;
import repository.TypeActeurDaoImpl;
import repository.VilleDao;

@SpringBootApplication
@ComponentScan(basePackages = {"repository","controller","metier","session"})
@EntityScan(basePackages = {"entities"})
public class ProjetApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplicationMain.class, args);
	}
	
	@Autowired
	VilleDao villeDao;
	
	@Autowired
	TypeActeurDao TypeActeurDao;
	
	@Autowired
	CompteDao compteDao;
	
	@Autowired
	private EntityManager em;
	
	@Bean
	CommandLineRunner myMain() {
		return args -> {
			
			System.out.println(" <<<<<<<<<<< dans le Main");

			// ********************** VILLE **********************
						//Insertion de ville
						/*Departement dept = new Departement(7L);
						System.out.println(" <<<<<<<<<<< Dept "); 
						
						villeDao.insertVille("Clichy", dept);
						System.out.println(" <<<<<<<<<<< Clichy");	
						
						villeDao.insertVille("Paris", dept);
						System.out.println(" <<<<<<<<<<< Paris");
						
						villeDao.insertVille("Cergy", dept);
						System.out.println(" <<<<<<<<<<< Cergy");*/
			
				//select d'une ville
			/*Ville v = villeDao.selectVilleById(2L);
			System.out.println("ville avec id = 2");
			System.out.println(v);*/
			
			//select toutes les villes d'un dept
			/*List<Ville> liste =  villeDao.selectAllVilleDept(7L);
			System.out.println("select toutes les villes d'un dept");
			System.out.println(liste);*/
			
			// MAJ d'une ville
			/*villeDao.updateVilleById(1L, "Reims", 8L);*/
			
			// Supprimer une ville
			/*villeDao.deleteVilleById(1L);*/
			
			
						
						
						// ********************** TYPE ACTEUR **********************
						// insertion Type d'acteur
						/*TypeActeurDao.insertTypeActeur("Personne", "personne réelle");
						TypeActeurDao.insertTypeActeur("Organise", "société"); */
						
						/*modification Type d'acteur
						//centreDAOTypeActeur.updateTypeActeur(2L, "eh eh", "iiiiiiiiiiiii");
						
						
						// delete Type d'acteur
						//centreDAOTypeActeur.deleteTypeActeur(1L);
						
						
						
						// Select Type d'acteur
						TypeActeur ta0 = centreDAOTypeActeur.selectTypeActeurById(1L);
						
						// Select de tous les types d'acteur
						centreDAOTypeActeur.selectTypeActeur();
						*/
			
						
			// ********************** COMPTE **********************
			
			
			//insertion compte
			/*Date dt01 = new Date();
			Date dt02 = new Date(1986, 11, 23);
			TypeActeur ta01 = em.find(TypeActeur.class, 1L);
			TypeActeur ta02 = em.find(TypeActeur.class, 2L);
			Statut st01 = em.find(Statut.class, "1");
			Statut st02 = em.find(Statut.class, "2");
			Ville v01 = em.find(Ville.class, 2L);
			Ville v02 = em.find(Ville.class, 3L);*/
					
			/*compteDao.insertCompteIndividu("Pitt", "Brad", "brad.pitt@gmail.com", "bpitt", "12 rue joli", "75005", "333333", dt01, ta01, st01, v01);
			compteDao.insertCompteIndividu("Kakou", "Alban", "kakou.alban@hotmail.com", "kalb", "70 rue du javelot", "75013", "5555", dt02, ta02, st02, v02);*/
			
			/*compteDao.insertCompteOrganistion("MSF", "msf@orga.fr", "msf", "9 rue des medecins", "69001", "8888", dt02, "rsc555", ta02, st01, v01);
			compteDao.insertCompteOrganistion("HJH", "HJH@hotmail.fr", "HJH", "13 rue pinedes", "75009", "22222", dt01, "sts999", ta01, st02, v02);*/
			
			//select d'un compte
			Compte c01 = compteDao.selectCompteById(7L);
			System.out.println(c01);
			
			
						
						System.out.println(" <<<<<<<<<<< FIN >>>>>>>>>>>>");
						
			
		};
	}
	
	

}

