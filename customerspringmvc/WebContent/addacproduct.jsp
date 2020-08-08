<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Tv Products</title>
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
<form action = "saveac" method="post">
<form>

	<div class="container col-md-5">
						<c:if test="${ac != null}">
                            <input type="hidden" name="id" value="<c:out value='${ac.sINo}' />" />
                        </c:if>
						<fieldset class="form-group">
							<label>Company Name : </label>
							<input type="text"  class="form-control" name="companyName" placeholder="Company Name" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Product Code : </label>
							<input type="text"  class="form-control" name ="productCode" placeholder="Product Code" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Product Description : </label>
							<input type="text"  class="form-control" name="productDescription" placeholder="Product Description" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Quantity : </label>
							<input type="text"  class="form-control" name="Quantity" placeholder="Quantity" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Price Per Unit : </label>
							<input type="text"  class="form-control" name="pricePerUnit" placeholder="Price Per Unit" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Total Price : </label>
							<input type="text"  class="form-control" name="totalPrice" placeholder="Total Price" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Moved In Date : </label>
							<input type="text"  class="form-control" id="datepicker" name="movedInDate" placeholder="Moved In Date" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Moved In : </label>
							<input type="text"  class="form-control" name="movedIn" placeholder="Quantity Moved In " style="height: 50px">						
						</fieldset>
						<fieldset class="form-group">
							<label>Moved Out Date : </label>
							<input type="text"  class="form-control" id="datepickerr" name="movedOutDate" placeholder="Moved Out Date" style="height: 50px">
						</fieldset>
						<fieldset class="form-group">
							<label>Moved Out : </label>
							<input type="text"  class="form-control" name="movedOut" style="height: 50px" placeholder="Quantity Moved Out">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Note No : </label>
							<input type="text"  class="form-control" name="deliveryNoteNo" style="height: 50px" placeholder="Delivery Note No">
						</fieldset>
						<fieldset class="form-group">
							<label>Delivery Agent : </label>
							<input type="text"  class="form-control" name="deliveryAgent" style="height: 50px" placeholder="Delivery Agent">
						</fieldset>
						<fieldset class="form-group">
							<label>Balance Quantity : </label>
							<input type="text"  class="form-control" style="height: 50px"  name="balanceQuantity" placeholder="Balance Quantity">
						</fieldset>
						<fieldset class="form-group">
							<label>Condition Of The Product : </label>
							<input type="text"  class="form-control" name="conditionoftheProduct" placeholder="Condition" style="height: 50px">
						</fieldset>
						 <button type="submit" class="btn btn-success">Save</button>
						 </div>
                        </form>
                        
                 
                </form>
	
</body>
</div>
</html>