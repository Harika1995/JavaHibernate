<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="CSS/style.css" type="text/css">
	</head>
	<body>
		
		<c:set var="x" value="1234"/>
		<c:out value="${x}"></c:out>
	</body>
</html>