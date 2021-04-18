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

<h3>Ajax 호출</h3>

<div id="result"></div>

<form name="myform" id="myform">
   <input type="text" name="userid" id="userid">
   <input type="text" name="password" id="password">
</form>

<button id ="LoadAjax">Ajax 호출하기</button>

</body>
</html>

<script>
$( ()=>{
   $("#LoadAjax").click(()=>{
      // jquery의 aiax는 데이터를 JSON 형태로 가공해서 보내야한다 { userid:"test", password:"1234",......}
      var adata = {userid:$("#userid").val(), password:$("#password").val()};
      console.log( adata);
      
      $.ajax({
         url:"/myhome/jquery/receive1.jsp",
         data:adata,
         method:"POST",
         dataType:"text" // text, json 선택가능
      })
      .done((data)=>{
         $("#result").html(data);
      })
      .fail((error)=>{
         console.log(error);
      })
   })
})
</script>