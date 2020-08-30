<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">
function getBikeModel() {
	var company=document.getElementById("company").value;
	var req=new XMLHttpRequest();
	//var url="bikeModel?a="+company;
	req.open("GET","bikeModel?a="+company,true);
	req.send();
	alert("sent");
	
	req.onreadystatechange=function(){
		alert(req.readyState);
		alert(req.status);
		if(req.readyState==4 && req.status==200){
			alert(req.responseText)
			var list=JSON.parse(req.responseText);
			alert(list);
			var bikeModel=document.getElementById("bikeModel");
			bikeModel.options.length=0;
			
			//while(bikeModel.length>0){
			//	bikeModel.remove(bikeModel.length-1);
			
			for(index = 0;index < list.length;index++){

				var option=document.createElement("option");
				
				option.innerHTML=list[index].bikeModelName;
				option.value=list[index].bikeModelName;
				
				bikeModel.add(option);
			}
		}
	}

}
	function getPrice() {
		var bikeModel=document.getElementById("bikeModel").value;
		var req=new XMLHttpRequest();
		req.open("GET","price?c="+bikeModel,true);
		req.send();
		req.onreadystatechange=function(){
			if(req.readyState==4 && req.status==200){
			var bk=JSON.parse(req.responseText);
			document.getElementById("price").innerHTML=bk.year;
			}
			}
	}
function getState(){
	
	var country = document.getElementById("country").value;
	var req = new XMLHttpRequest();
		req.open("GET","state?b="+country,true);
	req.send();
	req.onreadystatechange=function(){
		if(req.readyState==4 && req.status==200){
			var list=JSON.parse(req.responseText);
			var state = document.getElementById("state");
			state.options.length=0;
			//delete exsisting data starts
			//while (state.length > 0) 
	      //  state.remove(state.length-1);
			//delete exsisting data ends
			
			
			
			for(index = 0; index < list.length; index++){
				
				var option=document.createElement("option");
				
				option.innerHTML=list[index].statename;
				option.value=list[index];
				
				state.add(option);
				
			}
			
		}
	}
}
</script>
<head>
<meta charset="ISO-8859-1">
<title>Bike Price</title>
</head>
<body>
<center>
	<pre>
		Company : <select id="company" onchange="getBikeModel()">
		    <option value="Select Company">Select Company</option>
			<option value=1>Royal Enfield</option>
			<option value=2>Honda</option>
			<option value=3>Hero Motocorp</option>
			<option value=4>Yamaha</option>
		</select>
		
		BikeModel : <select id="bikeModel" onchange="getPrice()">
		    <option value="Select BikeModel">Select Bike Model</option>
		    
		</select>
						
		Year:-<div id="price"></div><!-- <input type="text" id="year"> -->
		
		Country : <select id="country" onchange="getState()">
		    <option value="Select Country">Select Country</option>
			<option value=1>India</option>
			<option value=2>USA</option>
			<option value=3>Srilanka</option>
			<option value=4>Nepal</option>
		</select>
		
		State : <select id="state" onchange="getGST()">
		    <option value="Select State">Select State</option>
			
		</select>
		
		Price:-<input type="text">
		
		IGST:-<input type="text">
		

		
		Total Price With GST:-<input type="text">
		
		</select>
		
	</pre>
	</center>

</body>
</html>