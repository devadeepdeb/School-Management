<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Remove Existing teacher record</h1>
<form action="<%=request.getContextPath()%>/teachers-remove" method="post">
   <div class="form-group">
			<label for="uname">Teacher ID:</label> <input type="text"
				class="form-control" id="tid"
				placeholder="Teacher ID" name="tid" required>
		</div>
   <button type="submit" class="btn btn-primary">Remove</button>
  </form>
  <form action= "TeacherShowAllController" method= "post"> 
<br><input type= "submit" value= "Show all teachers data">
</form>
</body>
</html>