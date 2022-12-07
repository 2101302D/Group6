<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>	
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Product Form</title>
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
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="comment.jsp">Feedback </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:20px;">  About </a>
		<a style="color: white; padding-right:50px; float:right;" href="userManagement.jsp">  User</a>
	</nav>
	<body>
	<h1>Gaming Mouse Product Form</h1>
	<form action="mouseServlet" method="post" style="padding-left: 100px; padding-top: 30px; width: 300px">
	<div>Name: <input type="text" name="Name" style="background-color:grey;"></div>
	<div>Connection: <input type="text" name="Connection" style="background-color:grey;"></div>
	<div>Buttons: <input type="text" name="Buttons" style="background-color:grey;"></div>
	<div>DPI: <input type="text" name="DPI" style="background-color:grey;"></div>
	<div>Weight: <input type="text" name="Weight" style="background-color:grey;"></div>
	<div>Size: <input type="text" name="Size" style="background-color:grey;"></div>
	<div>Price: <input type="text" name="Price" style="background-color:grey;"></div>
	<div>Rating: <input type="text" name="Rating" style="background-color:grey;"></div>
	<div>Image: <input type="url" name="Image" style="background-color:grey;"></div>
	<div>Description: <input type="text" name="Description" style="background-color:grey;"></div>
	<div>&nbsp;</div>
		<input type="submit" value="Submit" />
	</form>
	</body>
</html>