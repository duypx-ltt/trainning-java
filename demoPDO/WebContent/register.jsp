<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Register</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<script type="text/javascript" src="bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="bootstrap/jquery.min.js"></script>
<script type="text/javascript" src="bootstrap/popper.min.js"></script>
<script type="text/javascript" src="javaScript/validate.js"></script>

</head>
<body>
	<div class="container">
		<h2>Register</h2>
		<p>
			<font color=red>${message}</font>
		</p>
		<form action="RegisController" method="post" onsubmit="return validateFormRES()">
			<div class="form-group">
				<label for="email">Email:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter email"
					name="email" required>
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
				</p>
			</div>
			<div class="form-group">
				<label for="pwd">Confirm password:</label> <input type="password"
					class="form-control" id="pwd_confirm"
					placeholder="Enter password again" name="pswd_confirm" required>
				<p>
					<font color=red id="passConfirm_error"></font>
				</p>
			</div>
			<button type="button" class="btn btn-outline-dark" onclick="location.href='login.jsp'">Login</button>
			<button type="submit" class="btn btn-outline-dark">Register</button>
		</form>
	</div>
</body>
</html>
