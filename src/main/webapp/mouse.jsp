<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:10px;" href="comment.jsp">Feedback </a>
		<a>&nbsp;</a>
		<a style=" color: white; border-style: none groove none none; padding-left:10px; padding-right:20px;">  About </a>
		<a style="color: white; padding-right:50px; float:right;" href="userManagement.jsp">  User</a>
	</nav>
		
	<body style="background-color:white;">
	
	<div style="padding-top:40px; padding-left:400px; padding-right:400px;">
		<form action="mouseform.jsp">
    		<input type="submit" value="Add Product"/>
		</form>
	</div>
		
		<div style="padding-top:40px; padding-left:400px; padding-right:400px;">
			<div class="card" style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4>Razer DeathAdder V2</h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 13px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Connection: </b> Wired [USB]</p> 
								<p><b>Buttons: </b> 6</p>
								<p><b>DPI: </b> DPI: 20,000</p>
								<p><b>Weight: </b> 82g (2.9oz)</p>
								<p><b>Size: </b> 127.0 mm / 72.7 mm / 42.7 mm</p>
								<p><b>Price: </b> $119.90</p>
								<p><b>Rating: </b> 4.5/5</p>
								<form action="viewmouse.jsp">
    								<input type="submit" value="Read More" />
								</form>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px " alt="" src="https://cdn.mos.cms.futurecdn.net/oKG8af4ZbJqjttMd2jKGzZ-970-80.jpg.webp">
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
		<div style="padding-top:30px; padding-left:400px; padding-right:400px;">
			<div class="card"  style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4>Logitech G203 Lightsync</h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 13px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Connection: </b> Wired [USB]</p> 
								<p><b>Buttons: </b> 5</p>
								<p><b>DPI: </b> DPI:  8,000</p>
								<p><b>Weight: </b> 85g (3.0oz)</p>
								<p><b>Size: </b> 116.6 mm / 62.15 mm / 38.2 mm</p>
								<p><b>Price: </b> $59</p>
								<p><b>Rating: </b> 4.5/5</p>
								<form action="viewmouse.jsp">
    								<input type="submit" value="Read More" />
								</form>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px" alt="" src="https://cdn.mos.cms.futurecdn.net/BLUvfLpuxjut6JBS7Qf73C.jpg">
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
		<div style="padding-top:30px; padding-left:400px; padding-right:400px;">
			<div class="card"  style="background-color:#dbdbdb;">
				<div class="card-body">
					<h4>Razer Naga Pro</h4>
					<table style="width:100%; height:auto;">
						<tr>
							<td style="font-size: 13px; background-color:white; width: 350px; padding-left: 20px; padding-bottom: 10px">
								<p><b>Connection: </b> Wireless, Wired [USB], Bluetooth</p> 
								<p><b>Buttons: </b> 3 swappable side plates with up to 19+1 programmable buttons</p>
								<p><b>DPI: </b> 20,000</p>
								<p><b>Weight: </b> 117g (4.1oz)</p>
								<p><b>Size: </b> 119.0 mm / 74.5 mm / 43.0 mm</p>
								<p><b>Price: </b> $59</p>
								<p><b>Rating: </b> 4.5/5</p>
								<button>Read more</button>				
							</td>
							<td style="padding-left: 60px;"></td>
							<td>
								<img style="width:550px; height:300px" alt="" src="https://cdn.mos.cms.futurecdn.net/FsYiy2ZBVwhAPeUxJj63NE-970-80.jpg.webp">
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		
	</body>
</html>