/**
 * 
 */

function myFunctionOrga() {
  let nom = document.getElementById("nom");
  let prenom = document.getElementById("prenom");
  let dateN = document.getElementById("datenais");
  let l = document.getElementById("datenaislabel");
    nom.style.display = "none";
    prenom.style.display = "none";
    dateN.style.display = "none";
    l.style.display = "none";
    let a = document.getElementById("raison");
	let b = document.getElementById("datecrea");
	let c = document.getElementById("datecrealabel");
	a.style.display ="block";
	b.style.display ="block";
	c.style.display ="block";

  
}


function myFunctionInd() {
	let a = document.getElementById("raison");
	let b = document.getElementById("datecrea");
	let c = document.getElementById("datecrealabel");
	a.style.display ="none";
	b.style.display ="none";
	c.style.display ="none";
	let nom = document.getElementById("nom");
	  let prenom = document.getElementById("prenom");
	  let dateN = document.getElementById("datenais");
	  let l = document.getElementById("datenaislabel");
	    nom.style.display = "block";
	    prenom.style.display = "block";
	    dateN.style.display = "block";
	    l.style.display = "block";
}

function choix01(){
	let idCat = document.getElementById("cat").selectedIndex;
	let act = document.getElementById("act");
	if (idCat == act.categorie.getId()){
		
	}
}



