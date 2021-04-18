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
	
	
	
	<button type="button" id="loadajax">Ajax 호출하기</button>
</body>
</html>
<script>
$( ()=>{
	   $("#LoadAjax").click(()=>{
	      // jquery의 aiax는 데이터를 JSON 형태로 가공해서 보내야한다 { userid:"test", password:"1234",......}
	      var adata = {xvalue:$("#xvalue").val(), yvalue:$("#yvalue").val()};
	      console.log( adata);
	      
	      $.ajax({
	         url:"/myhome/jquery/receive2.jsp",
	         data:adata,
	         method:"GET",
	         dataType:"text" // text, json 선택가능
	      })
	      .done((data)=>{
	         $("#result").val(data);
	      })
	      .fail((error)=>{
	         console.log(error);
	      })
	   })
	})
</script>