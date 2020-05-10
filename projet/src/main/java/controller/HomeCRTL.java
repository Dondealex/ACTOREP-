package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCRTL {
	
	@RequestMapping(value = {"/","/index"})
	public String afficheAccueil() {
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
	
	@RequestMapping(value = {"/vers-jspProfil"})
	public String afficheProfil() {
		return "/jspProfil";
	}
	


}
