<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Gaming Mouses</title>
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
		
	<body style="background-color:white;">
	<c:forEach var = "keyboard" items="${listMouse}">
			<div class="card" style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4><c:out value = "${mouse.name}"/></h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 13px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Connection: </b> <c:out value = "${mouse.connection}"/></p> 
								<p><b>Buttons: </b> <c:out value = "${mouse.buttton}"/></p>
								<p><b>DPI: </b> <c:out value = "${mouse.dpi}"/></p>
								<p><b>Weight: </b> <c:out value = "${mouse.weight}"/></p>
								<p><b>Size: </b> <c:out value = "${mouse.size}"/></p>
								<p><b>Price: </b> <c:out value = "${mouse.price}"/></p>
								<p><b>Rating: </b> <c:out value = "${mouse.rating}"/></p>
								<form action="viewmouse.jsp">
    								<input type="submit" value="Read More" />
								</form>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px " alt="" src = <c:out value = "${mouse.image}"/>>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	</div>
	</c:forEach>	
	</body>
</html>