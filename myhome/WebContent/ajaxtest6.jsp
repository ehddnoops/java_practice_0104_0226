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
	<table>
		<thead>
			<th>이름<th/>
			<th>나이<th/>
			<th>주소<th/>
		<thead/>
		<tbody id="tbody">
		</tbody>
	</table>
	
</body>
</html>
<script>
window.onload=function(){
	goJSON();
}
	function goJSON(){
		//1.객체를 만든다
		var xhttp=new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			console.log("readyState : ", this.readyState, "   status:", this.status);
			if(this.readyState ==4 && this.status == 200){
				
				var tbody = document.getElementById("tbody");
				var data = JSON.parse(this.responseText);// string-> JSON객체로 변환
				for(i=0;i<data.length;i++)
				{
					var row=tbody.insertRow(tbody.rows.length);
					var cell1 = row.insertCell(0);
					var cell2 = row.insertCell(1);
					var cell3 = row.insertCell(2);
					
					cell1.innerHTML = data[i].name;
					cell2.innerHTML = data[i].age;
					cell3.innerHTML = data[i].address;
					
					console.log(data[i].name);
				console.log(data[i].age);
				console.log(data[i].phone);
				}
// 				document.getElementById("result").innerHTML="이름"+data.name+"<br>"
// 				+"나이:" + data.age + "<br/>"
// 				+"전화:" + data.phone+"<br/>";
			}
		};
		var url = "/myhome/data2.jsp";
		console.log(url);
		
		xhttp.open("GET",url,true);
		xhttp.send();
		
	}
</script>