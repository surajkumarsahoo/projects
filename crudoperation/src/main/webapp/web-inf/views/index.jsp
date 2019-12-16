<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<title>CRUD</title>
</head>
<body>
	<h1>CRUD OPERATION</h1>

	<h3>ADD USER</h3>
	<div class="form">
		<form action="AddUser" method="post">
			<table>
				<tr>
					<td>Enter Your name</td>
					<td><input id="name" name="userName"></td>
				</tr>
				<tr>
					<td>Enter Your phone number</td>
					<td><input id="number" name="phoneNumber"></td>
				</tr>
				<tr>
					<td>Enter Your e-mail Id</td>
					<td><input id="mail" name="email"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add User"></td>
				</tr>
			</table>
		</form>
	</div>
	<h3>DELETE USER</h3>
	<div class="form">
		<form action="DeleteUser" method="post">
			<table>
				<tr>
					<td>Enter Your name</td>
					<td><input id="name" name="userName"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Delete User"></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="form1">

		<p>${message}</p>
	</div>
	<div align="center" class="form">

		<form action="displayUsers" method="get">
			<button>Display All</button>
		</form>
	</div>

	<div class="form">
		<table border="1">
			<caption>List of users</caption>
			<tr>

				<th>Name</th>
				<th>Phone number</th>
				<th>email</th>

			</tr>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.userName}</td>
					<td>${user.phoneNumber}</td>
					<td>${user.email}</td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>