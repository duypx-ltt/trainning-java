<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script type="text/javascript" src="bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="bootstrap/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/popper.min.js"></script>
<script type="text/javascript" src="javaScript/validate.js"></script>

</head>
<body>

	<%
		Cookie[] listCookie = request.getCookies();
		String email = "";
		String pass = "";
		int i = 0, j = 0;

		if (listCookie != null) {
			while (i < listCookie.length) {
				if (listCookie[i].getName().equals("mailCookie")) {
					email = listCookie[i].getValue();
					j++;
				}
				if (listCookie[i].getName().equals("passCookie")) {
					pass = listCookie[i].getValue();
					j++;
				}
				i++;
			}

			if (j == 2) {
				session.setAttribute("emailSS", email);
				response.sendRedirect("index.jsp");
			}
		}
	%>

	<div class="container">
		<h2>Login</h2>
		<p>
			<font color=red>${message}</font>
		</p>
		<form action="LoginController" method="post"
			onsubmit="return validateFormLOG()">
			<div class="form-group">
				<label for="email">Email:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter email"
					name="email" required value="${mail}">
				<p>
					<font color=red id="email_error"></font>
				</p>
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="pswd" required>
				<p>
					<font color=red id="pass_error"></font>
					<font color=red>${pass_incorrect}</font>
				</p>
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox" name="remember">
					Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-outline-dark"> Login </button>
			<button type="button" class="btn btn-outline-dark" onclick="location.href='register.jsp'">Register</button>
		</form>
	</div>
</body>
</html>
