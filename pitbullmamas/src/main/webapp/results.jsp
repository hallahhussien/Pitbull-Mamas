<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<title>Home</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no" />
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico" />
<link rel="stylesheet" href="css/style.css">
<link href='//fonts.googleapis.com/css?family=Economica' rel='stylesheet' type='text/css'>
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/script.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/camera.js"></script>
<!--[if (gt IE 9)|!(IE)]><!-->
<script src="js/jquery.mobile.customized.min.js"></script>


<head>
    <META http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>

<html>
<body>

<c:import url="header.jsp"/>
<c:import url="menu.jsp"/>

<%--TODO Pretty up the results!--%>
<div class="container-fluid">

    <h2>Search Results: </h2>

    <table>

        <tr><th>    Name    </th><th>    Price    </th><th>    Type   </th><th>    Image    </th></tr>

        <c:forEach var="product" items="${products}">
            <tr>
                <td> ${product.productName}</td><td> ${product.productPrice}</td><td> ${product.productType}</td><td> ${product.productImage}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>