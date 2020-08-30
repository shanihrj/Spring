<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function data() {
var s=document.getElementById("t1").value;
var req=new XMLHttpRequest();
var url="log?a="+s;
req.open("GET",url,true);
req.send();
req.onreadystatechange=function()
{
	//alert(req.readystate);
	if(req.readystate=4 && req.status==200){
		//var stu=JASON.parse(req.responseText);
		//document.getElementById("t2").innerHTML=stu.rollno""+stu.name;
	//alert(req.responseText);
	document.getElementById("t2").innerHTML=req.responseText;
	//console.log(req.responseText);
	}
	}
}

</script>
</head>
<body>
search:-<input type="text" id="t1" onkeyup="data()">
<div id="t2"></div>
</body>
</html>