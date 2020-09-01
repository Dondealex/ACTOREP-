package controller;


//import org.hibernate.mapping.List;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import metier.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entities.*;
import repository.*;
import session.Imit01session;

@Controller
public class HomeCRTL {
	
	public HomeCRTL() {
	}

	@Autowired
	ServiceRepository serviceRepository;
	
	@Autowired
	CompteDaoImpl compteImpl;
	
	@Autowired
	ProfilMetierImpl profilMet;
	
	@Autowired
	ProfilDAO daoService ;
	
	@Autowired
	DepartementMetierImpl deparMet;
	
	@Autowired
	private Imit01session session01;
	
	@Autowired
	CentreDAOCategorie centreDAOCategorie;
	
	@Autowired
	CentreDAOActeur centreDAOActeur;
	
	@Autowired
	CentreDAOService centreDAOService;
	
	@Autowired
	StatutDaoImpl StatutDaoImpl;
	
	@Autowired
	TypeActeurDaoImpl typeActeurDao;
	
	@Autowired
	CompteMetierImpl compteMetierimpl;
	
	@Autowired
	ProfilMetierImpl profilMetierImpl;
	
	@Autowired
	ResSocDaoImpl resSocDaoImpl;
	
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
	
	@RequestMapping(value= "/sConnecter")
	public String seConnecter(@RequestParam  HashMap<String, String> params, Model model) {
		
		String email = params.get("email");
		String mdp = params.get("mdp");	
		Compte compte = compteImpl.seConnecterCompte(email, mdp);
		System.out.println(compte==null );
		if(compte!=null) {
			session01.setCompteC(compte);
			model.addAttribute("nom", compte.getNom());
			model.addAttribute("prenom", compte.getPrenom());
			model.addAttribute("tel", compte.getTel());
			model.addAttribute("mail", compte.getEmail());
			if(compte.getVille()!=null) model.addAttribute("ville", compte.getVille().getNom());
			
//			Profil profil = profilMet.findProfilByIdCompte(compte.getId());
//			session01.setProfil(profil);
//			model.addAttribute("pres", profil.getPresentation());
//			model.addAttribute("offre", profil.getOffre());
//			model.addAttribute("photop", profil.getPhotoProfil());
//			
//			java.util.List<Service> list = profilMet.findServiceByIdProfil(profil.getId());
//				model.addAttribute("services", list);
//			
//			model.addAttribute("acteur", list.get(0).getActeur().getNom());
			
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
	public String afficheInscription(Model model) {
		
		
		
		
		
		List<Categorie> listC = centreDAOCategorie.selectAllCategories();
		model.addAttribute("categories", listC);
		
		List<Departement> listD = deparMet.findDepartementByPays("France");
		model.addAttribute("depts", listD);
		
		List<Acteur> listA = centreDAOActeur.selectAllActeurs();
		model.addAttribute("acteurs", listA);
		
		List<Service> listS = centreDAOService.findAllServices();
		model.addAttribute("serv", listS);

	
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

	@RequestMapping(value = {"/services_acteur/{idActeur}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Service> getServicesByActors(@PathVariable Long idActeur) {
		List<Service>  result = serviceRepository.findAllByIdActor(centreDAOActeur.getActeur(idActeur));
		//List<Service>  result = serviceRepository.findAllByIdActor(idActeur);
		System.out.print(result.size());
		return  result;
	}


	
	@RequestMapping(value= {"/registration"})
	public String registration(@RequestParam  HashMap<String, String> params, Model model) throws ParseException {
		System.out.print(params.get("acteur"));
		if(params.get("raison") != "") {
			System.out.print("Save  org ");
		}
		else {
			
			String nom = params.get("nom");
			String prenom = params.get("prenom");
			String raison = params.get("raison");
			String rue = params.get("rue");
			String cp = params.get("cp");
			String tel = params.get("num");
			String dateNaiss = params.get("datenais");
			String email = params.get("mail");
			String mdp = params.get("mdp");
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateNaiss);
//			Compte createAccount = compteMetierimpl.creationCompteIndividu(nom, prenom, email, mdp, rue, cp, tel, date,
//					typeActeurDao.selectTypeActeurById((long) 2), StatutDaoImpl.selectStatutById("C001"), null);
			
			Compte createAccount = compteMetierimpl.creationCompteIndividu(nom, prenom, email, mdp, rue, cp, tel, date, typeActeurDao.selectTypeActeurById((long) 2),
					StatutDaoImpl.selectStatutById("C001"), null, centreDAOActeur.getActeur(Long.parseLong(params.get("acteur"))));
			
			Profil pr = profilMetierImpl.addProfil(params.get("presentation"),null, null, createAccount);
			ReseauSocial rsytb = resSocDaoImpl.insertReseauSoc("Youtube", params.get("youtube"),pr);
			ReseauSocial rslink = resSocDaoImpl.insertReseauSoc("Link", params.get("youtube"),pr);
			
			

			
		}
		
		
		return "frontOffice/jsp/jspConnexion";
		
	}
	
	
	

	}