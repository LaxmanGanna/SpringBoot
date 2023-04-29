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
	<form action="./rt" method="post">
		<table>
			<tr>
				<td>Student ID</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Student FEE</td>
				<td><input type="text" name="sfee"></td>
			</tr>

			<tr>
				<td><input type="submit" value="save"></td>


			</tr>



		</table>


	</form>

</body>
</html>