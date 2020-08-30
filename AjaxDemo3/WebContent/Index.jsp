<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function data()
{

	//var s =document.getElementById("t1").value;
	var req=new XMLHttpRequest();
	var url="log";
	//var url="log?a="+s;
	req.open("GET",url,true);
	req.send();
	req.onreadystatechange=function()
	{
	if(req.readyState==4 && req.status==200)
		{
			alert(req.responseText);
			var stu=JSON.parse(req.responseText);
			document.getElementById("t2").innerHTML=stu.id+" "+stu.name+" "+stu.address;
			
		}
	}
	
}

</script>
<title>Index Page</title>
</head>
<body>
<!-- search:<!-- <input type="text" id="t1" onkeyup="data()"> -->
 <input type="button" value="click" onclick="data()"></button>
<div id="t2"></div>

</body>
</html>