<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int xValue = Integer.parseInt(request.getParameter("xValue"));
int yValue = Integer.parseInt(request.getParameter("yValue"));
%>

<%=xValue+yValue%>