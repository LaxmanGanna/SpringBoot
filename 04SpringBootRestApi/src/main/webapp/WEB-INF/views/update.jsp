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
	<form action="./ram" method="get">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="did" value="${sw.sid}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="dname" value="${sw.sname}"></td>
			</tr>
			<tr>
				<td>fee</td>
				<td><input type="text" name="dfee" value="${sw.sfee}"></td>
			</tr>
			<tr>
			<tr>
				<td><input type="submit" value="update"></td>


			</tr>



		</table>
	</form>


</body>
</html>