package controller;


import org.hibernate.mapping.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import metier.*;
import org.springframework.web.bind.annotation.RequestParam;

import entities.Acteur;
import entities.Categorie;
import entities.Compte;
import entities.Departement;
import entities.Profil;
import metier.DepartementMetierImpl;
import metier.ProfilMetierImpl;
import repository.CentreDAOActeur;
import repository.CentreDAOCategorie;
import repository.CompteDaoImpl;
import session.Imit01session;

@Controller
public class HomeCRTL {
	
	public HomeCRTL() {
	}

	@Autowired
	CompteDaoImpl compteImpl;
	
	@Autowired
	ProfilMetierImpl profilMet;
	
	@Autowired
	DepartementMetierImpl deparMet;
	
	@Autowired
	private Imit01session session01;
	
	@Autowired
	CentreDAOCategorie centreDAOCategorie;
	
	@Autowired
	CentreDAOActeur centreDAOActeur;
	
	@RequestMapping(value = {"/","/index"})
	public String afficheAccueil(Model model) {
		java.util.List<Categorie> categories = centreDAOCategorie.selectAllCategories();
		session01.setCategories(categories);
		
		java.util.List<Acteur> acteurs = centreDAOActeur.selectAllActeurs();
		session01.setActeurs(acteurs);
	
		return "frontOffice/jsp/jspHome";
	}
	
	@RequestMapping(value= "/rechercher")
	public String rechercher(@RequestParam(value="dept") String dept, Model model) {
		
		java.util.List<Profil> profils = profilMet.findProfilHome("Kinésithérapeute");
		model.addAttribute("profils", profils);

		
		return "frontOffice/jsp/jspResultatR";
	}
	
	@RequestMapping(value= "/seConnecter")
	public String seConnecter(@RequestParam  HashMap<String, String> params, Model model) {
		
		String email = params.get("email");
		String mdp = params.get("mdp");	
		Compte compte = compteImpl.seConnecterCompte(email, mdp);
		if(compte!=null) {
			session01.setCompteC(compte);
			return "frontOffice/jsp/jspProfil";
		}else {
			model.addAttribute("error1","Email/mot de passe incorrect");
			return "frontOffice/jsp/jspConnexion";
		}
	}
	
	@RequestMapping(value= "/vers-jspHome")
	public String afficherHome() {
		return "frontOffice/jsp/jspHome";
	}
	
	@RequestMapping(value = {"/vers-jspInscription"})
	public String afficheInscription() {
		return "frontOffice/jsp/jspInscription";
	}
	
	@RequestMapping(value = {"/vers-jspConnexion"})
	public String afficheConnexion() {
		return "frontOffice/jsp/jspConnexion";
	}
	
	@RequestMapping(value = {"/vers-jspContact"})
	public String afficheContact() {
		return "frontOffice/jsp/jspContact";
	}
	
	@RequestMapping(value = {"/vers-jspQuiSommesNous"})
	public String afficheQuiSommesNous() {
		return "frontOffice/jsp/jspQuiSommesNous";
	}
	
	
	@RequestMapping(value = {"/vers-jspCommentCaMarche"})
	public String afficheCommentCaMarche() {
		return "frontOffice/jsp/jspCommentCaMarche";
	}
	
	@RequestMapping(value = {"/vers-jspProfil"})
	public String afficheProfil() {
		return "frontOffice/jsp/jspProfil";
	}
	
	

	@RequestMapping(value= "/recherche")
	public String rechercher() {
		return "backOffice/jspResultatR";
	}
	
	@RequestMapping(value= {"/RechercherProfilaValider"})
	public String afficheProfilaValider(Model model) {
	java.util.List<Profil> listp = profilMet.findProfilAValider();
		 model.addAttribute("listp", listp);
		return "backOffice/Accueil";
	}

	}



