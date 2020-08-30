<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h1 align="center">--Registration Form--</h1>
<script type="text/javascript">
	/* function register()
	 {
	 if(success!="true")
	 {
	 document.fn.action=""
	 }
	 } */
</script>
${msg}

</head>
<body>

	<form action="addUser" name="fn">
		<table border="1" align="center">
			<tr>
				<td>ID:-</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>NAME:-</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>UNAME:-</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>PASSWORD:-</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>ADDRESS:-</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>

</body>
</html>