<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory Login</title>
</head>
<style>
.textcolor{
font-family:Arial;
font-size:25px;
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
<form action="logininventory"  method="post"> 
	<div class = "textcolor" align="center"><br>
		 <h3>INVENTORY MANAGEMENT SYSTEM</h3>
		<hr>
		<img src="https://www.dashapplications.com/uploads/1/0/7/6/107635851/dash-icon-logo-grey_orig.png" width="100px" height="100px">
		<br><br>
		<label id="user_name">User ID :  </label>
		<input type = "text"  name="UserID" placeholder="User ID" style="height:25px;font-size:15pt;" required="required">
		<br>
<br>
	  	<div class = "textborder">
  		<label id="password">Password : </label>
		<input type = "password" name="Password" style="height:25px;font-size:15pt;" placeholder="Password" required="required">
		</div>
		<br>
		<br>
		<input type="submit" value="LOGIN" style="height:45px;font-size:16pt;width:90px;">
		 </div> 
	</form>
	
</body>
</div>
</html>