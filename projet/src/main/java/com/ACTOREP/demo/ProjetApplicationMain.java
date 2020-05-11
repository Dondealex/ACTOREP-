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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


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
import repository.DepartementRepository;

import entities.Administrateur;
import entities.ReseauSocial;
import entities.Statut;
import repository.AdminDaoImpl;
import repository.ResSocDaoImpl;
import repository.StatutDaoImpl;


@SpringBootApplication
@ComponentScan(basePackages = {"repository","controller","metier","session"})
@EntityScan(basePackages = {"entities"})
@EnableJpaRepositories(basePackageClasses = DepartementRepository.class)

public class ProjetApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplicationMain.class, args);
	}

@Autowired
AdminDaoImpl amd;

@Autowired
StatutDaoImpl std;
	
@Autowired
ResSocDaoImpl rsd;

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
	
		Administrateur ad01 = amd.insertAdmin("dtan", "123456", "Tan", "Dany", "A00001", new Date());
		Administrateur ad02 = amd.insertAdmin("ikakou", "123456", "Kakou", "Ingrid", "A00002", new Date());
		Administrateur ad03 = amd.insertAdmin("nboumediene", "123456", "Boumediene", "Nawel", "A00003", new Date());
		Administrateur ad04 = amd.insertAdmin("anaudin", "123456", "Naudin", "Alexandre", "A00004", new Date());
		
		Statut st01 = std.insertStatut("A001", "Activer l'administrateur", "Administrateur");
		Statut st02 = std.insertStatut("A002", "Désactiver l'administrateur", "Administrateur");
		Statut st03 = std.insertStatut("P001", "Activer le profil", "Profil");
		Statut st04 = std.insertStatut("P002", "Désactiver le profil", "Profil");
		Statut st05 = std.insertStatut("P003", "Profil en cours de validation", "Profil");
		Statut st06 = std.insertStatut("P004", "Profil bloqué par l'administrateur", "Profil");
		Statut st07 = std.insertStatut("C001", "Activer le compte", "Compte");
		Statut st08 = std.insertStatut("C002", "Désactiver le compte", "Compte");

		ReseauSocial rs01 = rsd.insertReseauSoc("Youtube", "aaaaaaaa");
		ReseauSocial rs02 = rsd.insertReseauSoc("LinkedIn", "bbbbbbbb");
		
		Departement dept = new Departement(7L);
		villeDao.insertVille("Clichy", dept);
		villeDao.insertVille("Paris", dept);
		villeDao.insertVille("Cergy", dept);
		
		TypeActeurDao.insertTypeActeur("Personne", "personne réelle");
		TypeActeurDao.insertTypeActeur("Organise", "société");
		
		Date dt01 = new Date();
		Date dt02 = new Date(1986, 11, 23);
		TypeActeur ta01 = em.find(TypeActeur.class, 1L);
		TypeActeur ta02 = em.find(TypeActeur.class, 2L);
		Statut stt01 = em.find(Statut.class, "C001");
		Statut stt02 = em.find(Statut.class, "C002");
		Ville v01 = em.find(Ville.class, 1L);
		Ville v02 = em.find(Ville.class, 2L);	
		compteDao.insertCompteIndividu("Pitt", "Brad", "brad.pitt@gmail.com", "bpitt", "12 rue joli", "75005", "333333", dt01, ta01, stt01, v01);
		compteDao.insertCompteIndividu("Kakou", "Alban", "kakou.alban@hotmail.com", "kalb", "70 rue du javelot", "75013", "5555", dt02, ta02, stt02, v02);
		compteDao.insertCompteOrganistion("MSF", "msf@orga.fr", "msf", "9 rue des medecins", "69001", "8888", dt02, "rsc555", ta02, st01, v01);
		compteDao.insertCompteOrganistion("HJH", "HJH@hotmail.fr", "HJH", "13 rue pinedes", "75009", "22222", dt01, "sts999", ta01, st02, v02);
		
	
			
						
						System.out.println(" <<<<<<<<<<< FIN >>>>>>>>>>>>");
						
			
		};
	}
	

}

