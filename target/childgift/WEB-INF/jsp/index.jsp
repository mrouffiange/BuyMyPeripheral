<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ include file="include/importTags.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	</head>
	<body>
		<h2>Hello</h2>
		<form:form id="form" method="POST" action="/childgift/welcome/send" modelAttribute="magicKeyForm">
		<fieldset>
			<legend>Votre identitée</legend>
			<p id="formContent">
				<form:label  path="magicKey">Magic Key : </form:label>
				<form:input  path="magicKey"/>
			</p>
			<form:button>Submit</form:button>
		</fieldset>
		</form:form>
	</body>
</html>