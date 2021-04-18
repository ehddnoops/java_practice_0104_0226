<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="myform">
	사용자아이디: <input type="text" name="userid">
	<input type="button" value="아이디 중복체크" onclick="goDuplicateCheck()"> <br/>
	
	사용자 이름: <input type="text" name="username">
	</form>
</body>
</html>
<script>
function goDuplicateCheck()
{
	var frm = document.myform;
	frm.action="idcheck.jsp";
	frm.submit();
	}
</script>