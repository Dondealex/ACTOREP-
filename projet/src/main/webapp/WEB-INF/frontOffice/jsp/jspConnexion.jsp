<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
<div class="mx-auto border rounded p-5 m-5 bg-secondary text-white" style="width:400px">
  <h2>ACTOREP</h2><br/>
		<form id="formCon" method="post" action="sConnecter">
			<br />
			<label for="Email">Email<span class="requis">*</span></label>
			<input type="text" name="email">
			<br />
			<br>
			<label for="mdp">Mot de passe<span class="requis">*</span></label>
			<input type= "password" name="mdp">
			<br />
			<br />
			<br>
			<input id="submit" type="submit" value="Se connecter">
		</form>
		<p id ="error">${error1}</p>
		
</div>

	<%@ include file = "jspFooter.jsp" %>

</body>
</html>