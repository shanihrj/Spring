<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">

function register() {
	alert("In Registration Page");
	document.fn.action="RegisterPage";
	document.fn.submit();
}
</script>
<h2><font color="White">{msg}</font></h2>
</head>
<body background="G:\Wallpaper\Random\bili.jpg">
	<form action="Login">
		<h2>
			<font color="white"><center>Login Page</center></font>
		</h2>
		<center>
			<table background="G:\Wallpaper\Random\bili.jpg">

				<tr>
					<td><h4>
							<font color="yellow">UserName:-</font></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><h4>
							<font color="yellow">Password:-</font></td>
					<td><input type="Password" name="password"></td>
				</tr>
				<tr>
				<td><input type="submit" value="login"></td><td><input type="button" value="Register Here" onclick="register()"></tr>
			</table>
		</center>

	</form>
</body>

</html>