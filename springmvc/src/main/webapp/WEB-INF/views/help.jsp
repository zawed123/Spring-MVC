<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String name = (String) request.getAttribute("name");
	    int roll=(Integer)request.getAttribute("roll");
	    LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	    
	%>
	
	<h1>Name: <%=name %></h1>
	<h1>Roll: <%=roll %></h1>
	<h1>This is help pages</h1>
	<h1>Time is now:<%=time.toString() %></h1>
</body>
</html>