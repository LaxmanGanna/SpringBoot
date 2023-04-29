<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View List</title>
</head>
<body>
<a href="/save">Add New Employee</a><br>


	<h1>Employees List</h1>



	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${lam}" var="u">
			<tr>
				<td>${u.getUid()}</td>
				<td>${u.getUname()}</td>
				<td>${u.getPass()}</td>
			
				<td><a href="./edit?id=${u.getUid()}">Edit</a></td>
				<td><a href="./delete?id=${u.getUid()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	

</body>
</html>