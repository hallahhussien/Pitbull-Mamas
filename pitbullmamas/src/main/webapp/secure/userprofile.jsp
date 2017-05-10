<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/8/17
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="user" value="${User}" scope="session" />
Welcome Back, ${user.userName}
</body>
</html>
