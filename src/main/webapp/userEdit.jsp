<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<title>User Management Application</title>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
</head>
  	<nav class="topnav">
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="index.jsp"> Home </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="keyboards_servlet"> Keyboards </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="mouse.jsp"> Mouses </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:20px;">  About </a>
		<a style="color: white; padding-right:50px; float:right;" href="userManagement.jsp">  User</a>
	</nav>
<body>
<nav class="navbar navbar-expand-md navbar-light">
<div>
<a class="navbar-brand"> User Management Application </a>
</div>
<ul class="navbar-nav">
<li><a href="<%=request.getContextPath()%>/UserServlet/dashboard"
class="nav-link">Back to Dashboard</a></li>
</ul>
</nav>
<div class="container col-md-6">
<div class="card">
<div class="card-body">
<c:if test="${user != null}">
<form action="update" method="post">
</c:if>
<c:if test="${user == null}">
<form action="insert" method="post">
</c:if>
<caption>
<h2>
<c:if test="${user != null}">
Edit User
</c:if>
<c:if test="${user == null}">
Add New User
</c:if>
</h2>
</caption>
<c:if test="${user != null}">
<input type="hidden" name="oriName" value="<c:out
value='${user.name}' />" />
</c:if>
<fieldset class="form-group">
<label>User Name</label> <input type="text" value="<c:out
value='${user.name}' />" class="form-control" name="name" required="required">
</fieldset>
<fieldset class="form-group">
<label>Password</label> <input type="text" value="<c:out
value='${user.password}' />" class="form-control" name="password">
</fieldset>
<fieldset class="form-group">
<label>User Email</label> <input type="text" value="<c:out
value='${user.email}' />" class="form-control" name="email">
</fieldset>
<button type="submit" class="btn btn-success">Save</button>
</form>
</div>
</div>
</div>
</body>
</html>