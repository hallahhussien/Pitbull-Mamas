<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <!--[if (gt IE 9)|!(IE)]><!-->
    <link rel="icon" href="images/favicon.ico">
    <link rel="shortcut icon" href="images/favicon.ico" />
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/grid.css">
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
    <script src="js/jquery.mobile.customized.min.js"></script>
    <META http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Welcome!</title>
</head>
<c:import url="/constants/header.jsp"/>
<c:import url="/constants/menu.jsp"/>
<body>
<h2>Featured Products</h2>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <h4 class="text-center"><span class="label label-info">Toy</span></h4>
                    <img src="images/rope.jpeg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Rope Tug Toy</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>$4.99</label></h3>
                            </div>
                        </div>
                        <p>Rope is strong and has a naturally appealing texture that dogs can really get their teeth around.</p>
                        <div class="row">
                            <div class="col-md-6">
                                <a class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span> Like</a>
                            </div>
                            <div class="col-md-6">
                                <a href="#" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
                        </div>

                        <p> </p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <h4 class="text-center"><span class="label label-info">Toy</span></h4>
                    <img src="images/toys.jpg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Kong</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>$9</label></h3>
                            </div>
                        </div>
                        <p> Helps satisfy the instinctual need to chew. May be stuffed with treats. All-natural rubber formula. Tough and durable </p>
                        <div class="row">
                            <div class="col-md-6">
                                <a class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span> Favorite </a>
                            </div>
                            <div class="col-md-6">
                                <a href="#" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy </a></div>
                        </div>

                        <p> </p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <h4 class="text-center"><span class="label label-info">Food</span></h4>
                    <img src="images/treats.jpeg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Wheat Free Dog Treats</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>$8</label></h3>
                            </div>
                        </div>
                        <p>For your fur baby with allergies!</p>
                        <div class="row">
                            <div class="col-md-6">
                                <a class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span>Favorite</a>
                            </div>
                            <div class="col-md-6">
                                <a href="#" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
                        </div>

                        <p> </p>
                    </div>
                </div>
            </div>

        </div>

    </div>
    <div class="clear"></div>
</div>
</body>
</html>
