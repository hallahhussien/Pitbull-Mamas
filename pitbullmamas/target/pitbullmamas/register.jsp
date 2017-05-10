<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 2/12/17
  Time: 12:07 AM
  To change this template use File | Settings | File Templates.
--%>
<c:set var="title" value="Become a Pitbull Mama (:" />
<%@include file="/constants/header.jsp"%>

<html>
<head>
    <c:import url="/constants/header.jsp"/>
    <c:import url="constants/menu.jsp"/>
</head>
<body>
<div class="container">
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
<c:import url="/constants/footer.jsp"/>
</body>
</html>