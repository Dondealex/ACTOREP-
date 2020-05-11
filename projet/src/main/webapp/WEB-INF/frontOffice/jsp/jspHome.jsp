<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<%@ include file = "jspHeader.jsp" %>
<link rel="stylesheet" href="css/style.css" >
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<h1>Trouvez votre professionnel</h1>
	<br>
	<form action="rechercher" method="post" id="f1">
		<select>
			
		</select>
		<select>
			
		</select>
		<input type= text placeholder= "Numéro/ Nom du département">
		<br>
		
		<input id="submit" type="submit" value="Rechercher">
	
	</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@ include file = "jspFooter.jsp" %>
</body>
</html>