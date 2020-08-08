<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delivery Login</title>
</head>
<style>
.textcolor{
font-family:Arial;
font-size:25px;
}
.textborder{
height=15em;
font-size:18pt;
}
input[type==text]
{
width=30em;
height=3em;
}
.color{
background-color: #F5DA81;
}

</style>

<div class="color">
<body>
	<form action="logindelivery" method="post"> 
	<div class = "textcolor" align="center"><br>
		<h3>DELIVERY MANAGEMENT SYSTEM</h3>
		<hr>
		<img src="https://i.pinimg.com/originals/61/92/38/619238bfa5f7d89c89aa57da4d6126e9.png" width="150px" height="150px">
		<br><br>
		<div class = "textborder">
		<label id="user_name">User ID : </label>
		<input type = "text" placeholder="User ID" name = "UserID" style="height:25px;font-size:15pt;">
		</div>
		<br>
	  	<div class = "textborder">
  		<label id="password">Password : </label>
		<input type = "password" placeholder="Password" name ="Password" style="height:25px;font-size:15pt;">
		</div>
		<br>
		<br>
		<input type="submit" value="LOGIN" style="height:45px;font-size:16pt;width:90px;">
	
	</div> 
	</form>
</body>
</div>
</html>