<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Please enter your userid and password below.</h3>
    <form action="j_security_check" method="post">
        Email: <input type="text" name="j_email"><br />
        Password:  <input type="password" name="j_password"><br />
        <input type="submit" value="login">
    </form>
</body>
</html>