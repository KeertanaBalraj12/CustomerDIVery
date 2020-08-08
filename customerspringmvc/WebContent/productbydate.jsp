<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory on the Date</title>
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
<body >
<header>
                <nav class="navbar navbar-light" style="background-color: #9FF781;"> <span class="navbar-brand mb-0 h3"><strong>INVENTORY PRODUCTS</strong></span>
						</nav> 
                    
                    
            </header>
           <br>
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
      <th scope="col">Delivery Note No</th>
      <th scope="col">Delivery Agent</th>
      <th scope="col">Balance Quantity</th>
      <th scope="col">Condition of the Product</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <c:forEach items="${x}" var="tv">
    <tr>
  		<td><c:out value="${tv.sINo}" /></td>
  		<td><c:out value="${tv.companyName}" /></td>
  		<td><c:out value="${tv.productCode}" /></td>
  		<td><c:out value="${tv.productDescription}" /></td>
  		<td><c:out value="${tv.quantity}" /></td>
  		<td><c:out value="${tv.pricePerUnit}" /></td>
  		<td><c:out value="${tv.totalPrice}" /></td>
  		<td><c:out value="${tv.movedInDate}" /></td>
  		<td><c:out value="${tv.movedIn}" /></td>
  		<td><c:out value="${tv.movedOutDate}" /></td>
  		<td><c:out value="${tv.movedOut}" /></td>
  		<td><c:out value="${tv.deliveryNoteNo}" /></td>
  		<td><c:out value="${tv.deliveryAgent}" /></td>
  		<td><c:out value="${tv.balanceQuantity}" /></td>
  		<td><c:out value="${tv.conditionoftheProduct}" /></td>
  		  <td><a href="edittv?productCode=<c:out value='${tv.productCode}'/>">Edit</a>
  		  </tr>
  
  </c:forEach>
 </table>
 <br>
 <br>
 <a href="productcateinventory.jsp">Back to Inventory page</a>
	
</body>
</div>
</html>