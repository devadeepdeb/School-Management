<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Delete subject</h1>
<form action="<%=request.getContextPath()%>/subjects-remove" method="post">
   <div class="form-group">
			<label for="uname">Subject ID:</label> <input type="text"
				class="form-control" id="sid"
				placeholder="Subject ID" name="sid" required>
		</div>
   <button type="submit" class="btn btn-primary">Delete</button>   
  </form>
  <form action= "SubjectShowAllController" method= "post"> 
<br><input type= "submit" value= "Show all subjects data">
</form>
</body>
</html>