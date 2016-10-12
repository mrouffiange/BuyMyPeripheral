<%@ include file = "../include/importTags.jsp" %>
<%@ taglib uri = "http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv = "Content-Type" content = "text/hml; charset=UTF-8">
		<link type="text/css" href="<spring:url value='/css/style.css'/>" rel = "Stylesheet">
		<title>ChildGift</title>
	</head>
	<body>
		<div id="banner">
			<header> 
				<h1>My Page</h1> 
			</header> 
			<div id="flag">
				<spring:url var="localeFr" value="">
					<spring:param name="locale" value="fr"/>
				</spring:url>
				<spring:url var="localeEn" value="">
					<spring:param name="locale" value="en"/>
				</spring:url>
				<a href="${localeEn}"><img src='<spring:url value="/images/english.png"/>'/></a>
				<a href="${localeFr}"><img src='<spring:url value="/images/french.png"/>'/></a>
			</div>
		</div>
		<div id="nav">
			<nav> 
				<a href="welcome">Accueil</a> 
				<a href="userInscription">Inscription</a>
				<a href="gift">Gift</a>
				<a href="keyError">Error</a>  
			</nav>
		</div>
		<div id="main"> 
			<div id="mainContent">
				<tiles:insertAttribute name="main-content"/>
			</div>
		</div> 
		<div id="footer">
			<footer>
				<p>Copyright (c) Martin Rouffiange 2016</p>
			</footer>
		</div>
	</body>
</html>