<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delivery System</title>
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
	crossorigin="anonymous">
</head>
<style>
.color{
background-color: #F2F5A9;
font-family: Arial;
}
</style>
<div class = "color">
<body>
	<div align="center">
	<br>
	<h1><strong>DELIVERY MANAGEMENT SYSTEM</strong></h1>
	<hr>
	<img src="https://psdlearning.com/wp-content/uploads/2017/10/shipping-logos-1.jpg"  class="img-thumbnail" style="width:150px; height: 150px">
	<br>
	<br><br>
	<form action="allproductslist">
		<button type="submit" class="btn btn-success">All Delivery Products</button>
	</form>
	<br>
	<form action="emergencyProducts">
	<button type="submit" class="btn btn-success">Emergency Delivery</button>
	</form>
	<br>
	<form action="pendingDelivery">
	<button type="submit" class="btn btn-success">Pending Delivery</button>
	</form>
	<br>
	<form action="returnedProducts">
	<button type="submit" class="btn btn-success">Products returned to Warehouse</button>
	</form>
	</div>
</body>
</div>
</html>