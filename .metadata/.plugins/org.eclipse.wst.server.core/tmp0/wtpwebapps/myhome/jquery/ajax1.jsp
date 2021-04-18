<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<% request.setCharacterEncoding("utf8"); %>
<h3>Ajax 호출</h3>

	<div id="result"></div>
	
	<button id="loadAjax">Ajax 호출하기</button>
</body>
</html>
<script>
$(()=>{
	$("#loadAjax").click(()=>{
		$.ajax({
			url:"/myhome/ajax_info.txt"
		})
		.done((data)=>{
			$("#result").html(data);
		})
		.fail((error)=>{
			console.log(error);
		})
	})
});
</script>