<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./update" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="Uid" value="${lan.Uid}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="Uname" value="${lan.Uname}"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="pass" value="${lan.pass}"></td>

			</tr>
			
			<tr>

				<td><input type="submit" value="update">
			</tr>

		</table>


	</form>

</body>
</html>