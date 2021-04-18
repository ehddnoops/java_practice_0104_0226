<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>주급계산</h3>
	<table>
		<thead>
			<th>이름<th>
			<th>근무시간<th>
			<th>시간당급여액<th>
			<th>급여<th>
		<thead/>
		<tbody id="tbody">
		</tbody>
	</table>
	

</body>
</html>
<script>
window.onload=function(){
	Money();
}
	function Money(){
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function(){
			if(this.readyState == 4 && this.status == 200){
				var tbody = document.getElementById("tbody");
				var data = JSON.parse(this.responseText);
				for(i=0;i<data.length;i++)
					{
						var row=tbody.insertRow(tbody.rows.length);
						var cell1 = row.insertCell(0);
						var cell2 = row.insertCell(1);
						var cell3 = row.insertCell(2);
						var cell4 = row.insertCell(3);
						
						cell1.innerHTML = data[i].name
						cell2.innerHTML = data[i].time
						cell3.innerHTML = data[i].tmoney
						cell4.innerHTML = data[i].time*data[i].tmoney
					}
			}
		};
		var url = "/myhome/data3.jsp";
		console.log(url);
		
		xhttp.open("GET",url,true);
		xhttp.send();
		
	}




</script>