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

    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <title>Find Your New Best Friend at a Shelter Near You!</title>
    <c:import url="/constants/header.jsp"/>
    <c:import url="/constants/menu.jsp"/>
    <script src="http://maps.google.com/maps/api/js?key=AIzaSyBQ3Cw-oxgyUb1RCxKStLOgIb0K2mBPdZc"
            type="text/javascript"></script>
</head>
<body>
<div id="map" style="width: 500px; height: 400px; position: center"></div>

<script type="text/javascript">
    var locations = [
        ['Dane County Human Society',  43.043134, -89.292327, 3],
        ['Under Dog Pet Rescue', 43.093929, -89.340460, 2],
        ['Madison College', 43.121829, -89.327919, 1],

    ];

    var map = new google.maps.Map(document.getElementById('map'), {
        zoom: 10,
        center: new google.maps.LatLng(43.0731, -89.4012),
        mapTypeId: google.maps.MapTypeId.ROADMAP
    });

    var infowindow = new google.maps.InfoWindow();

    var marker, i;

    for (i = 0; i < locations.length; i++) {
        marker = new google.maps.Marker({
            position: new google.maps.LatLng(locations[i][1], locations[i][2]),
            map: map
        });

        google.maps.event.addListener(marker, 'click', (function(marker, i) {
            return function() {
                infowindow.setContent(locations[i][0]);
                infowindow.open(map, marker);
            }
        })(marker, i));
    }
</script>
<p>Any of these locations could be the current home of your new best friend!</p>
</body>
</html>