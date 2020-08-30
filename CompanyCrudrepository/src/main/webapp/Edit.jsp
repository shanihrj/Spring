<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>

<body background="G:\Wallpaper\Random\bili.jpg">
	<form action="Update">
		<h2>
			<font color="white"><center>Registeration Form</center></font>
		</h2>
		<center>
			<table background="G:\Wallpaper\Random\bili.jpg">



				<tr>
					<td><h4>
							<font color="yellow">Name:-</font></td>
					<td><input type="text" name="name" value="${data.name}"></td>
				</tr>
				<tr>
					<td><h4>
							<font color="yellow">Email Id:-</font></td>
					<td><input type="text" name="email" value="${data.email}"></td>
				</tr>
				<tr>
					<td><h4>
							<font color="yellow">Mobile No:-</font></td>
					<td><input type="text" name="mobileno" value="${data.mobileno}"></td>
				</tr>
				<tr>
					<td><font color="yellow">Addresss:-</font></td>
					<td><input type="text" name="address"value="${data.address}"></td>
					</font>
				</tr>
				
				<tr>
					<td><h4>
							<font color="yellow">UserName:-</font></td>
					<td><input type="text" name="username" value="${data.username}"></td>
				</tr>
				<tr>
					<td><h4>
							<font color="yellow">Password:-</font></td>
					<td><input type="Password" name="password"value="${data.password}"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update"></a></td>
				</tr>
			</table>
		</center>

	</form>
</body>

</html>