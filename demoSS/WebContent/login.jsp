<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<%
		Cookie[] listCookie = request.getCookies();
		String user = "";
		String pass = "";
		int i = 0;
		if (listCookie != null) {
			while (i < listCookie.length) {
				if (listCookie[i].getName().equals("mailCookie")) {
					user = listCookie[i].getValue();
				}
				if (listCookie[i].getName().equals("passCookie")) {
					pass = listCookie[i].getValue();
				}
				i++;
			}

		}
	%>
	<form action="DemoSession" method="POST">
		<p>
			<font color=red>${message}</font>
		</p>
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="username"
					value="<%out.print(user);%>" required /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"
					value="<%out.print(pass);%>" required /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="checkbox" name="remember">Remember me</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
