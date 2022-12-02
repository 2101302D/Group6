<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Gaming Keyboards</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link rel="stylesheet" href="style.css">
	</head>
	<nav style=" font-size: 20px; text-align:left; background-color: #cf2b2b; padding-left: 30px; font-family: Sitka Subheading">
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="index.jsp"> Home </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="keyboard.jsp"> Keyboards </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;"> Mouses </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:20px;">  About </a>
	</nav>
		
	<body style="background-color:white;" onload = "displayKeyboard()">
	
	<div class= "container">
	<div class = "row">
		<div id = "keyboardTable" class = "row"></div>
	</div>
	</div>
	</body>
	
	<script src = "Group6/src/main/items.js"></script>
</html>