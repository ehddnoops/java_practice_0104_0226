<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
서버로 정보를 전송하는 방법
header:내가 어떤 방법으로 어떤 브라우저로 정당한권한을 갖고 있는지...에 대해서 미리 보낸다.
body:실제 정보를 보낸다. 파일 전송
1.GET : header만 보낸다. 1000byte를 넘어가는 정보를 못보낸다.
		한글은 원래 깨졌다. 그래서 브라우저 url에 보내는 모든 정보가 한눈에 보인다.
		그래서 보안을 요하는 정보는 get방식으로 보내지 않는다
2.POST :header와 body정보에 실제 보내는 데이터를 담아서 보낸다. 
		사실상 보내는 데이터 양에 제한이 없지만 20M~50M를 안넘어가야한다
		그거 넘어가는 정보 보내려면 http프로토콜이 아니라 FTP프로토콜로 보내야 한다
 
 form 태그안에 있는 태그중에 name속성이 있어야 서버로 값을 전달한다
 <form>
 <form>
 
 </form>
 </form>
 아무데이터도 안감 이렇게 쓰면 ->> 브라우저에서 f12 엘리먼츠에 가서 보면 오류가 보일것
 
 폼을 여러개 쓰고 싶다면 아래처럼 / 각form을 구분하고 싶으면 이름 또는 id를 통해 접근가능
 <form></form>
 <form></form>
 
  
 name --폼의 이름 
 id -- jquery가 이걸 많이 씀
 action -- 응답을 처리할 url, 서블릿일수도 있고 jsp일 수도 있다.
 method -- 정보를 보내는 방식, 아무말도 안쓰면 기본이 GET방식
 
 -->
<form name="myform">
	x: <input type="text" name="xvalue"> <br/>
	y: <input type="text" name="xvalue"> <br/>
	
	<input type="button" value="보내기" onclick="goSend()"/>
</form>
</body>
</html>
<script>
function goSend()
{
	var frm = document.myform;// form의 name속성을 변수처럼,
	var frm = document.forms[0];// form라는 배열을 무조건 갖고 있다. 배열로 사용 index 사용불가
	frm.action="receive.jsp";
	frm.submit();//이 함수가 서버로 정보를 전송한다.
	
	
}
</script>