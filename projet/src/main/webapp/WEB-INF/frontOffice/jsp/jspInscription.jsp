<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Fiche inscription</title>

<%@ include file = "jspHeader.jsp" %>
</head>
	<body>
	<h1> ACTOREP </h1>
	
	
		<section>
			<form action='registration' method='post' >
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
    			<input id="department" class="form-control typeahead twitter-typeahead" type="text" placeholder="Start typing something to search..." 
    			data-provide="typeahead">
			<br>
				<input type='text' name='num' value='' placeholder='Numéro de téléphone'/> <br><br>
				<label> Date de naissance  <input id='datenais' type='date' name='datenais' value=''/><label id='datenaislabel'>   </label>  <br><br>
				<input id='datecrea'type='date' name='datecrea' value=''/> <label id='datecrealabel'>Date de création</label><br>
				
				<input type='email' name='mail' value='' placeholder='Email'/> <br><br>
				<input type='password' name='mdp' value='' placeholder='Mot de passe' /> <br>
			</p>
			
		<p id='service'>
			<label> Toutes les catégories </label> 
			<select name="categorie" id="cat" > 
			<c:forEach items="${categories}" var="c">
				<option>${c.nom}<option/>
    		</c:forEach></select>
    		
			<label> Acteurs </label> <select name="acteur" id="act" onChange="choix01(this.value)">
			<c:forEach items="${acteurs}" var="a">
				<option id ="id_actor" value="${a.id}">${a.nom}<option/>
    		</c:forEach></select>
    	
			    	  <div class="form-group">
    <label for="exampleFormControlTextarea1">Quels services proposez vous ?</label>
    <textarea class="form-control" name='presentation' id="presentation" rows="3"></textarea>
  </div>
		
			<p id='services'>
				
			
			</p>
  			<label>Linkedin</label><input type='url' name='link' value='' placeholder='link'/> <br><br>
			<label>Youtube</label>	<input type='url' name='youtube' value='' placeholder='youtube' /> <br>
				
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