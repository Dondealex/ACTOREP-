<div class="row my-auto">
  <div class="col-1 text-right">
     <p>ID</p>
    </div>
    <div class="col-1">
      <input type="text" class="form-control" id="idAd" name="idAd" value="${idAd}" readonly>
    </div>
    <div class="col-2 text-right">
      <p>Prénom</p>
    </div>
    <div class="col-3">
      <input type="text" class="form-control" id="prenomAd" name="prenomAd" value="${prenomAd}">
    </div>
    <div class="col-2 text-right">
      <p>Nom</p>
    </div>
    <div class="col-3">
      <input type="text" class="form-control" id="nomAd" name="nomAd" value="${nomAd}">
  </div>
</div>
<br>
<div class="row">
  <div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Identifiant</p>
    </div>
    <div class="col-3">
      <input type="text" class="form-control" id="idtf" name="idtf" value="${idtf}" readonly>
    </div>
    <div class="col-2 text-right">
      <p>Mot de passe</p>
    </div>
    <div class="col-3">
      <input type="password" class="form-control" id="mdpAd" name="mdpAd" value="${mdpAd}">
  	</div>
</div>
  <br>
<div class="row">
  <div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Numéro employé</p>
    </div>
    <div class="col-3">
      <input type="text" class="form-control" placeholder="------" id="numAd" name="numAd" value="${numAd}">
      <p class="text-warning text-center">${errNum}</p>
    </div>
    <div class="col-2 text-right">
      <p>Date d'entrée</p>
    </div>
    <div class="col-3">
      <input type="date" class="form-control" id="dateEnt" name="dateEnt" value="${dateEnt}">
  </div>
</div>
<br>
<div class="row">
  <div class="col-2 text-right">
    </div>
    <div class="col-2 text-right">
      <p>Statut</p>
    </div>
    <div class="col-2 text-center">
    <label class="form-check-label">
    <input type="radio" class="form-check-input" name="optradio" id="actif" value="A001" checked>actif
  </label>
    </div>
    <div class="col-2">
      <label class="form-check-label">
    <input type="radio" class="form-check-input" name="optradio" id="inactif" value="A002">inactif
  </label>
    </div>
    <div class="col-4">
  </div>
</div>