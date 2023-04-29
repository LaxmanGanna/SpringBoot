<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./update1" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="sid" value="${ram.sid}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="sname" value="${ram.sname}"></td>
			</tr>
			<tr>
				<td>fee</td>
				<td><input type="text" name="sfee" value="${ram.sfee}"></td>
			</tr>
			<tr>
			<tr>
				<td><input type="submit" value="update"></td>


			</tr>



		</table>
	</form>


</body>
</html>