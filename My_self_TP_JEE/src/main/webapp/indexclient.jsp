<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styleclient.css">
<title>Insert title here</title>
</head>
<body>
<div class="contenue">
	<form action="MyservletClient" method="post" autocomplete="off">
	<h2>Salut veillez renseigner les champs !</h2>
		<input type="text" name="nomclient" placeholder="votre nom" required><br>
		<input type="text" name="prenomclient" placeholder="prenom" required><br>
		<div style="padding-left:5mm;">
		  <input type="radio" id="homme" name="genreclient" value="homme">
		  <label for="homme">Homme</label>
		  <input type="radio" id="femme" name="genreclient" value="femme">
		  <label for="femme">Femme</label>
		</div>
		<input type="number" name="ageclient" placeholder="age" required><br>
		<input type="text" name="actclient" placeholder="votre profession" required><br>
		<input type="submit" value="Envoyer votre information">
	</form>
</div>
</body>
</html>