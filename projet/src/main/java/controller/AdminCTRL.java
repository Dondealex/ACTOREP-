package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import entities.Administrateur;
import entities.Profil;
import entities.ReseauSocial;
import entities.Statut;
import metier.AdminService;
import metier.IProfilMetier;
import metier.ProfilMetierImpl;
import repository.CentreDAOService;
import repository.IProfilRepository;
import repository.ProfilDAO;
import repository.ResSocDaoImpl;
import repository.StatutDaoImpl;
import session.SessionAdmin;

@Controller
public class AdminCTRL {

	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;
	
	@Autowired
	ProfilMetierImpl profilMet;
	
	@Autowired
	private ProfilDAO profilDao;
	
	@Qualifier("iprofilmetier")
	private ProfilMetierImpl iprofilmetier;
	
	@Autowired
	IProfilRepository ipro;
	
	
	@Autowired
	private SessionAdmin sessionAdmin;
	
	@Autowired
	ResSocDaoImpl resSocDaoImpl;
	
	@Autowired
	private StatutDaoImpl statutRep;
	
	@RequestMapping(value = {"/back"})
	public String afficherFenetreConnexion() {
		return "backOffice/connexion";
	}
	
	@RequestMapping(value = {"/authentification"})
	public String authentifierAdmin(@RequestParam HashMap<String, String> params, Model model) {
		String idtf = params.get("idtf");
		String pwd = params.get("pwd");
		model.addAttribute("idtf", idtf);
		
		if(idtf.isEmpty() || pwd.isEmpty()) {
			model.addAttribute("err", "Tous les champs sont obligatoires !");
			return "backOffice/connexion";
		}
		
		Administrateur adm = adminService.identifyAdmin(idtf, pwd);
		if(adm != null) {
			sessionAdmin.setLastLogIn(adm);
			return "backOffice/template";
		} else 
			model.addAttribute("err", "Identifiant / mot de passe incorrect(s) !");
			return "backOffice/connexion";	
	}
	
	@RequestMapping(value = {"/deconnecter"})
		public String seDeconnecter() {
			return "backOffice/connexion";
		}
	
	
	@RequestMapping(value = {"/droitsAd"})
	public String gererAdministrateur(Model model) {
		List<Administrateur> admins = adminService.extractAllAdmin();
		model.addAttribute("admins", admins);
		return "backOffice/droitsAdmin";
	}
	
	@RequestMapping(value = {"/majListAd"})
	public String extraireListAdmin(Model model) {
		List<Administrateur> admins = adminService.extractAllAdmin();
		model.addAttribute("admins", admins);
		model.addAttribute("msg", "La liste est à jour !");
		return "backOffice/droitsAdmin";
	}
	
