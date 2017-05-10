<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/30/17
  Time: 11:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="title" value="Toys" />
<%@include file="header.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready(function(){
        $('#toy-products').DataTable();
    });
</script>

<html>
<body>
<div>
    <h2><Strong>Pitty Approved Toys </Strong></h2>
    <table id="toy-products" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Product Id</th>
        <th>Name</th>
        <th>Type</th>
        <th>Description</th>
        <th>Link</th>
        <th>Price</th>
        </thead>
        <tbody>
        <c:forEach var="product" items="${toy}">
            <tr>
                <td>${product.productId}</td>
                <td>${product.productName}</td>
                <td>${product.productType}</td>
                <td>${product.productDescription}</td>
                <td>${product.productLink}</td>
                <td>${product.productPrice}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>