<%@page import="com.Beanclass.Inventorylogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Category</title>
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
	crossorigin="anonymous">
</head>
<style>
.center {
  display: block;
  width:150px; 
  height:150px;
  margin-left: auto;
  margin-right: auto; 
  }
 .color
 {
 	font-family:Arial;
 	background-color: #F3F781;
 }

</style>
<div class = "color">
<body>
<br><br>
	<h1 align = "center"><strong>INVENTORY MANAGEMENT SYSTEM</strong></h1>
		<hr>
		<br>
		<br>
		<img src="https://vst-store.com/images/product-category-logo/reason_logo.jpg" class="center">
		<h2 align = "center"><strong>PRODUCT CATEGORY</strong></h2>
		<br>
		<div align="center">
		<form action="pendingDelivery">
		<button type="submit" class="btn btn-success">Pending Delivery</button>
		</form>
		</div>
		<br>
		
		<div style="width:250px; margin:0 auto;">
         <select name = "dropdown" id = "Products" style="width: 250px; height : 30px" onchange="location = this.options[this.selectedIndex].value;">
         	<option value = "selected">Select Item</option>
            <option value = "tvlist" >TV</option>
            <option value = "wmlist">Washing Machine</option>
            <option value = "aclist">AC</option>
         </select>
         <br>
         <br>
         </div>
</body>
</div>
</html>