<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<title>Create User</title>
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


<body>

    <h1>Join the Pitbull Mama's Crew :)</h1>
    <form method="post" action="createUser" enctype="multipart/form-data">
        <table border="0">
            <tr>
                <td>First Name: </td>
                <td><input type="text" name="firstName" size="50"/></td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td><input type="text" name="lastName" size="50"/></td>
            </tr>
            <tr>
                <td>Email Address (this will be your username): </td>
                <td><input type="text" name="email" size="50"/></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="text" name="password" size="50"/></td>
            </tr>
            <tr>
                <td>Where do you live?: </td>
                <td><input type="text" name="location" size="50"/></td>
            </tr>
            <tr>
                <td>Upload a picture of your fur baby! </td>
                <td><input type="file" name="image" size="50"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Save">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>

