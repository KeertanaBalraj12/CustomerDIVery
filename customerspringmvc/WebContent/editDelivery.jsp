<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Delivery Products</title>
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

        
</head>
<body>
<header>
 <nav class="navbar navbar-light" style="background-color: #e3f2fd;"> <span class="navbar-brand mb-0 h3">EDIT PRODUCT</span>
						</nav> 
 </header>
 <br>  
 <form action="updatedelivery" method="post">
 

	<div class="container col-md-5">
			<form>
						<fieldset class="form-group">
							<input type="hidden"   name ="deliveryAgent" value="<c:out value="${del.deliveryAgent}" /> " >							
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="deliveryNoteNo" value="<c:out value="${del.deliveryNoteNo}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="deliveryNoteDate" value="<c:out value="${del.deliveryNoteDate}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="companyName" value="<c:out value="${del.companyName}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="productDescription" value="<c:out value="${del.productDescription}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="quantity" value="<c:out value="${del.quantity}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<input type="hidden"   name ="customerNameandAddress" value="<c:out value="${del.customerNameandAddress}" /> " >
						</fieldset>
						<fieldset class="form-group">
							<label>SI.No : </label>
                            <input type="text" class="form-control" name="sINo" value="<c:out value="${del.sINo}" />" />
                        </fieldset>
						<fieldset class="form-group">
							<label>Delivery Date : </label>
							<input type="text"  class="form-control" id="datepicker" name="deliveryDate" value="<c:out value="${del.deliveryDate}" />" style="height: 50px">						
						</fieldset>
						<fieldset class="form-group">
							<label>Status of Delivery : </label>
							<input type="text"  class="form-control" name="statusofDelivery" value="<c:out value="${del.statusofDelivery}" />" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Emergency Delivery : </label>
							<input type="text"  class="form-control" name="emergencyDelivery" style="height: 50px" value="<c:out value="${del.emergencyDelivery}" />">
						</fieldset>
						<fieldset class="form-group">
							<label>Return to Warehouse : </label>
							<input type="text"  class="form-control" name="returntoWarehouse" style="height: 50px" value="<c:out value="${del.returntoWarehouse}" />">
						</fieldset>
						 <button type="submit" class="btn btn-success">Save</button>
				 </form>	
				 			
						
		 </div>
            <br>
 <br>
 <a href="nextpagedelivery.jsp">Back to Delivery page</a>
                	
 	</form>
 
     
    </body>
</html>