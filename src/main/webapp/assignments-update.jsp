<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Existing assignment record</h1>
<form action="<%=request.getContextPath()%>/assignments-update" method="post">
   <div class="form-group">
			<label for="uname">Teacher ID:</label> <input type="text"
				class="form-control" id="tid"
				placeholder="Teacher ID" name="tid" required>
		</div>
   <div class="form-group">
			<label for="uname">Class ID:</label> <input type="text"
				class="form-control" id="cid"
				placeholder="Class ID" name="cid" required>
		</div>
		<div class="form-group">
			<label for="uname">Subject ID:</label> <input type="text"
				class="form-control" id="sid"
				placeholder="Subject ID" name="sid" required>
		</div>
		<div class="form-group">
			<label for="uname">Student ID:</label> <input type="text"
				class="form-control" id="stid"
				placeholder="Student ID" name="stid" required>
		</div>
   <button type="submit" class="btn btn-primary">Update</button>
  </form>
 <form action="TeacherShowAllController" method="post">
		<br> <input type="submit" value="Show all teachers data">
	</form>
	<form action="ClasShowAllController" method="post">
		<br> <input type="submit" value="Show all classes data">
	</form>
	<form action="SubjectShowAllController" method="post">
		<br> <input type="submit" value="Show all subjects data">
	</form>
	<form action="StudentShowAllController" method="post">
		<br> <input type="submit" value="Show all students data">
	</form>
	<form action="AssignmentShowAllController" method="post">
		<br> <input type="submit" value="Show all assignments data">
	</form>
</body>
</html>