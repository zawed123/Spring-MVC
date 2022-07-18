<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home pages</h1>
	<h2>This is home controller</h2>
	<%
		String name = (String) request.getAttribute("name");
	    int i=(Integer)request.getAttribute("id");
	    List<String>friends=(List<String>)request.getAttribute("frnd");
	%>

	<h1>
		My Name is
		<%=name%></h1>
		<h1>Id is:<%= i%></h1>
	
	<%
	  for(String friend:friends)
	  {
	%>
	  <h2><%= friend %></h2>
	<%
	  }
	%>
</body>
</html>