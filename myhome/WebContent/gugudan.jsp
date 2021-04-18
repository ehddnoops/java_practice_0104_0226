<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% int dan = Integer.parseInt(request.getParameter("dan"));
	int i;
	
	for(i=1;i<=9;i++){
		out.println(String.format("%d X %d=%d<br>",dan,i,dan*i));
	}
			
%>
