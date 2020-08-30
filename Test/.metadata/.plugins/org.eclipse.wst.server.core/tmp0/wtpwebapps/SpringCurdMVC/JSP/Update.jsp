<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<form action="update">
<table>

<tr><th></th><td><input type="hidden" name="id" value="${data.id}"></td></tr>
<tr><th>Name</th><td><input type="text" name="name" value="${data.name}"></td></tr>
<tr><th>address</th><td><input type="text" name="address" value="${data.city}"></td></tr>
<tr><th>Username</th><td><input type="text" name="username" value="${data.uname}"></td></tr>
<tr><th>Password</th><td><input type="text" name="password" value="${data.pass}"></td></tr>
<tr><th></th><td><input type="submit" value="update"></td></tr>
</table>
</form>

</body>
</html>