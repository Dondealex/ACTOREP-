<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Fiche inscription</title>
</head>
	<body>
	<h1> ACTOREP </h1>
	
		<section>
			<form action='controllerIngrid' method='post' >
			<p id='fiche'>
				<input type='radio' name='TypeActeur' value='Organisation' id='orga'/> <label> Organisation </label> 
				<input type='radio' name='TypeActeur' value='Individu' id='indiv'/> <label> Individu </label> <br>
				
				<label> Nom </label> <input type='text' name='nom' value='' /> <br>
				<label> Prénom </label> <input type='text' name='prenom' value=''/> <br>
				<label> Raison sociale </label> <input type='text' name='raison' value='' /> <br>
				<label> Rue </label> <input type='text' name='rue' value='' /> <br>
				<label> Code Postal </label> <input type='text' name='cp' value='' /> <br>
				<label> Département </label> <select name="departement" id="dept"> 
				<option> France <option/> <option> Espagne <option/>
				<select/> <br>
				<label> Numéro de téléphone </label> <input type='text' name='num' value=''/> <br>
				<label> Date de naissance </label> <input type='text' name='datenais' value='' /> <br>
				<label> Date de création </label> <input type='text' name='datecrea' value='' /> <br>
				<label> Email </label> <input type='email' name='mail' value='' /> <br>
				<label> Mot de passe </label> <input type='password' name='mdp' value='' /> <br>
			</p>
			
			<p id='service'>
			
			</p>
			
			<p id='presentation'>
			<input type='textarea' name='presentation' value='Présentez-vous' /> <br>
			
			</p>
			
			<p id='offre'>
			
			</p>
				
				<input type= 'submit' name='inscrip' value='Inscription' />
				
			</form>
		</section>
	</body>
</html>