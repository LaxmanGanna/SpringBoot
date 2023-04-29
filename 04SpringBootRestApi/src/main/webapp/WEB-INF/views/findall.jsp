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
<a href="./get">Add New Employ </a>
	<table id="employees">
		<tr>
			<th> ID</th>
			<th> NAME</th>
			<th> FEE</th>
	
			<th>Actions</th>
		</tr>
		<c:forEach items="${lan}" var="doc">
			<tr>
				<td>${doc.did}</td>
				<td>${doc.dname}</td>
				<td>${doc.dfee}</td>
			


				<td><a href="./delete?did=${doc.did}">delete</a> 
				<a href="./update?did=${doc.did}">update</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>

</body>
</html>