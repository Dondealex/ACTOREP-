package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCRTL {
	
	@RequestMapping(value = {"/","/index"})
	public String afficheAccueil() {
		return "jsp/jspHome";
	}
	
	@RequestMapping(value = {"/vers-jspInscription"})
	public String afficheInscription() {
		return "jsp/jspInscription";
	}
	


}
