<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Index</title>
</head>
<body>
	<h1>Index</h1>
	<a href="<spring:url value="/usuarios/listar" />">Listar usuarios</a>
</body>
</html>