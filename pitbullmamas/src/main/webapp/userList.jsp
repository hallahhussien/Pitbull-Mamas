<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/30/17
  Time: 11:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/constants/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="title" value="User Output" />
<%@include file="/constants/header.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready(function(){
        $('#userResults').DataTable();
    });
</script>

<html>
<body>
<div>
    <h2><Strong>Users results: </Strong></h2>
    <table id="userResults" class="display" cellspacing="0" width="100%">
        <thead>
        <th>User ID</th>
        <th>User Role</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Password</th>
        <th>Location</th>
        <th>Puppy Name</th>
        <th>Admin Functions</th>
        <th></th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${user}">
            <tr>
                <td>${user.userId}</td>
                <td>${user.userRole}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.userName}</td>
                <td>${user.userPassword}</td>
                <td>${user.location}</td>
                <td>${user.puppyName}</td>
                <td><a href="/deleteUser?ID=${user.userId}">Delete User</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>