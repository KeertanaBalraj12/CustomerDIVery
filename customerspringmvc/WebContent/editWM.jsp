<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Washing Machine Products</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
            integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
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
<body>
<header>
 <nav class="navbar navbar-light" style="background-color: #e3f2fd;"> <span class="navbar-brand mb-0 h3">EDIT PRODUCT</span>
						</nav> 
 </header>
 <br>  
 <form action="updatewm" method="post">
 

	<div class="container col-md-5">
			<form>
						<fieldset class="form-group">
							<label>SI.No : </label>
                            <input type="text" class="form-control" name="sINo" value="<c:out value="${wm.sINo}" />" />
                        </fieldset>
						<fieldset class="form-group">
							<label>Company Name : </label>
							<input type="text"  class="form-control" name="companyName" value="<c:out value="${wm.companyName}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="productCode" value="<c:out value="${wm.productCode}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<label>Product Description : </label>
							<input type="text"  class="form-control" name="productDescription" value="<c:out value="${wm.productDescription}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Quantity : </label>
							<input type="text"  class="form-control" name="Quantity" value="<c:out value="${wm.quantity}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Price Per Unit : </label>
							<input type="text"  class="form-control" name="pricePerUnit" value="<c:out value="${wm.pricePerUnit}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Total Price : </label>
							<input type="text"  class="form-control" name="totalPrice" value="<c:out value="${wm.totalPrice}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Moved In Date : </label>
							<input type="text"  class="form-control" id="datepicker" name="movedInDate" value="<c:out value="${wm.movedInDate}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Moved In : </label>
							<input type="text"  class="form-control" name="movedIn" value="<c:out value="${wm.movedIn}" />" style="height: 50px">						
						</fieldset>
						<fieldset class="form-group">
							<label>Moved Out Date : </label>
							<input type="text"  class="form-control" id="datepickerr" name="movedOutDate" value="<c:out value="${wm.movedOutDate}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Moved Out : </label>
							<input type="text"  class="form-control" name="movedOut" style="height: 50px" value="<c:out value="${wm.movedOut}" />">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Note No : </label>
							<input type="text"  class="form-control" name="deliveryNoteNo" style="height: 50px" value="<c:out value="${wm.deliveryNoteNo}" />">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Agent : </label>
							<input type="text"  class="form-control" name="deliveryAgent" style="height: 50px" value="<c:out value="${wm.deliveryAgent}" />">
						</fieldset>
						<fieldset class="form-group">
							<label>Balance Quantity : </label>
							<input type="text"  class="form-control" style="height: 50px"  name="balanceQuantity" value="<c:out value="${wm.balanceQuantity}" />">
						</fieldset>
						<fieldset class="form-group">
							<label>Condition Of The Product : </label>
							<input type="text"  class="form-control" name="conditionoftheProduct" value="<c:out value="${wm.conditionoftheProduct}" />" style="height: 50px">
						</fieldset>
						 <button type="submit" class="btn btn-success">Save</button>
				 </form>	
				 			
						
		 </div>
                       
               <br>
 <br>

                        
    
 	
 	
 	
 	</form>
 
     
    </body>
</html>