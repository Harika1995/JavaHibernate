<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>View All Employees</title>
	</head>
	<body>
		<h3 align="center">List of all Employees</h3>
		
		<table border=1 align="center">
			<tr>
				<th>Employee No</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>Salary</th>
				<th>UserName</th>
			</tr>
			<c:forEach var="emp" items="${employees}">
				<tr>
					<td><c:out value="${emp.getEno()}"></c:out></td>
					<td><c:out value="${emp.getFirstname()}"></c:out></td>
					<td><c:out value="${emp.getLastname()}"></c:out></td>
					<td><c:out value="${emp.getGender()}"></c:out></td>
					<td><c:out value="${emp.getSalary()}"></c:out></td>
					<td><c:out value="${emp.getUsername()}"></c:out></td>
					<td><a href="remove.htm?eno=${emp.getEno()}" onclick="return confirm('Are you sure?')">
								<img src="images/delete.png" width="25" height="25"/></a></td>
				</tr>
			</c:forEach>
			
		</table>
	</body>
</html>