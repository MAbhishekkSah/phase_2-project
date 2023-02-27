
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Class Details Menu</title>
</head>
<body>
<center>
	<jsp:include page="index.jsp"></jsp:include>
	<%=request.getParameter("action") %>
	<%String className = request.getParameter("action");
	  session.setAttribute("batch_name",className);
	%>

	<div class="sidenav">
		<h3 id="logo">Academy Portal</h3>
			<form action="LearnersAcademyControllerServlet">
				<button name="command" value="student">Students</button><br><br>
				<button name="command" value="teachers">Teachers</button><br><br>
				<button name="command" value="subjects">Subjects</button><br><br>
			</form>
	</div>

</center>
</body>
</html>