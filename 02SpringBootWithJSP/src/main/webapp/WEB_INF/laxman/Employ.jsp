<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background-color: #6abadeba;
	font-family: 'Arial';
}

.login {
	width: 382px;
	overflow: hidden;
	margin: auto;
	margin: 20 0 0 450px;
	padding: 80px;
	background: #23463f;
	border-radius: 15px;
}

h2 {
	text-align: center;
	color: #277582;
	padding: 20px;
}

label {
	color: #08ffd1;
	font-size: 17px;
}

#Uid {
	width: 300px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#Uname {
	width: 300px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#Pass {
	width: 300px;
	height: 30px;
	border: none;
	border-radius: 3px;
	padding-left: 8px;
}

#log {
	width: 300px;
	height: 30px;
	border: none;
	border-radius: 17px;
	padding-left: 7px;
	color: blue;
}

span {
	color: white;
	font-size: 17px;
}

a {
	float: right;
	background-color: grey;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Page</h2>
	<br>
	<div class="login">
		<form id="login" method="get" action="login.php">
		<label><b>User ID </b> </label> <br> 
			<input type="number" name="Uid" id="Uid" placeholder="user id"> <br> <br>
			<label><b>User Name </b> </label> 
			<input type="text" name="Uname" id="Uname" placeholder="Username"> <br> <br>
			<label><b>Password</b> </label> 
			<input type="Password" name="Pass" id="Pass" placeholder="Password"><br> <br> 
			<input type="submit" name="log" id="log"
				value="Log In Here"> <br> <br> <input
				type="checkbox" id="check"> <span>Remember me</span> <br>
			<br> Forgot <a href="#">Password</a>
		</form>
</body>
</html>