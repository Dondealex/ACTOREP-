package com.ACTOREP.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import entities.Administrateur;
import entities.ReseauSocial;
import entities.Statut;
import repository.AdminDaoImpl;
import repository.ResSocDaoImpl;
import repository.StatutDaoImpl;


@SpringBootApplication
@ComponentScan (basePackages = {"repository", "controller", "metier", "session"})
@EntityScan (basePackages = {"entities"})
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
	
@Bean
CommandLineRunner myMain() {
	return args -> {
	
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
		};
}
}
