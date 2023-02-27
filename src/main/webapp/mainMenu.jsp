<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu</title>
</head>
<body>
	<center>
	<jsp:include page="index.jsp"></jsp:include>
	<h1><b>Welcome To Learners Academy Portal</b></h1><br><br>
	<h3><b>Click on the Following Batch to Know their details :-</b></h3><br><br>
	
	<form action="secondMenu.jsp">
	<button name="action" value="A1">Batch A1</button><br><br>
	<button name="action" value="A2">Batch A2</button><br><br>
	<button name="action" value="A3">Batch A3</button><br><br>
	<button name="action" value="A4">Batch A4</button><br><br>
	<button name="action" value="A5">Batch A5</button><br><br>
	</form>
	<a class = "bar-item" href = "logout.jsp">LOGOUT</a>
		
	</center>
	
</body>
</html>