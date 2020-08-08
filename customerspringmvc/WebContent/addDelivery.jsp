<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Delivery Products</title>
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
<style>
.color{
background-color: #F2F5A9;
font-family: Arial;
}

</style>
<div class="color">
<body>
<header>
<nav class="navbar navbar-light" style="background-color: #9FF781;"> <span class="navbar-brand mb-0 h1"><strong>ADD NEW PRODUCT</strong></span>
						</nav> 
 </header>
 <br>  
<form action = "saveproduct" method="post">
<form>

	<div class="container col-md-5">
						<c:if test="${del != null}">
                            <input type="hidden" name="id" value="<c:out value='${del.sINo}' />" />
                        </c:if>
						<fieldset class="form-group">
							<label>	Delivery Agent : </label>
							<input type="text"  class="form-control" name="deliveryAgent" placeholder="Delivery Agent" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Note No : </label>
							<input type="text"  class="form-control" name ="deliveryNoteNo" placeholder="Delivery Note No" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Note Date : </label>
							<input type="text"  class="form-control" id="datepicker" name="deliveryNoteDate" placeholder="Delivery Note Date" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Company Name : </label>
							<input type="text"  class="form-control" name="companyName" placeholder="Company Name" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Product Description : </label>
							<input type="text"  class="form-control" name="productDescription" placeholder="Product Description" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Quantity : </label>
							<input type="text"  class="form-control" name="quantity" placeholder="Quantity" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Customer Name and Address : </label>
							<input type="text"  class="form-control" name="customerNameandAddress" placeholder="Customer Name and Address" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Date : </label>
							<input type="text"  class="form-control" id="datepickerr" name="deliveryDate" placeholder="Delivery Date" style="height: 50px">						
						</fieldset>
						<fieldset class="form-group">
							<label>Status of Delivery : </label>
							<input type="text"  class="form-control" name="statusofDelivery" placeholder="Status of Delivery" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Emergency Delivery : </label>
							<input type="text"  class="form-control" name="emergencyDelivery" style="height: 50px" placeholder="Enter Yes or No">
						</fieldset>
						<fieldset class="form-group">
							<label>Return to Warehouse : </label>
							<input type="text"  class="form-control" name="returntoWarehouse" style="height: 50px" placeholder="Enter Yes or No">
						</fieldset>
						 <button type="submit" class="btn btn-success">Save</button>
						 </div>
                        </form>
                        
                 
                </form>
	
</body>
</div>
</html>