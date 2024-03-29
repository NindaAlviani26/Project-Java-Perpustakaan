<%-- 
    Document   : frame
    Created on : Oct 7, 2019, 2:29:06 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>Perpustakaan Ninda Try Alviani</title>

        <!-- Favicons -->
        <link href="img/n.jpg" rel="icon">
        <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Bootstrap core CSS -->
        <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!--external css-->
        <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="css/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="lib/gritter/css/jquery.gritter.css" />
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/style-responsive.css" rel="stylesheet">
        <script src="lib/chart-master/Chart.js"></script>

        <!-- =======================================================
          Template Name: Dashio
          Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
          Author: TemplateMag.com
          License: https://templatemag.com/license/
        ======================================================= -->
    </head>

    <body>

        <c:url var="index" value="menuUtama.htm"></c:url>
            <section id="container">
                <!-- **********************************************************************************************************************************************************
                    TOP BAR CONTENT & NOTIFICATIONS
                    *********************************************************************************************************************************************************** -->
                <!--header start-->
                <header class="header black-bg">
                    <div class="sidebar-toggle-box">
                        <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                    </div>
                    <!--logo start-->
                    <a href="${index}" class="logo"><b>PERPUS<span>TAKAAN</span></b></a>

                    <div class="top-menu">
                        <ul class="nav pull-right top-menu">
                            <c:url var="logOut" value="index.htm"></c:url>
                            <li><a class="logout" href="${logOut}">Logout</a></li>
                        </ul>
                    </div>
                </header>
                <!--header end-->
                <!-- **********************************************************************************************************************************************************
                    MAIN SIDEBAR MENU
                    *********************************************************************************************************************************************************** -->
                <!--sidebar start-->
                <aside>
                    <div id="sidebar" class="nav-collapse ">
                        <!-- sidebar menu start-->
                    <c:url var="panggil" value="buku.htm"></c:url>
                    <c:url var="panggilAnggota" value="anggota.htm"></c:url>
                    <c:url var="panggilPinjaman" value="pinjaman.htm"></c:url>
                        <ul class="sidebar-menu" id="nav-accordion">
                            <p class="centered"><a href="${index}"><img src="img/NDO.jpg" class="img-circle" width="80"></a></p>
                            <h5 class="centered">Ninda Try Alviani</h5>
                            <li class="mt">
                            <a href="${index}">
                                <i class="fa fa-dashboard"></i>
                                <span>Dashboard</span>
                            </a>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;">
                                <i class="fa fa-desktop"></i>
                                <span>Data</span>
                            </a>
                            <ul class="sub">
                                <li><a href="${panggil}">Data Buku</a></li>
                                <li><a href="${panggilAnggota}">Data Anggota</a></li>
                                <li><a href="${panggilPinjaman}">Data Pinjaman</a></li>
                            </ul>
                        </li>
                        
                    <c:url var="galery" value="galeryBuku.htm"></c:url>
                        <li class="sub-menu">
                            <a href="${galery}">
                                <i class="fa fa-film"></i>
                                <span>Galery</span>
                            </a>
                        </li>

                        <!-- sidebar menu end-->
                </div>
            </aside>
            <!--sidebar end-->
            <!-- **********************************************************************************************************************************************************
                MAIN CONTENT
                *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    
                    <!-- /col-lg-9 END SECTION MIDDLE -->
                    <!-- **********************************************************************************************************************************************************
                        RIGHT SIDEBAR CONTENT
                        *********************************************************************************************************************************************************** -->

                    <!-- /col-lg-3 -->

                    <!--main content end-->
                    <!--footer start-->

                    <!--footer end-->
                </section>
                <!-- js placed at the end of the document so the pages load faster -->
                <script src="lib/jquery/jquery.min.js"></script>

                <script src="lib/bootstrap/js/bootstrap.min.js"></script>
                <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
                <script src="lib/jquery.scrollTo.min.js"></script>
                <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
                <script src="lib/jquery.sparkline.js"></script>
                <!--common script for all pages-->
                <script src="lib/common-scripts.js"></script>
                <script type="text/javascript" src="lib/gritter/js/jquery.gritter.js"></script>
                <script type="text/javascript" src="lib/gritter-conf.js"></script>
                <!--script for this page-->
                <script src="lib/sparkline-chart.js"></script>
                <script src="lib/zabuto_calendar.js"></script>
                <script type="text/javascript">
$(document).ready(function () {
    var unique_id = $.gritter.add({
        // (string | mandatory) the heading of the notification
        title: 'Welcome to Ninda!',
        // (string | mandatory) the text inside the notification
        text: 'Hover me to enable the Close Button. You can hide the left sidebar clicking on the button next to the logo.',
        // (string | optional) the image to display on the left
        image: 'img/NDO.jpg',
        // (bool | optional) if you want it to fade out on its own or just sit there
        sticky: false,
        // (int | optional) the time you want it to be alive for before fading out
        time: 2000,
        // (string | optional) the class name you want to apply to that specific message
        class_name: 'my-sticky-class'
    });

    return false;
});
                </script>
                <script type="application/javascript">
                    $(document).ready(function() {
                    $("#date-popover").popover({
                    html: true,
                    trigger: "manual"
                    });
                    $("#date-popover").hide();
                    $("#date-popover").click(function(e) {
                    $(this).hide();
                    });

                    $("#my-calendar").zabuto_calendar({
                    action: function() {
                    return myDateFunction(this.id, false);
                    },
                    action_nav: function() {
                    return myNavFunction(this.id);
                    },
                    ajax: {
                    url: "show_data.php?action=1",
                    modal: true
                    },
                    legend: [{
                    type: "text",
                    label: "Special event",
                    badge: "00"
                    },
                    {
                    type: "block",
                    label: "Regular event",
                    }
                    ]
                    });
                    });

                    function myNavFunction(id) {
                    $("#date-popover").hide();
                    var nav = $("#" + id).data("navigation");
                    var to = $("#" + id).data("to");
                    console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
                    }
                </script>

                </body>

                </html>
