<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>
			Welcome Administrator:
			<%
			out.println(request.getSession().getAttribute("username"));
		%>
		</h1>

		<%
			out.println(new Date());
		%>
	</div>

	<br />
	<div align="center">
		<a href="teachers-options.jsp"> <br>
		<input type="button" value="Set up master list of teachers"><br>
		</a> <a href="subjects-options.jsp"> <br>
		<input type="button" value="Set up master list of subjects"><br>
		</a>
		<a href="classes-options.jsp"> <br>
		<input type="button" value="Set up master list of classes"><br>
		</a> <a href="students-options.jsp"> <br>
		<input type="button" value="Set up master list of students"><br>
		</a>
		<a href="assignments-options.jsp"> <br>
		<input type="button" value="Set up Assignment of teachers, subjects, classes, students"><br>
		</a>
	</div>
	<br />
	
</body>
</html>