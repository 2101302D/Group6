<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
<form action="CommentsServlet" method="post">
	Name: <input type="text" name="userName">
	Email: <input type="text" name="email">
	Feedback: <input type="text" name="Feedback">
	<input type="submit" value="Submit" />
</form>

</body>
</html>