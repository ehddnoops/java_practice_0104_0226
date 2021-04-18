<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String xvalue = request.getParameter("xvalue");
    String yvalue = request.getParameter("yvalue");
    
    int result = Integer.parseInt(xvalue)+Integer.ParseInt(yvalue);
    %>
    <%=result%>