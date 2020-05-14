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

<a href="vers-jspHome">Se déconnecter</a>
 

<div >
<p id='nom'>${nom} </p>
<p id='prenom'> ${prenom} </p>
</div>

<div>
<input type="image" class="photoprofil" src="image/Brad-Pitt.jpg">
</div>

<div id='infos'>
<p id='acteur'>${acteur}</p>
<p id='tel'>Téléphone : ${tel}</p>
<p id='email'>Email : ${mail}</p>
<p id='ville'> Ville : ${ville}</p>
</div>

<div id='presprofil'>
<label class='presprofil'>${pres}</label> <br>
</div>

<div id='serviceprofil'>

<label class='serviceprofil'>${services}</label> <br>
</div>

<div id='offreprofil'>
<label class='offreprofil' >${offre}</label> <br>
</div>

<input type="button" value="Modifier" />
</body>
</html>