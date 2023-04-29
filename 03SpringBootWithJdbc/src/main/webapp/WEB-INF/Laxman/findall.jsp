  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#employees {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
#employees td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}
#employees tr:nth-child(even) {
	background-color: #f2f2f2;
}
#employees tr:hover {
	background-color: #ddd;
}
#employees th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
<a href="./save">Add New Employ </a>
	<table id="employees">
		<tr>
			<th>Employ ID</th>
			<th>Employ NAME</th>
			<th>Employ PASSWORD</th>
	
			<th>Actions</th>
		</tr>
		<c:forEach items="${msg}" var="std">
			<tr>
				<td>${std.sid}</td>
				<td>${std.sname}</td>
				<td>${std.sfee}</td>
			


				<td><a href="./delete?sid=${std.sid}">delete</a> 
				<a href="./up?sid=${std.sid}">update</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>

</body>
</html>