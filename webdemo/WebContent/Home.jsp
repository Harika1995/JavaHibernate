<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home Page</title>
	</head>
	<body>
		<h3 align="center">Welcome <c:out value="${user}"></c:out></h3>
		<a href="getAll.htm">Get All Employees</a>
	</body>
</html>