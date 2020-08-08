<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
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
<div class="color">
<body>
<body>
<header>
                <nav class="navbar navbar-light" style="background-color: #9FF781;"> <span class="navbar-brand mb-0 h3"><strong>PRODUCT DETAILS</strong></span>
						</nav> 
                    
                    
            </header>
<br>
	
	<table class="table table-bordered table-dark">
  <thead>
    <tr>
      <th scope="col">SI.No</th>
      <th scope="col">Company Name</th>
      <th scope="col">Product Code</th>
      <th scope="col">Product Description</th>
      <th scope="col">Quantity</th>
      <th scope="col">Price Per Unit</th>
      <th scope="col">Total Price</th>
      <th scope="col">Moved In Date</th>
      <th scope="col">Moved In</th>
      <th scope="col">Moved Out Date</th>
      <th scope="col">Moved Out</th>
      <th scope="col">Balance Quantity</th>
      <th scope="col">Condition of the Product</th>
    </tr>
  </thead>
    <tr>
  		<td><c:out value="${x.sINo}" /></td>
  		<td><c:out value="${x.companyName}" /></td>
  		<td><c:out value="${x.productCode}" /></td>
  		<td><c:out value="${x.productDescription}" /></td>
  		<td><c:out value="${x.quantity}" /></td>
  		<td><c:out value="${x.pricePerUnit}" /></td>
  		<td><c:out value="${x.totalPrice}" /></td>
  		<td><c:out value="${x.movedInDate}" /></td>
  		<td><c:out value="${x.movedIn}" /></td>
  		<td><c:out value="${x.movedOutDate}" /></td>
  		<td><c:out value="${x.movedOut}" /></td>
  		<td><c:out value="${x.balanceQuantity}" /></td>
  		<td><c:out value="${x.conditionoftheProduct}" /></td>
    </tr>
  
 </table>
 <br>
 <br>
 <a href="productcateinventory.jsp">Back to Product Category</a>
 
</body>
</html>