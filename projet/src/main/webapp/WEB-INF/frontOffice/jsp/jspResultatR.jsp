<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultats de recherche</title>
<%@ include file = "jspHeader.jsp" %>
<link rel="stylesheet" href="css/style.css" >
</head>
<body>
	<p>${sessionScope['scopedTarget.imit01Session'].departTrouve}</p>
	<h1>Trouvez votre professionnel</h1>
	<form action="rechercher" method="post" id="f12">
		<select name="category">
    		<c:forEach items="${listCategory}" var="category">
        		<option value="${category.id}">${category.name}</option>
    		</c:forEach>
		</select>
		<select>
			
		</select>
		<input type= text placeholder= "Numéro/ Nom du département">
		<input id="submit2" type="submit" value="Rechercher">
	</form>
	<br>
	<section id="sect1">
	
	</section>
	
	
	
	<%@ include file = "jspFooter.jsp" %>
</body>
</html>