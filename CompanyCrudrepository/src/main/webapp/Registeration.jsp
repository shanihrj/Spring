<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Page</title>
<h2>
	<font color="White">{msg}</font>
</h2>
</head>
<body background="G:\Wallpaper\Random\bili.jpg">
	<form action="Registeration">
		<h2>
			<font color="white"><center>Registeration Form</center></font>
		</h2>
		<center>
			<table background="G:\Wallpaper\Random\bili.jpg">


<tr>
					<td><h4>
							<font color="yellow">Eid:-</font></td>
					<td><input type="text" name="eid" placeholder="Eid"></td>
				</tr>
				
				<tr>
					<td><h4>
							<font color="yellow">Name:-</font></td>
					<td><input type="text" name="name" placeholder="Name"></td>
				</tr>
				<tr>
					<td><h4>
							<font color="yellow">Email Id:-</font></td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td><h4>
							<font color="yellow">Mobile No:-</font></td>
					<td><input type="text" name="mobileno"></td>
				</tr>
				<tr>
					<td><font color="yellow">Addresss:-</font></td>
					<td><input type="text" name="address"></td>
					</font>
				</tr>
				<tr>
					<td><font color="Yellow">Role:-</font></td>
					<td><select name="Role">
							<option value="Administrator">Administrator</option>
							<option value="Manager">Manager</option>
							<option value="Client">Client</option>
					</select></td>
				</tr>

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
					<td><input type="submit" value="Register"></a></td>
				</tr>
			</table>
		</center>

	</form>
</body>
</html>