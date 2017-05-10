<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/30/17
  Time: 11:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/constants/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="title" value="Products" />
<%@include file="/constants/header.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready(function(){
        $('#all-products').DataTable();
    });
</script>

<html>
<body>
<div>
    <h2><Strong>Pitty Approved Products </Strong></h2>
    <table id="all-products" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Product Id</th>
        <th>Name</th>
        <th>Type</th>
        <th>Description</th>
        <th>Link</th>
        <th>Price</th>
        </thead>
        <tbody>
        <c:forEach var="products" items="${products}">
            <tr>
                <td>${products.productId}</td>
                <td>${products.productName}</td>
                <td>${products.productType}</td>
                <td>${products.productDescription}</td>
                <td>${products.productLink}</td>
                <td>${products.productPrice}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>