<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/3/17
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <title>Contacts</title>
        <meta charset="utf-8">
        <meta name="format-detection" content="telephone=no" />
        <link rel="stylesheet" href="css/form.css">
        <link rel="stylesheet" href="css/style.css">
        <link href='//fonts.googleapis.com/css?family=Economica' rel='stylesheet' type='text/css'>
        <script src="js/jquery.js"></script>
        <script src="js/jquery-migrate-1.1.1.js"></script>
        <script src="js/script.js"></script>
        <script src="js/jquery.ui.totop.js"></script>
        <script src="js/superfish.js"></script>
        <script src="js/TMForm.js"></script>
        <script src="js/jquery.equalheights.js"></script>
        <script src="js/jquery.mobilemenu.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script>
            $(document).ready(function(){
                $().UItoTop({ easingType: 'easeOutQuart' });
            })
        </script>
        <!--[if lt IE 8]>
        <div style=' clear: both; text-align:center; position: relative;'>
            <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
                <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
            </a>
        </div>
        <![endif]-->
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <link rel="stylesheet" media="screen" href="css/ie.css">
        <![endif]-->
    </head>
<body id="top">
<div class="main_color">
    <!--==============================header=================================-->
    <header>
        <div class="clear"></div>
        <div class="container_12">
            <div class="grid_12">
                <h1>
                    <a href="/index">
                        <img src="images/header3.png" alt="Pitbull Mama's">
                    </a>
                </h1>
            </div>
        </div>
        <div class="clear"></div>
        <div class="menu_block">
            <div class="container_12">
                <div class="grid_12">
                    <nav class="horizontal-nav full-width horizontalNav-notprocessed">
                        <ul class="sf-menu">
                            <li><a href="index.html">Home</a></li>
                            <li><a href="/products">Products</a></li>
                            <li><a href="/adopt">Adopt</a></li>
                            <li class="current"><a href="contact.jsp">Contacts</a></li>
                            <li><a href="/login">Login</a></li>
                        </ul>
                    </nav>
                    <div class="clear"></div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </header>
    <!--==============================Content=================================-->
    <div class="cont_wrapper">
        <div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - January 13, 2014!</div>
            <div class="container_12">
                <div class="grid_5">
                    <h3>Contact Info</h3>
                    <div class="map">
                        <p>Located in the heart of New York, Pitbull Mama's is dedicated to help you be the best puppy mom you can be! Feel free to contact us with any questions or if you have any new products you would liket o share! </p>
                        <figure>
                            <iframe src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Brooklyn,+New+York,+NY,+United+States&amp;aq=0&amp;sll=37.0625,-95.677068&amp;sspn=61.282355,146.513672&amp;ie=UTF8&amp;hq=&amp;hnear=Brooklyn,+Kings,+New+York&amp;ll=40.649974,-73.950005&amp;spn=0.01628,0.025663&amp;z=14&amp;iwloc=A&amp;output=embed"></iframe>
                        </figure>
                        <address>
                            <dl>
                                <dt>Pitbull Mama's Inc. <br>
                                    8901 Marmora Road,<br>
                                    Glasgow, D04 89GR.
                                </dt>
                                <dd><span>Freephone:</span>+1 800 559 6580</dd>
                                <dd><span>Telephone:</span>+1 800 603 6035</dd>
                                <dd><span>FAX:</span>+1 800 889 9898</dd>
                                <dd>E-mail: <span class="col1"><a href="#">mail@demolink.org</a></span></dd>
                            </dl>
                        </address>
                    </div>
                </div>
                <div class="grid_6 prefix_1">
                    <h3>Get in Touch</h3>
                    <form id="form">
                        <div class="success_wrapper">
                            <div class="success-message">Contact form submitted</div>
                        </div>
                        <label class="name">
                            <input type="text" placeholder="Name:" data-constraints="@Required @JustLetters" />
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*This is not a valid name.</span>
                        </label>
                        <label class="email">
                            <input type="text" placeholder="E-mail:" data-constraints="@Required @Email" />
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*This is not a valid email.</span>
                        </label>
                        <label class="phone">
                            <input type="text" placeholder="Phone:" data-constraints="@Required @JustNumbers"/>
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*This is not a valid phone.</span>
                        </label>
                        <label class="message">
                            <textarea placeholder="Message:" data-constraints='@Required @Length(min=20,max=999999)'></textarea>
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*The message is too short.</span>
                        </label>
                        <div>
                            <div class="clear"></div>
                            <div class="btns">
                                <a href="#" data-type="reset" class="btn">Clear</a>
                                <a href="#" data-type="submit" class="btn">Submit</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <!--==============================footer=================================-->
    <c:import url="footer.jsp"/>
    </body>
</html>
