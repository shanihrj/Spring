<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function addUser() {

		document.fn.action = "RegisterPage";
		document.fn.submit();
	}
	function deleteUser() {

		document.fn.action = "delete";
		document.fn.submit();
	}
	function editUser() {

		document.fn.action = "edit";
		document.fn.submit();
	}
</script>

</head>
<form name="fn">


	<table border="1" align="center">
		
		<th>EmployeeId</th>
		<th>Name</th>
		<th>Address</th>
		<th>Mobile No</th>
		<th>EmailId</th>
		<th>Username</th>
		<th>Password</th>
		<th></th>
		<th></th>
		<tr>
			<c:forEach items="${employeelist}" var="e">
				<br>
				<td><input type="radio" name="eid" value="${e.eid}"></td>
				<td>${e.eid}</td>
				<td>${e.name}</td>
				<td>${e.address}</td>
				<td>${e.mobileno}</td>
				<td>${e.email}</td>
	
				<td>${e.username}</td>
				<td>${e.password}</td><%-- 
				<td><a href="<c:url value='/edit/${e.eid}' />" >Edit</a></td>
				<td><a href="<c:url value='/delete/${e.eid}' />" >Edit</a></td>
						 --%>
						</tr>
		</c:forEach>

	</table>

	<table border="2" align="center">
		<tr>
			<td><input type="button" value="EDIT" onclick="editUser()"></td>
			<td><input type="button" value="ADD" onclick="addUser()"></td>
			<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

		</tr>
	</table>
</form>
</body>
</html>