	@RequestMapping(value = {"/nvlAd"})
		public String afficherFiche() {
			return "backOffice/nvlAdmin";
		}
	

	
	@RequestMapping(value = {"/creerAd"})
	public String creerAdministrateur(@RequestParam HashMap<String, String> params, Model model) {
		String prenom = params.get("prenomAd");
		String nom = params.get("nomAd");
		String mdp = params.get("mdpAd");
		String num = params.get("numAd");
		String dateEnt = params.get("dateEnt");
		String statut = params.get("optradio");
		
		model.addAttribute("prenomAd", prenom);
		model.addAttribute("nomAd", nom);
		model.addAttribute("mdpAd", mdp);
		model.addAttribute("numAd", num);
		
		if(prenom.isEmpty() || nom.isEmpty() || mdp.isEmpty() || num.isEmpty() || dateEnt.isEmpty()) {
			model.addAttribute("err", "Merci de remplir tous les champs obligatoires !");
			return "backOffice/nvlAdmin";
		}
		
		if(num.length() != 6) {
			model.addAttribute("errNum", "Le numéro employé est composé de 6 caracteres !");
			return "backOffice/nvlAdmin";
		}
		
		//Boolean newNum = 

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		
		Statut st = adminService.checkStatut(statut);
		if(st != null && num.length() == 6) {
			String idtf = prenom.toLowerCase().charAt(0) + nom.toLowerCase();
			Date d = null;
			try {
				d = sdf.parse(dateEnt);
			} catch (ParseException e) {
				System.out.println(e.getMessage());
			}
			Administrateur ad = new Administrateur(idtf, mdp, nom, prenom, num, d, st);
			ad = adminService.creerAdmin(ad);
			model.addAttribute("idAd", ad.getId());
			model.addAttribute("prenomAd", ad.getPrenom());
			model.addAttribute("nomAd", ad.getNom());
			model.addAttribute("idtf", ad.getIdentifiant());
			model.addAttribute("mdpAd", ad.getMdp());
			model.addAttribute("numAd", ad.getNumEmploye());
			Date dtEnt = ad.getDateEntree();			
			SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy-MM-dd");
			sdf02.setLenient(false);
			
			model.addAttribute("dateEnt", sdf02.format(dtEnt));
			System.out.println(sdf02.format(dtEnt));
			model.addAttribute("actif",ad.getActif());
	
		}
		
		if(st == null) {
			 model.addAttribute("err", "La création de l'administrateur a échoué");
			 return "backOffice/nvlAdmin";
		 }
		
		List<Administrateur> admins = adminService.extractAllAdmin();
		model.addAttribute("admins", admins);
		return "backOffice/nvlAdmin";
	}
	
	@RequestMapping(value = {"ficheAd"})
	public String afficherFicheAdmin(@RequestParam HashMap<String, String> params, Model model) {
		String idAdmin = params.get("idA");
		Administrateur ad = adminService.selectAdmin(idAdmin);
		model.addAttribute("idAd", ad.getId());
		model.addAttribute("prenomAd", ad.getPrenom());
		model.addAttribute("nomAd", ad.getNom());
		model.addAttribute("idtf", ad.getIdentifiant());
		model.addAttribute("mdpAd", ad.getMdp());
		model.addAttribute("numAd", ad.getNumEmploye());
		Date dtEnt = ad.getDateEntree();			
		SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy-MM-dd");
		sdf02.setLenient(false);	
		model.addAttribute("dateEnt", sdf02.format(dtEnt));
		System.out.println(sdf02.format(dtEnt));
		model.addAttribute("actif",ad.getActif());		
		return "backOffice/ficheAdmin";
	}
	
	@RequestMapping(value = {"/searchusers"})
	public String searchusers(@RequestParam HashMap<String, String> params, Model model) {
		
		List<Profil> pr = iprofilmetier.findProfilAValider();
		
	
		model.addAttribute("listp", pr);
	return "backOffice/RechercherProfilaValider";
	}
//	
	@RequestMapping(value = {"/profildetail/{idProfil}"}, method = RequestMethod.POST)
	public String profil (@PathVariable long idProfil, Model model) {
		
		Profil profil = profilDao.getOne((long) idProfil);
		model.addAttribute("profil", profil);
		
			model.addAttribute("profil", profil);

		
			List<ReseauSocial> result = resSocDaoImpl.selectReseauSocByProfilId(profil.getId());
			model.addAttribute("rsList", result);
			

		return "backOffice/activeProfil";
		
	}
	@RequestMapping(value = {"/profil_detail/{idProfil}"}, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Profil getServicesByActors(@PathVariable Long idProfil) {
		Profil profil = profilDao.getOne((long) idProfil);
		//List<Service>  result = serviceRepository.findAllByIdActor(idActeur);
//	System.out.print(result.size());
	return  profil;
}
	
	@RequestMapping(value= {"/activerProfil/{idProfil}"}, method = RequestMethod.POST)
	public String activerProfil(@PathVariable Long idProfil, Model model) {
		 Profil profil = profilDao.getOne((long) idProfil);
		 profil.setStatut(statutRep.selectStatutById("P001"));
		 ipro.saveAndFlush(profil);
		 
	return this.searchusers(new HashMap<String, String>(), model);
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
