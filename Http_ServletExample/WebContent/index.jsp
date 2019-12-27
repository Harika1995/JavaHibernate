<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
		<link rel="stylesheet" href="CSS/style.css" type="text/css">
	</head>
	<body>
	<h3 class="center">
		Login Page
	</h3>
	<br>
		<form action="">
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