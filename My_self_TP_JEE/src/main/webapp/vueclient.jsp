<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="vueclient.css">
<title>Insert title here</title>
</head>
<body>
<div class="contenue">
<h2>Bienvenue ${ monsieur.nom } ${ monsieur.prenom }</h2>
<div><h4>Genre : ${ monsieur.genre }</h4></div>
<div><h4>Age : ${ monsieur.age } ans</h4></div>
<div><h4>Profession : ${ monsieur.activite }</h4></div>
</div>


</body>
</html>