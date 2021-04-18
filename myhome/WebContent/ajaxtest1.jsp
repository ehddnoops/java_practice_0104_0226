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
	<div id="result"></div>
	
	<button type="button" onclick="goAjax()">Ajax 호출하기</button>
</body>
</html>
<script>
	function goAjax(){
		//1.객체를 만든다
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			console.log("readyState : ", this.readyState, "   status:", this.status);
			if(this.readyState ==4 && this.status == 200){
				document.getElementById("result").innerHTML=this.responseText;
			}
		};
		
		xhttp.open("GET","ajax_info.txt",true);
		xhttp.send();
		
	}
</script>