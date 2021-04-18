<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>

<%
	JSONArray arr = new JSONArray();
	JSONObject obj1;
	
	obj1 = new JSONObject();
	obj1.put("name","홍길동");
	obj1.put("time",40);
	obj1.put("tmoney",10000);
	
	
	arr.add(obj1);
	obj1 = new JSONObject();
	obj1.put("name","둘리");
	obj1.put("time",30);
	obj1.put("tmoney",20000);
	arr.add(obj1);
	
	obj1 = new JSONObject();
	obj1.put("name","고길동");
	obj1.put("time",20);
	obj1.put("tmoney",30000);
	arr.add(obj1);
	
	obj1 = new JSONObject();
	obj1.put("name","길창덕");
	obj1.put("time",50);
	obj1.put("tmoney",24000);
	arr.add(obj1);
	
	obj1 = new JSONObject();
	obj1.put("name","이두호");
	obj1.put("time",40);
	obj1.put("tmoney",50000);
	arr.add(obj1);
	%>
	<%=arr %>
	