<%-- 
    Document   : ajouterObjet
    Created on : 1 sept. 2019, 12:23:05
    Author     : LENOVO
--%>

<%@page import="org.eclipse.jdt.internal.compiler.parser.Parser.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html lang="fr">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>memoire</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sign Up Form by Colorlib</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Site CSS -->
        <link rel="stylesheet" href="style_1.css">
        <!-- Responsive CSS -->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/custom.css">
        <!-- Font Icon -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="vendor/nouislider/nouislider.min.css">
        <!-- Main css -->
        <link rel="stylesheet" href="css/form.css">
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
        <!-- Site CSS -->
        <link rel="stylesheet" href="style.css">
        <!-- Modernizer for Portfolio -->
        <script src="js/modernizer.js"></script>

        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->


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
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"><img src="images/logos/logo.png" alt="image"></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav  navbar-right">

                            <a href="Controleur?action=siteObjet"> <figure><img src="img/shutdown.png" alt="image" style="max-height: 50px;max-width: 50px"><figcaption style="font-size: 16px;font-family: Arial Black;color:#000">Retour</figcaption></figure></a>
                        </ul>
                    </div>
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="Controleur?action=bienvenu" id="menu">Accueil</a></li>
                        <li><a href="Controleur?action=voirD" id="menu">Consulter Demandes</a></li>  
                        <li> <a href="Controleur?action=listeAbonne" id="menu">Liste des Abonnés</a> </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="menu"> Ajouter <span class="caret"></span> </a>
                            <ul class="dropdown-menu" > 
                                <li > <a href="Controleur?action=AjObjet" id="puce">Objet</a> </li>
                                <li > <a href="Controleur?action=AjBat" id="puce">Bâtiment</a> </li>
                                <li > <a href="Controleur?action=AjZone" id="puce">Zone</a> </li>
                                <li> <a href="Controleur?action=AjReseau" id="puce"> Réseau</a> </li>
                                <li> <a href="Controleur?action=AjStation" id="puce"> Station</a> </li>
                                <li class="divider"></li> 
                                <li class="divider"></li> 
                                <li > <a href="Controleur?action=ajUser" id="puce">Utilisateur</a> </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>  

        <div class="container-login100" style="background-image: url('images/pic.png');">
            <div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30" style="background-image: url('images/bg.png');">   
                <div class="top-bar">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <div class="left-top">
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div><br/>
                <form class="login100-form validate-form" method="POST" action="Controleur">
                    <input type="hidden" name="action" value="AjLocalisation"/> 
                    <span class="login100-form-title p-b-37" id="cal">
                        Etape 2: Choisir un bâtiment puis valider.
                    </span>    
                    <table align="center">
                        <tbody>
                            <tr>
                                <td>
                                    <span id="titre"> 
                                        Zone:&nbsp;
                                    </span>
                                </td>
                                <td>
                                    <br/><div class="form-group">
                                        <select name="idZone" class="form-control"  data-style="btn-white" id="titre">
                                            <c:forEach var="zo" items="${listerZone}">
                                                int idZone=;
                                                <option value="${zo.idZone}"> ${zo.nom}  </option>
                                            </c:forEach>
                                        </select>
                                    </div>

                                </td>
                            </tr>
                            <tr>                            
                                <td>
                                    <span id="titre"> 
                                        Batiment:
                                    </span>
                                </td>
                                <td>
                                    <br/> <div class="form-group">
                                        <select name="idBatiment" class="form-control" data-style="btn-white" id="titre">
                                            <c:forEach var="bat" items="${listerBatiment}" >  
                                                int idBatiment=;
                                                <option value="${bat.idBatiment}"> ${bat.nomBatiment}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table><br/>
                    <div class="container-login100-form-btn">
                        <input type="submit" value="Valider" class="login100-form-btn" style="max-width: 50px"/><br/><br/>
                    </div>                       
                </form>
            </div> 
        </div>



        <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

        <!-- ALL JS FILES -->
        <script src="js/all.js"></script>
        <!-- ALL PLUGINS -->
        <script src="js/custom.js"></script>
        <script src="js/portfolio.js"></script>
        <script src="js/hoverdir.js"></script>    

        <footer class="footer">
            <div class="container">

        </footer>  
    </body>
</html>
