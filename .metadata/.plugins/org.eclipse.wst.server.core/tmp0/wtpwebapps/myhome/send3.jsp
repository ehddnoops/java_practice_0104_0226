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
	<% request.setCharacterEncoding("utf8"); %>
		userid : <input type="text" name="userid"><br/>
		username : <input type="text" name="username"><br/>
		
		<input type="button" onclick="goSend()" value="보내기">
		
	</form>

</body>
</html>
<script>
function goSend()
{
	var frm= document.forms[0];
	if(frm.userid.value.trim() == "")
		{
		alert("아이디를 입력해주세요");
		frm.userid.focus(); // 포커스 이동
		return false; // 함수 종료
		}
	
	if(frm.username.value.trim() == "")
	{
	alert("아이디를 입력해주세요");
	frm.userid.focus(); // 포커스 이동
	return false; // 함수 종료
	}
	
	/*frm.action="receive3.jsp";
	frm.method="get"//안써도 외었음
	frm.submit();*/
	//특정 정보를 get방식으로 전송하고 싶으면
	var userid=frm.userid.value.trim();
	var username=frm.username.value.trim();
	location.href="/myhome/receive3.jsp?userid="+userid+"&username="+username;
	
	}
</script>