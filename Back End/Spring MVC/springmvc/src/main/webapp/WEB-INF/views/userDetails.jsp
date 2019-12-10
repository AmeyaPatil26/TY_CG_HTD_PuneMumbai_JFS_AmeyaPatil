<%@page import="com.capgemini.springmvc.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	/* String empId = (String) request.getAttribute("empId"); */
	/* int empId = (int) request.getAttribute("empId");
	String password = (String) request.getAttribute("pwd"); */
	UserBean userBean = (UserBean) request.getAttribute("userBean");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Entered Employee Id:<%=empId%>
Entered Password:<%=password%> --%>

Entered Emp Id=<%=userBean.getEmpId() %>
Entered pasword=<%=userBean.getPassword() %>
Entered DOB=<%=userBean.getDob()%>
</body>
</html>