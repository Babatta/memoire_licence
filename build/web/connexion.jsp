
<%-- 
    Document   : DefinirAbonne
    Created on : 1 sept. 2019, 12:23:05
    Author     : TOSHIBA
--%>

<%@page import="java.util.List"%>
<%@page import="model.Batiment"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="fr">
    <head>
        <!-- Basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">   

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- Site Metas -->
        <title>memoire</title>  
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">



        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Site CSS -->
        <link rel="stylesheet" href="style_1.css">
        <!-- Responsive CSS -->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/custom.css">
        <link rel="stylesheet" href="style.css">
        <!-- Modernizer for Portfolio -->
        <script src="js/modernizer.js"></script>

        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Colorlib Templates">
        <meta name="author" content="Colorlib">
        <meta name="keywords" content="Colorlib Templates">

        <!-- Title Page-->


        <!-- Icons font CSS-->
        <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
        <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
        <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

        <!-- Main CSS-->
        <link href="css/main.css" rel="stylesheet" media="all">
        <link href="css/icomoon.css" rel="stylesheet" >
    </head>
    <body>


        <div class="top-bar">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-6 col-sm-6">
                        <div class="left-top">
                            <div class="email-box">
                                <a href="#"><i class="fa fa-envelope-o" aria-hidden="true"></i> projetmemoire@gmail.com</a>
                            </div>
                            <div class="phone-box">
                                <a href="tel:1234567890"><i class="fa fa-phone" aria-hidden="true"></i> +221773051891</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <header class="header header_style_01">
            <nav class="megamenu navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Plateforme</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="Controleur?action=bienvenu"><img src="images/logos/logo.png" alt="image"></a>
                    </div>

                    <div id="navbar" class="navbar-collapse collapse">
                        <table align="right">
                            <tr>
                                <td>
                                    <ul class="nav navbar-nav navbar-right">
                                        <li><a href="Controleur?action=bienvenu" style="font-size: 150%"> <!--<figure><img src="img/compteUser.png" alt="image" style="max-height: 85px;max-width: 85px"><figcaption ></figcaption></figure>--> retour</a></li>
                                    </ul>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </nav>
        </header>


        <div class="container-login100" style="background-image: url('images/lampe.png'); background-attachment: fixed; ">
            <!--            <div class="wrap-login100 p-l-100 p-r-100 p-t-200 p-b-30" style="background-image: url('images/bg.png'); background-color: #faf9f8; width: 1800px;"> -->
            <div class="top-bar">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <div class="left-top">

                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container"> 

                <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins" style="background-image: url('images/bg.png');">
                    <div class="wrapper wrapper--w780">
                        <div class="card card-3">

                            <div class="card-body" style="background-image: url('images/bg.png');">
                                <center>
                                <h2 class="title">Page Authentification</h2>
                                <form method="POST" action="Controleur" methode="POST">
                                    <input type="hidden" name="action" value="connecte"/>
                                    <div class="input-group">
                                        <input class="input--style-3" type="text" placeholder="Login" name="login">
                                    </div>
                                    <div class="input-group">
                                        <input class="input--style-3" type="password" placeholder="Password" name="passe">
                                    </div>
                                    <div class="p-t-10">
                                        <button class="btn btn--pill btn--green" type="submit">Se Connecter</button>
                                    </div>
                                </form>
                                </center>
                            </div>
                        </div>
                    </div>
                </div>
            </div>



            <!-- Jquery JS-->
            <script src="vendor/jquery/jquery.min.js"></script>
            <!-- Vendor JS-->
            <script src="vendor/select2/select2.min.js"></script>
            <script src="vendor/datepicker/moment.min.js"></script>
            <script src="vendor/datepicker/daterangepicker.js"></script>

            <!-- Main JS-->
            <script src="js/global.js"></script>




            <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

            <!-- ALL JS FILES -->
            <script src="js/all.js"></script>
            <!-- ALL PLUGINS -->
            <script src="js/custom.js"></script>
            <script src="js/portfolio.js"></script>
            <script src="js/hoverdir.js"></script>    
    </body>
</html>


