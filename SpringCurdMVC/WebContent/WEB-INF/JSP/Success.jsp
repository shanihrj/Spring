<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">
function Add1() {
	alert("in add new");
	document.myform.action="addnewR";
	document.myform.submit();
}
function del1() {
	alert("in del");
	
	document.myform.action="deleteR";
	document.myform.submit();
}
function edi1() {
	alert("in edit");
	
	document.myform.action="edited";
	document.myform.submit();
}


</script>


</head>
<body>
<form name="myform">
<table border="1">
<tr><th>Id</th><th>Name</th><th>Username</th><th>Password</th></tr>
<c:forEach items="${data}" var="s">
<tr>
<td><input type="radio" value="${s.id}" name="id"></td>
<td><c:out value="${s.name}"></c:out></td><%-- 
<td><c:out value="${s.City}"></c:out></td> --%>
<td><c:out value="${s.username}"></c:out></td>
<td><c:out value="${s.password}"></c:out></td>
</tr>
</c:forEach>
<tr><td><input type="button" onclick="Add1()" value="Add New" name="add"></td>
<td><input type="button" onclick="edi1()" value="Edit" name="edi"></td>
<td><input type="button" onclick="del1()" value="Delet" name="del"></td>
</tr>
</table>

</form>
</body>
</html>