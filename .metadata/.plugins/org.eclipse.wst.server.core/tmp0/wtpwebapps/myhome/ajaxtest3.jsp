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
	단 : <input type="text" name="dan" id="dan"><br/>
	
	
	result : <div id="result"></div><br/>
	
	<button type="button" onclick="goGuguDan()">Ajax 호출하기</button>
</body>
</html>
<script>
	function goGuguDan(){
		//1.객체를 만든다
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			console.log("readyState : ", this.readyState, "   status:", this.status);
			if(this.readyState ==4 && this.status == 200){
				document.getElementById("result").innerHTML=this.responseText;
			}
		};
		
		var dan = document.getElementById("dan").value;
		
		//
		var url = "/myhome/gugudan.jsp?dan="+dan;
		console.log(url);
		
		xhttp.open("GET",url,true);
		xhttp.send();
		
	}
</script>