<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style type ="text/css">
td.red{
display: none;}
td.activate{
	
}
</style>
</head>
<body>
<jsp:include page="menu.jsp"/>
<br>
<div class="container-expand-sm mx-5">
      <table class="table">
    <thead>
      <tr>
     
        <th>Nom</th>
        <th>Prénom</th>
        <th>Nom Organisation</th>
        <th>Statut</th>
        <th>Statut 2</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${listp}" var="a">
    <tr>
		<td>${a.compte.nom}</td>
      	<td>${a.compte.prenom}</td>      	
		<td>${a.compte.nomOrganisation }</td>
		<td >${a.compte.statut.nom}</td>
<%-- 		<td class =" ${a.statut.id eq "P001" ? "red":"yellow"}">bhubbhubhu	</td> --%>
		<td >	
		<form action="profildetail/${a.id}" method="POST">
<!-- 		 <input type="text" style="display:none" id="idProfil" name=""idProfil" value=${a.id}"> -->
<button class="btn btn-primary" type="submit">Détail</button>
 </form> </td>
	
    </tr>
     </c:forEach>
      </tbody>
      </table>
      </div>
</html>

