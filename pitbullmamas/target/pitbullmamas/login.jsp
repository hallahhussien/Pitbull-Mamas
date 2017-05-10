<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<title>Login</title>
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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!--[if (gt IE 9)|!(IE)]><!-->
<script src="js/jquery.mobile.customized.min.js"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/constants/taglib.jsp"%>
<html>
<body>
<!--include head element, which is stored in webapp directory-->
<c:import url="/constants/header.jsp"/>
<c:import url="/constants/menu.jsp"/>

<head>
    <title>Login</title>
</head>

<body class="regform">
<div>
    <div class="container">
        <div class="row text-center pad-top ">
            <div class="col-md-12">
                <h2>Login</h2>
            </div>
        </div>
        <div class="row  pad-top">
            <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <strong style="text-align:center;">Please Enter Your Email/Password</strong>
                    </div>
                    <div class="panel-body">
                        <FORM ACTION="/pitbullmamas/storelogin" METHOD="POST">
                            <div class="form-group input-group">
                                <span class="input-group-addon">@</span>
                                <INPUT TYPE="TEXT" NAME="j_username" value="${uname}" class="form-control" placeholder="Username">
                            </div>
                            <div class="form-group input-group">
                                <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                <INPUT TYPE="PASSWORD" NAME="j_password" class="form-control" placeholder="Password">
                            </div>
                            <p style="color:red">${failure}</p>
                            <div class="form-group input-group">
                                <INPUT TYPE="SUBMIT" VALUE="Log In" class="btn btn-success">
                            </div>
                        </FORM>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Trigger the modal with a button -->
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Not Member? Register Here</button>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h4 class="modal-title">Register</h4>
            </div>
            <div class="modal-body">
                <h2>Register</h2>
                <form action="/pitbullmamas/register" class="form-horizontal" method="post">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerFirstName">First Name: </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerFirstName" id="registerFirstName" placeholder="First Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerLastName">Last Name: </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerLastName" id="registerLastName" placeholder="Last Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerUsername">Username: </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerUsername" id="registerUsername" placeholder="Username">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerPassword">Password: </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerPassword" id="registerPassword" placeholder="Password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerReEnterPassword">Re-Enter Password: </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerReEnterPassword" id="registerReEnterPassword" placeholder="Re-Enter Password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerLocation">Where Are You Located?</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerLocation" id="registerLocation" placeholder="I'm Here">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerPuppyName">My Pitbull Baby's Name is: </label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="registerPuppyName" id="registerPuppyName" placeholder="Baby's Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="registerPuppyPhoto">Re-Enter Password: </label>
                        <div class="col-sm-10">
                            <input id="registerPuppyPhoto" type="file" name="file" size="50" />
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
        </div>
    </div>
</div>

</body>
<c:import url="constants/footer.jsp"></c:import>
</html>