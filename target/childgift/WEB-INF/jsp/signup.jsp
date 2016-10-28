<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	</head>
	<body>
		<h2>Inscription</h2>
		<form:form id="form" method="POST" action="/childgift/signup/send" modelAttribute="currentUser">
		<fieldset>
			<legend>Votre identitée</legend>
			<p id="formContent">
				<form:label  path="email">Email : </form:label>
				<form:input  path="email"/>
			</p>
			
			<p id="formContent">
				<form:label  path="lastname">Nom : </form:label>
				<form:input  path="lastname"/>
			</p>
			
			<p id="formContent">
				<form:label  path="firstname">Prénom : </form:label>
				<form:input  path="firstname"/>
			</p>
			
			<p id="formContent">
				<form:label  path="male">Civilité : </form:label>
				<span id="radiobutton"><form:radiobutton path="male" value="true"/>M.</span>
				<span id="radiobutton"><form:radiobutton path="male" value="false"/>Mlle</span>
				<span id="radiobutton"><form:radiobutton path="male" value="false"/>Mme</span>
			</p>
			
			<p id="formContent">
				<form:label  path="hobby">Hobby : </form:label>
				<form:select path="hobby">
				   <form:options items="${hobbies}" itemValue="id" itemLabel="name" />
				</form:select>
			</p>
			<form:button>Send</form:button>
			</fieldset>	
		</form:form>
	</body>
</html>