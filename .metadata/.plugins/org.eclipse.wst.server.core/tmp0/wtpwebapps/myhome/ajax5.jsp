<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
			<th>아이디<th>
			<th>제목<th>
			<th>컨텐츠<th>
			<th>라이터<th>
			<th>데이트<th>
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
						var cell5 = row.insertCell(4);
						
						cell1.innerHTML = data[i].id
						cell2.innerHTML = data[i].title
						cell3.innerHTML = data[i].contents
						cell4.innerHTML = data[i].writer
						cell5.innerHTML = data[i].wdate
						
						console.log(data[i].Id);
					}
			}
		};
		var url = "/myhome/BoardController";
		console.log(url);
		
		xhttp.open("GET",url,true);
		xhttp.send();
		
	}




</script>