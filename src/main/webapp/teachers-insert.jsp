<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert new teacher record</h1>
	<form action="<%=request.getContextPath()%>/teachers-insert"
		method="post">
		<div class="form-group">
			<label for="uname">Teacher ID:</label> <input type="text"
				class="form-control" id="tfirstname"
				placeholder="Teacher ID" name="tid" required>
		</div>
		<div class="form-group">
    <label for="uname">Teacher Name:</label> <input type="text"
     class="form-control" id="tname" placeholder="Teacher Name"
     name="tname" required>
   </div>
		<button type="submit" class="btn btn-primary">Insert</button>
	</form>
	<form action="TeacherShowAllController" method="post">
		<br> <input type="submit" value="Show all teachers data">
	</form>
</body>
</html>