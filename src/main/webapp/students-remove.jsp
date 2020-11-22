<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Remove Existing students record</h1>
<form action="<%=request.getContextPath()%>/students-remove" method="post">
   <div class="form-group">
			<label for="uname">Student ID:</label> <input type="text"
				class="form-control" id="stid"
				placeholder="Student ID" name="stid" required>
		</div>
   <button type="submit" class="btn btn-primary">Remove</button>
  </form>
  <form action= "StudentShowAllController" method= "post"> 
<br><input type= "submit" value= "Show all students data">
</form>
</body>
</html>