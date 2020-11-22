<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Remove Existing class record</h1>
<form action="<%=request.getContextPath()%>/classes-remove" method="post">
   <div class="form-group">
			<label for="uname">Class ID:</label> <input type="text"
				class="form-control" id="cid"
				placeholder="Class ID" name="cid" required>
		</div>
   <button type="submit" class="btn btn-primary">Remove</button>
  </form>
  <form action= "ClasShowAllController" method= "post"> 
<br><input type= "submit" value= "Show all classes data">
</form>
</body>
</html>