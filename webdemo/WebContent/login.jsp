<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
	</head>
	<body>
		<h3 align="center">Login Page</h3>
		 
		<h4 align="center"><c:out value="${message}"></c:out></h6>
		<form action="check.htm" method="post">
			<table align="center">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input class="button" type="reset" value="Clear">
					<input class="button" type="submit" value="Login">
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>