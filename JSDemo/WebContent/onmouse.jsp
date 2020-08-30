<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function data() {
	alert("hiii");
}
function data1() {
	alert("you click two times")
}
function data3() {
	var s=document.getElementById("t1").value;
	document.getElementById("t2").innerHTML=s;
}

</script>
</head>
<body>
<form name="nm">
<h3>search:-</h3><input type="text" onmousemove="data()">
<br><br><br>
<input type="button" value="click" ondblclick="data1()"></button>
<br>
<h3>text:-<input type="text" name="t1" onkeyup="data3()"></h3>
<div id="t2"></div>
</form>
</body>
</html>