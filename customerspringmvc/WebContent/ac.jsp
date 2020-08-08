<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AC</title>
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
                <nav class="navbar navbar-light" style="background-color: #F3F781;"> <span class="navbar-brand mb-0 h1"><strong>AC WAREHOUSE DETAILS</strong></span>
						</nav> 
                    
                    
            </header>
           <a href="addacproduct.jsp" class="btn btn-success btn-lg active" role="button" aria-pressed="true">Add New Product</a>
           <div align="left">
           <form action="showACbyproductcode">
           		<form>
           <fieldset class="form-group" >
							<label>Search by Product Code : </label>
							<input type="text"  class="form-control" name="productCode" placeholder="Enter Product Code" style="height: 50px">
						</fieldset>
						 <button type="submit" class="btn btn-success">Search</button>
				</form>	
			</form>	
			<br>
			 <form action="acinventoryontheDate">
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
  <c:forEach items="${list}" var="ac">
    <tr>
  		<td><c:out value="${ac.sINo}" /></td>
  		<td><c:out value="${ac.companyName}" /></td>
  		<td><c:out value="${ac.productCode}" /></td>
  		<td><c:out value="${ac.productDescription}" /></td>
  		<td><c:out value="${ac.quantity}" /></td>
  		<td><c:out value="${ac.pricePerUnit}" /></td>
  		<td><c:out value="${ac.totalPrice}" /></td>
  		<td><c:out value="${ac.movedInDate}" /></td>
  		<td><c:out value="${ac.movedIn}" /></td>
  		<td><c:out value="${ac.movedOutDate}" /></td>
  		<td><c:out value="${ac.movedOut}" /></td>
  		<td><c:out value="${ac.deliveryNoteNo}" /></td>
  		<td><c:out value="${ac.deliveryAgent}" /></td>
  		<td><c:out value="${ac.balanceQuantity}" /></td>
  		<td><c:out value="${ac.conditionoftheProduct}" /></td>
  		  <td><a href="editac?productCode=<c:out value='${ac.productCode}'/>">Edit</a>
  </tr>
  
  </c:forEach>
 </table>
 <br>
 <br>
 <div align=center>
 	<form action="logoutac">
 		<button type="submit" class="btn btn-success">LOGOUT</button>
 	</form>
 </div>
</body>
</div>   
</html>