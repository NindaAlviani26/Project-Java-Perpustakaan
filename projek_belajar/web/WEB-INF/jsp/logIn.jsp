<%-- 
    Document   : logIn
    Created on : Oct 8, 2019, 8:49:25 PM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Perpustakaan</title>
        <link href="img/n.jpg" rel="icon">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('img/perpus.jpg');">
                <div class="wrap-login100">
                    <form:form id="formInput" action="masuk.htm" modelAttribute="log" method="POST">
                        <div align="center">
                        <img src="img/n.jpg" alt="Alternate Text"  width="100px" height="90px" style="border-radius: 100%"/>
                        </div>
                            
                        <span class="login100-form-title p-b-34 p-t-27">
                            Log in
                        </span>

                        <div class="wrap-input100 validate-input" data-validate = "Enter username"> 



                            <form:input class="input100" type="text" placeholder="username"   path="username"></form:input>
                                <span class="focus-input100" data-placeholder="&#xf207;"></span>
                            </div>

                            <div class="wrap-input100 validate-input" data-validate="Enter password">
                            <form:input class="input100" type="password" placeholder="Password" path="password"></form:input>
                                <span class="focus-input100" data-placeholder="&#xf191;"></span>
                            </div>
                            <div class="container-login100-form-btn">
                            <form:button class="login100-form-btn">
                                Login
                            </form:button>

                        </div>
                        <br>
                        <h6 align="right" style="color:white;">Created &copy Ninda Try Alviani</h6>
                    </form:form>
                </div>
            </div>
        </div>

    </body>
</html>
