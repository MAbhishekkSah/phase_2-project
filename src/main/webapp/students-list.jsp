<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="java.util.*" %>
  <%@page import="com.java.project.model.Students" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>
<body>
<center>
	<jsp:include page="index.jsp"></jsp:include>
	<br><br><br>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
				<th>R.NO</th>
				<th>NAME</th>	
		</tr>
	<%
	List<Students> stdList = (List<Students>)request.getAttribute("STUDENT_LIST");
	for(int i =0; i<stdList.size(); i++){%>
		<tr>
			<td><%=stdList.get(i).getRollNo() %></td>
			<td><%=stdList.get(i).getName() %></td>
		</tr>
	<%} %>
	</table>
</center>
</body>
</html>