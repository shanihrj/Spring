<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<h1 align="center">EDIT DATA</h1>
</head>
<body>
	<form action="update">
		<table border="1">
			<%-- <c:forEach items="${data}" var="user"> --%>


			<input type="hidden" name="uid" value="${data.uid}">

			<tr>
				<td>NAME:-</td>
				<td><input type="text" name="name" value="${data.name}"></td>
			</tr>
			<tr>
				<td>UNAME:-</td>
				<td><input type="text" name="uname" value="${data.uname}"></td>
			</tr>
			<tr>
				<td>PASSWORD:-</td>
				<td><input type="text" name="password" value="${data.password}"></td>
			</tr>
			<tr>
				<td>ADDRESS:-</td>
				<td><input type="text" name="address" value="${data.address}"></td>
			</tr>
			<tr>
				<%-- </c:forEach> --%>
				<td><input type="submit" value="UPDATE"></td>
			</tr>
		</table>
	</form>
</body>
</html>