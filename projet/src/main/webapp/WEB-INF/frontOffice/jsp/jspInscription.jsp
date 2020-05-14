<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fiche inscription</title>
<link rel="stylesheet" href="css/style.css" >
<script type="text/javascript" src='js/style.js'></script>

<%@ include file = "jspHeader.jsp" %>
</head>
	<body>
	<h1> ACTOREP </h1>
	
	
		<section>
			<form action='HomeCTRL' method='post' >
			<p id='fiche'>
				<input type="button" value="Organisation" onclick="myFunctionOrga()"/>
				<input type="button" value="Individu" onclick="myFunctionInd()"/><br>
				
				
				<input id='nom'type='text' name='nom' value='' placeholder='Nom'/> <br>
				<input id='prenom' type='text' name='prenom' value='' placeholder='Prénom'/> <br>
				<input id='raison' type='text' name='raison' value='' placeholder='Raison sociale'/> <br>
				<label>  </label> <input type='text' name='rue' value='' placeholder='Rue' /> <br>
				<label>  </label> <input type='text' name='cp' value='' placeholder='Code Postal'/> <br>
				<label> Département </label> 
				<select name="departement" id="dept"> 
				<c:forEach items="${depts}" var="d">
				<option>${d.nom}<option/>
    		</c:forEach></select>
				</select> <br>
				<input type='text' name='num' value='' placeholder='Numéro de téléphone'/> <br>
				<input id='datenais' type='date' name='datenais' value=''/><label id='datenaislabel'> Date de naissance</label>  <br>
				<input id='datecrea'type='date' name='datecrea' value=''/> <label id='datecrealabel'>Date de création</label><br>
				<input type='email' name='mail' value='' placeholder='Email'/> <br>
				<input type='password' name='mdp' value='' placeholder='Mot de passe' /> <br>
			</p>
			
			<p id='service'>
			<label> Toutes les catégories </label> 
			<select name="categorie" id="cat" onChange="choix01()"> 
			<c:forEach items="${categories}" var="c">
				<option>${c.nom}<option/>
    		</c:forEach></select>
    		
			<label> Acteurs </label> <select name="acteur" id="act">
			<c:forEach items="${acts}" var="a">
				<option>${a.nom}<option/>
    		</c:forEach></select>
    	
			<input class='pres' type='textarea' name='presentation' placeholder='Présentez-vous' /> <br>
			
			</p>
			
			<p id='presentation'>
			<input class='listeser' type='textarea' name='listeservices' value=''/> <br>
			
			  <input type="button" value="Ajouter" />
			  <input type="button" value="Supprimer" /><br>
			 			 
			<input class='listeserchoix' type='textarea' name='listeserviceschoix' value='' /> <br>
			
			</p>
			
			<p id='offre'>
			<input class='offre' type='textarea' name='offre' value='' placeholder='Quelle est votre offre?' /> <br>
			
			</p>
				
				<input type= 'submit' name='inscrip' value='Inscription' />
				
			</form>
		</section>
		
			<br>
	<br>
	<br>
	<br>
	<%@ include file = "jspFooter.jsp" %>
	
		
	</body>
	
</html>