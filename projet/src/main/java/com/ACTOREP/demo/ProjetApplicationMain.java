package com.ACTOREP.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import entities.Departement;
import entities.TypeActeur;
import repository.CentreDAOTypeActeur;
import repository.CentreDaoVille;

@SpringBootApplication
@ComponentScan (basePackages = {"repository"})
@EntityScan (basePackages = {"entities"})
public class ProjetApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplicationMain.class, args);
	}
	
	@Autowired
	CentreDaoVille centreDaoVille;
	
	@Autowired
	CentreDAOTypeActeur centreDAOTypeActeur;
	
	@Bean
	CommandLineRunner myMain() {
		return args -> {
			
			System.out.println(" <<<<<<<<<<< dans le Main");

			// ********************** VILLE **********************
						// Ne fonctionne pas pour la Ville avec le département
						/*Departement dept = new Departement(7L);
						System.out.println(" <<<<<<<<<<< Dept "); 
						
						centreDAOVille.insertVille("lichy", dept);
						System.out.println(" <<<<<<<<<<< Clichy");	
						
						centreDAOVille.insertVille("aris", dept);
						System.out.println(" <<<<<<<<<<< Paris");
						
						centreDAOVille.insertVille("ergy", dept);
						System.out.println(" <<<<<<<<<<< Cergy");*/
						
						
						// ********************** TYPE ACTEUR **********************
						// insertion Type d'acteur
					/*	centreDAOTypeActeur.insertTypeActeur("Personne", "personne réelle");
						centreDAOTypeActeur.insertTypeActeur("Organise", "société"); */
						
						/*modification Type d'acteur
						//centreDAOTypeActeur.updateTypeActeur(2L, "eh eh", "iiiiiiiiiiiii");
						
						
						// delete Type d'acteur
						//centreDAOTypeActeur.deleteTypeActeur(1L);
						
						
						
						// Select Type d'acteur
						TypeActeur ta0 = centreDAOTypeActeur.selectTypeActeurById(1L);
						
						// Select de tous les type d'acteur
						centreDAOTypeActeur.selectTypeActeur();
						*/
						
						System.out.println(" <<<<<<<<<<< FIN >>>>>>>>>>>>");
						
			
		};
	}
	
	
	

	
	

}
