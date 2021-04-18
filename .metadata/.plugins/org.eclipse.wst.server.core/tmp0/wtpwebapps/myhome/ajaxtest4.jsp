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
	result : <div id="result"></div><br/>
	
	<button type="button" onclick="goJSON()">JSON호출하기</button>
</body>
</html>
<script>
	function goJSON(){
		//1.객체를 만든다
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			console.log("readyState : ", this.readyState, "   status:", this.status);
			if(this.readyState ==4 && this.status == 200){
				var data = JSON.parse(this.responseText);// string-> JSON객체로 변환
				console.log(data.name);
				console.log(data.age);
				console.log(data.phone);
				document.getElementById("result").innerHTML="이름"+data.name+"<br>"
				+"나이:" + data.age + "<br/>"
				+"전화:" + data.phone+"<br/>";
			}
		};
		var url = "/myhome/data1.json";
		console.log(url);
		
		xhttp.open("GET",url,true);
		xhttp.send();
		
	}
</script>