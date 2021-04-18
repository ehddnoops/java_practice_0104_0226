<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>

<%
	JSONArray arr = new JSONArray();
	
	JSONObject obj1;
	
	obj1 = new JSONObject();
	obj1.put("name","홍길동");
	obj1.put("age",19);
	obj1.put("address","서울시 관악구");
	
	arr.add(obj1);
	
	obj1 = new JSONObject();
	obj1.put("name","장길산");
	obj1.put("age",22);
	obj1.put("address","서울시 금천구");
	
	arr.add(obj1);
	
	obj1 = new JSONObject();
	obj1.put("name","임꺽정");
	obj1.put("age",42);
	obj1.put("address","서울시 양천구");
	
	arr.add(obj1);
	%>
	<%=arr %>
	