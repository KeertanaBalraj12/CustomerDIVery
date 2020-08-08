<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Delivery Products</title>
<link rel="stylesheet" 
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
	crossorigin="anonymous">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
$( function() {
    $.datepicker.setDefaults({
        onClose:function(date, inst){
            $("#selectedDtaeVal").html(date);
        }
    });

    $( "#datepicker" ).datepicker({ dateFormat: 'dd/mm/yy' });
});
</script>   
<script>
$( function() {
    $.datepicker.setDefaults({
        onClose:function(date, inst){
            $("#selectedDtaeVal").html(date);
        }
    });

    $( "#datepickerr" ).datepicker({ dateFormat: 'dd/mm/yy' });
});
</script> 
</head>
<style>
.color{
	background-color: #D8D8D8;
}

</style>
<div class="color">
<body>
<header>
                <nav class="navbar navbar-light" style="background-color:#F3F781 ;"> <span class="navbar-brand mb-0 h3"><strong>DELIVERY PRODUCTS</strong></span>
						</nav> 
                    
                    
            </header>
           <a href="addDelivery.jsp" class="btn btn-success btn-lg active" role="button" aria-pressed="true">Add New Delivery Product</a>
           <br>
           <br><br>
           <div align="center">
            <form action="deliveryontheDate">
           		 <form>
  			<div class="row">
   			 <div class="col">
     			 <input type="text" class="form-control" id="datepicker" name="fromDate" placeholder="From Date">
    		</div>
    		<div class="col">
      					<input type="text" class="form-control" id="datepickerr" name = "toDate" placeholder="To Date">
    		</div>
 			 </div>
 			 <br>
 				 <button type="submit" class="btn btn-success">Search</button>
			</form>
				 
			</form>	
			</div>	
			<br>
	<table class="table table-bordered table-dark">
  <thead>
    <tr>
      <th scope="col">SI.No</th>
      <th scope="col">Delivery Agent</th>
      <th scope="col">Delivery Note No</th>
      <th scope="col">Delivery Note Date</th>
      <th scope="col">Company Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Quantity</th>
      <th scope="col">Customer Name and Address</th>
      <th scope="col">Delivery Date</th>
      <th scope="col">Status of Delivery</th>
      <th scope="col">Emergency Delivery</th>
      <th scope="col">Return to Warehouse</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <c:forEach items="${list}" var="del">
    <tr>
  		<td><c:out value="${del.sINo}" /></td>
  		<td><c:out value="${del.deliveryAgent}" /></td>
  		<td><c:out value="${del.deliveryNoteNo}" /></td>
  		<td><c:out value="${del.deliveryNoteDate}" /></td>
  		<td><c:out value="${del.companyName}" /></td>
  		<td><c:out value="${del.productDescription}" /></td>
  		<td><c:out value="${del.quantity}" /></td>
  		<td><c:out value="${del.customerNameandAddress}" /></td>
  		<td><c:out value="${del.deliveryDate}" /></td>
  		<td><c:out value="${del.statusofDelivery}" /></td>
  		<td><c:out value="${del.emergencyDelivery}" /></td>
  		<td><c:out value="${del.returntoWarehouse}" /></td>
  		 <td><a href="editdelivery?deliveryNoteNo=<c:out value='${del.deliveryNoteNo}'/>">Edit</a>
  		  </tr>
  		  
  
  </c:forEach>
 </table>
 <br>
 <br>
 <br>
  		  <br>
  		  <div align=center>
 	<form action="logoutdelivery">
 		<button type="submit" class="btn btn-success">LOGOUT</button>
 	</form>
 </div>
 <br>
 <br>
 <a href="nextpagedelivery.jsp">Back to Delivery page</a>
 	
</body>
</div>
</html>