<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<title>Admin Add Product</title>
<meta charset="utf-8">

<link rel="stylesheet" href="../../css/style.css">
<link href='//fonts.googleapis.com/css?family=Economica' rel='stylesheet' type='text/css'>
<script src="../../js/jquery.js"></script>
<script src="../../js/jquery-migrate-1.1.1.js"></script>
<script src="../../js/script.js"></script>
<script src="../../js/jquery.ui.totop.js"></script>
<script src="../../js/superfish.js"></script>
<script src="../../js/jquery.equalheights.js"></script>
<script src="../../js/jquery.mobilemenu.js"></script>
<script src="../../js/jquery.easing.1.3.js"></script>
<script src="../../js/camera.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!--[if (gt IE 9)|!(IE)]><!-->
<script src="../../js/jquery.mobile.customized.min.js"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<!--include head element, which is stored in webapp directory-->
<c:import url="../../constants/header.jsp"/>
<c:import url="../../constants/menu.jsp"/>

<div class="container">
    <h2>Add New Product</h2>
    <form action="/pitbullmamas/secure/admin/addProduct" class="form-horizontal" method="post">
        <div class="form-group">
            <label class="control-label col-sm-2" for="addProductName">Product Name: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="addProductName" id="addProductName" placeholder="Product Name">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="addProductType">Product Type: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="addProductType" id="addProductType" placeholder="Toy or Fodd">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="addProductDescription">Product Description: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="addProductDescription" id="addProductDescription" placeholder="Describe this Product">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="addProductLink">Link: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="addProductLink" id="addProductLink" placeholder="Link">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="addProductPrice">Price: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="addProductPrice" id="addProductPrice" placeholder="Price">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="isFeatured">Feature this Product?</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="isFeatured" id="isFeatured" placeholder="Yes or No">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="addImage">Upload A Photo</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" name="addImage" id="addImage">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" name="submit" value="submit" class="btn btn-primary"/>
                <button type="reset" name="clear" value="reset" class="btn btn-primary">Clear</button>
            </div>
        </div>
    </form>
</div>
<c:import url="../../constants/footer.jsp"/>
</body>
</html>