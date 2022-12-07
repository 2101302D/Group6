<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link rel="stylesheet" href="style.css">
	</head>

  	<nav class="topnav">
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="index.jsp"> Home </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="keyboard_servlet"> Keyboards </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="mouse.jsp"> Mouses </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:20px;">  About </a>
		<a style="color: white; padding-right:50px; float:right;" href="userManagement.jsp">  User</a>
	</nav>
		
	<body style="background-color:#dbdbdb;">
		<div class="row">
			<div class="container">
				<h3 class="text-center">List of Users</h3>
				<hr>
					<div class="container text-left">
					<!-- Add new user button redirects to the register.jsp page -->
						<a href="<%=request.getContextPath()%>/register.jsp" class="btn btn-success">Add New User</a>
					</div>
					<br>
						<!-- Create a table to list out all current users information -->
						<table class="table">
							<thead>
								<tr>
									<th>Name</th>
									<th>Password</th>
									<th>Email</th>
								</tr>
							</thead>
							<!-- Pass in the list of users receive via the Servlet ’s response to a loop-->
							<tbody>
							<c:forEach var="user" items="${listUsers}">
							<!-- For each user in the database, display their information accordingly -->
							<tr>
							<td>
								<c:out value="${user.name}" />
							</td>
							<td>
							<c:out value="${user.password}" />
							</td>
							<td>
							<c:out value="${user.email}" />
							</td>
							<!-- For each user in the database, Edit/Delete buttons which invokes the edit/delete functions -->
							<td>
							<a href="edit?name=<c:out value='${user.name}'/>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;
							<a href="delete?name=<c:out value='${user.name}'/>">Delete</a>
							</td>
							</tr>
							</c:forEach>
						</tbody>
				</table>
			</div>
		</div>
	</body>
</html>