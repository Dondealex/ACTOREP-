<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row my-auto">



<div class="col-1">    
<img class="img-rounded"  src="../../${profil.photoProfil}"  alt="No img" height="150" width="220"/>
<%--       <img type="file" class="form-control" id="photoProfil" name="photoProfil" value="${profil.photoProfil}" readonly> --%>
    </div>
    <div class="col-3 text-right">
      <p>Prénom :</p>
    </div>
    <div class="col-3">
   ${profil.compte.prenom}
		  
    </div>  
    <div class="col-2 text-right">
      <p>Nom : </p>
    </div>
    <div class="col-3">
      ${profil.compte.nom}
  </div>
</div>
<br>
<div class="row">
  <div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Type d'acteur :</p>
    </div>
    <div class="col-3">
      ${profil.compte.typeActeur.nom}
	    
    </div>
    <div class="col-2 text-right">
      <p>Date de Naissance :</p>
    </div>
    <div class="col-3">
      ${profil.compte.dateNaiss}
  	</div>
</div>
  <br>
<div class="row">
  <div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Catégorie :</p>
    </div>
    <div class="col-3">
     ${profil.compte.acteur.nom}
    </div>
    <div class="col-2 text-right">
      <p>Adresse :</p>
    </div>
    <div class="col-3">
   ${profil.compte.rue}, ${profil.compte.codePostal}, ${profil.compte.ville.nom}
  </div>
</div>
<br>

<br>
<div class="row">
  <div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Statut :</p>
    </div>
  
  <c:choose>
   <c:when test="${profil.statut.id=='P003'}">    
${profil.compte.statut.nom}
     <form  action="/activerProfil/${profil.id}" method="POST">
  <input type ="text" hidden= "true" value="${profil.id}" name="profil_id" />
  
    <button type="submit" class="btn btn-primary">    Activer</button>	
  
  </form>
  
  
    </c:when>
  <c:when test="${profil.statut.id=='P001'}">    
  Profil Activé    ...
    </c:when>
    <c:otherwise>
   Profil Bloqué     ...
    </c:otherwise>
</c:choose>
  
  
   <div class="col-3 text-right">
    <p> Email : </p> 
    </div>
    <div  class="col-3 text-left">
      ${profil.compte.email}
    </div>
   </div>
<br>

<div class="row"><div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Réseaux :</p>
    </div>

<c:forEach items="${rsList}" var="a">

<c:choose>
    <c:when test="${a.nom=='Youtube'}">
        <div class="embed-responsive embed-responsive-21by9">
  <iframe width="280" height="157" src="${a.url}" frameborder="0"
  allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</div>
        <br />
    </c:when>    
    <c:otherwise>
       ${a.nom} : ${a.url}
        <br />
    </c:otherwise>
</c:choose>
    		</c:forEach>
</div>

<!-- <div class="row"> -->
<!--   <div class="col-2 text-right"> -->
<!--     </div> -->
<!--     <div class="col-2 text-right"> -->
<!--       <p>Statut</p> -->
<!--     </div> -->
   
    