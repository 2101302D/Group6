<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
crossorigin="anonymous">
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Gaming Keyboards</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
		<link rel="stylesheet" href="style.css">
	</head>
	
  	<nav class="topnav">
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="index.jsp"> Home </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="keyboards_servlet"> Keyboards </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="mouse.jsp"> Mouses </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="comment.jsp">Feedback </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:20px;">  About </a>
		<a style="color: white; padding-right:50px; float:right;" href="userManagement.jsp">  User</a>
	</nav>
	
	<body style="background-color:white;">
		
		<div style="padding-top:100px; padding-left:400px; padding-right:400px;">
			<div class="card" style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4>Wooting Two HE</h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 14px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Switch: </b> Lekker (Gateron) / Linear Switches</p>
								<p><b>Size: </b> Full size</p>
								<p><b>Backlight: </b> RGB LED</p>
								<p><b>Passthrough: </b> None</p>
								<p><b>Keycaps: </b> PBT</p>
								<p><b>Price: </b> $239</p>
								<p><b>Rating: </b> 4.5/5</p>
								<form action="viewkeyboard.jsp">
    								<input type="submit" value="Read More" />
								</form>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px " alt="" src="https://uploads-ssl.webflow.com/612ca8920bc3a648125ffac3/623207cf3b77e02a8e6a1564_Wooting-two-HE-min.png">
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
		<div style="padding-top:30px; padding-left:400px; padding-right:400px;">
			<div class="card"  style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4>Mountain Everest Max</h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 14px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Switch:</b> Cherry MX Red, Blue, Brown, Silver</p>
								<p><b>Size: </b> Full size or TKL</p>
								<p><b>Backlight: </b> Per-key RGB</p>
								<p><b>Passthrough: </b> USB 3.2 Gen1</p>
								<p><b>Keycaps: </b> ABS</p>
								<p><b>Price: </b> $250</p>
								<p><b>Rating: </b> 4.5/5</p>
								<form action="viewkeyboard.jsp">
    								<input type="submit" value="Read More" />
								</form>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px" alt="" src="https://mountain.gg/assets/Mountain-Everest-Max-Gunmetal-Gray-45-RGB.png">
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
		<div style="padding-top:30px; padding-left:400px; padding-right:400px;">
			<div class="card"  style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4>HITIME XVX M61</h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 14px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Switch:</b> Gateron Yellow, Red, Brown</p>
								<p><b>Size: </b> 60%</p>
								<p><b>Backlight: </b> RGB LED</p>
								<p><b>Passthrough: </b> None</p>
								<p><b>Keycaps: </b> PBT</p>
								<p><b>Price: </b> $145</p>
								<p><b>Rating: </b> 4.5/5</p>
								<button>Read more</button>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px" alt="" src="https://i.ebayimg.com/images/g/G5oAAOSwq5tix49L/s-l500.jpg">
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
	</body>
		
	<!--<body style="background-color:white;">
		<div class="container"
        style="height: 1250px; width: 2100px; background-color: white; justify-content: space-around;">
        <div class="row" style="left: 0;">
	<c:forEach var = "keyboard" items="${listKeyboard}">
		<div class="card" style="position: relative; margin-top: 40px; border-color: black;">
			<img src = <c:out value = "${keyboard.image}"/>>
			<c:out value = "${keyboard.name}"/>
		</div>
	</c:forEach>
	</div>
	</div> -->
</html>