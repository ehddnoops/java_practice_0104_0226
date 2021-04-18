<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Ajax test</h3>
	x : <input type="text" name="xvalue" id="xvalue"><br/>
	y : <input type="text" name="yvalue" id="yvalue"><br/>
	
	result : <input type="text" name="result" id="result"><br/>
	
	
	<div id="result"></div>
	
	<button type="button" onclick="goAdd()">Ajax 호출하기</button>
</body>
</html>
<script>
	function goAdd(){
		//1.객체를 만든다
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			console.log("readyState : ", this.readyState, "   status:", this.status);
			if(this.readyState ==4 && this.status == 200){
				document.getElementById("result").value=this.responseText;
			}
		};
		
		var x = document.getElementById("xvalue").value;
		var y = document.getElementById("yvalue").value;
		
		var url = "/myhome/add.jsp?xvalue="+x+"&yvalue="+y;
		console.log(url);
		
		xhttp.open("GET",url,true);
		xhttp.send();
		
	}
</script>