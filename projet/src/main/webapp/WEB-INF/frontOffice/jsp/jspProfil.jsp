<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Profil</title>
<link rel="stylesheet" href="css/style.css" >
</head>
<body>

<h1>PROFIL PAGE</h1>

 <input type="button" value="Modifier" />

<div >
<p id='nomprenom'>NOM  PRENOM</p>
</div>

<div>
<input type="image" class="photoprofil" src="image/Brad-Pitt.jpg">
</div>

<div id='infos'>
<p id='acteur'>Acteur</p>
<p id='tel'>Telephone</p>
<p id='email'>email</p>
<p id='ville'>Ville</p>
</div>

<div id='presprofil'>
<label class='presprofil'></label> <br>
</div>

<div id='serviceprofil'>
<label class='serviceprofil' type='textarea' name='serv' value='' ></label> <br>
</div>

<div id='offreprofil'>
<label class='offreprofil' type='textarea' name='offre' value='' ></label> <br>
</div>

<a href="vers-jspHome">Se deconnecter</a>
</body>
</html>