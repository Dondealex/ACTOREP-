package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCRTL {
	
	@RequestMapping(value = {"/","/index"})
	public String afficheAccueil() {
		return "/jspHome";
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
	
	@RequestMapping(value= "/seConnecter")
	public String seConnecter() {
		return "/jspProfil";
	}
	
	@RequestMapping(value= "/rechercher")
	public String rechercher() {
		return "/jspResultatR";
	}

}
