package controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entities.Acteur;
import entities.Categorie;
import entities.Compte;
import entities.Departement;
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
		
		List<Categorie> categories = centreDAOCategorie.selectAllCategories();
		session01.setCategories(categories);
		
		List<Acteur> acteurs = centreDAOActeur.selectAllActeurs();
		session01.setActeurs(acteurs);
		
		return "/jspHome";
	}
	
	@RequestMapping(value= "/rechercher")
	public String rechercher(@RequestParam(value="dept") String dept, Model model) {
		
		//profilMet.findProfilHome(search);
		return "/jspResultatR";
	}
	
	@RequestMapping(value= "/seConnecter")
	public String seConnecter(@RequestParam  HashMap<String, String> params, Model model) {
		
		String email = params.get("email");
		String mdp = params.get("mdp");	
		Compte compte = compteImpl.seConnecterCompte(email, mdp);
		if(compte!=null) {
			session01.setCompteC(compte);
			return "/jspProfil";
		}else {
			model.addAttribute("error1","Email/mot de passe incorrect");
			return "/jspConnexion";
		}
	}
	
	@RequestMapping(value= "/vers-jspHome")
	public String afficherHome() {
		return "/jspHome";
	}
	
	@RequestMapping(value = {"/vers-jspInscription"})
	public String afficheInscription() {
		return "/jspInscription";
	}
	
	@RequestMapping(value = {"/vers-jspConnexion"})
	public String afficheConnexion() {
		return "/jspConnexion";
	}
	
	@RequestMapping(value = {"/vers-jspContact"})
	public String afficheContact() {
		return "/jspContact";
	}
	
	@RequestMapping(value = {"/vers-jspQuiSommesNous"})
	public String afficheQuiSommesNous() {
		return "/jspQuiSommesNous";
	}
	
	@RequestMapping(value = {"/vers-jspCommentCaMarche"})
	public String afficheCommentCaMarche() {
		return "/jspCommentCaMarche";
	}
	
	@RequestMapping(value = {"/vers-jspProfil"})
	public String afficheProfil() {
		return "/jspProfil";
	}
	

		
	}
	



