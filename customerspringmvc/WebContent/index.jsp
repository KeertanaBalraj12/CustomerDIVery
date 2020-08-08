<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<style>
input[type=submit] {
	width: 10em;
	height: 2.5em;
}
.color{
background-color: #BEF781;
}
.text{
font-family: Arial;
}
</style>
<div class="color">
<body>
	<div align="center">
		<br>
		<div class="text">
		<h1>WELCOME</h1>
		<hr>
		<h2>SELECT TYPE OF LOGIN</h2>
		</div>
		<br> <br>
		<table>
			<tr>
				<td>
					<div class="imgContainer">
						<div>
							<img src="https://www.dashapplications.com/uploads/1/0/7/6/107635851/dash-icon-logo-grey_orig.png" width="200px" height="200px" />
						</div>
						<br> 
					<input type="button" onclick="location.href='inventorylogin.jsp';" value="INVENTORY TEAM" style="height:30px"/>
						
					</div>
				</td>
				<td>
					<div class="imgContainer">
						<div>
							<img src="https://i.pinimg.com/originals/61/92/38/619238bfa5f7d89c89aa57da4d6126e9.png" width="170px" height="200px" />
						</div>
						<br> 
					<input type="button" onclick="location.href='deliverylogin.jsp';" value="DELIVERY TEAM" style="height:30px"/>
					
					</div>
				</td>
			</tr>
		</table>
	</div> 
	
</body>
</div>
</html>