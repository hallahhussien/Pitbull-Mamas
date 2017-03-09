<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<!--include head element, which is stored in webapp directory-->
<c:import url="header.jsp"/>
<div>
    <c:import url="menu.jsp"/>
</div>
<head>
    <title>Login</title>
</head>

<h3>Please enter your userid and password below.</h3>
    <form action="j_security_check" method="post">
        Email: <input type="text" name="j_email"><br />
        Password:  <input type="password" name="j_password"><br />
        <input type="submit" value="login">
    </form>
</body>
</html>