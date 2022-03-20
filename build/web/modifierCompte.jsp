<%-- 
    Document   : ajouAbonne
    Created on : 31 août 2019, 02:51:59
    Author     : LENOVO
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html lang="fr">
    <head>
        <!-- Basic -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">   

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- Site Metas -->
        <title>memoire</title>  
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">


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
    <script language= "JavaScript">

        function myFunction() {
            var choix = document.getElementById("profil").value;
            if (choix == "administrateur") {
                document.getElementById("demo").innerHTML = ajoutadmin;
            }
            if (choix == "abonne") {
                document.getElementById("demo").innerHTML = ajoutabonne;
            }

        }
    </script>


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
                                <a href="tel:1234567890"><i class="fa fa-phone" aria-hidden="true"></i> +2213051891</a>
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
                       <ul class="nav navbar-nav navbar-right">
                            <li><a  href="Controleur?action=ab" style="font-size: 140%">retour</a></li>
                        </ul>

                        <!--
                        <ul class="nav navbar-nav navbar-right">
                            <form action="Controleur" method="POST">
                                <input type="hidden" value="mdf" name="action"/>
                                <input type="hidden" value="${passe}" name="passe"/>
                                <input type="hidden" value="${login}" name="login"/>
                                <li><input type="submit" value="Modifier Compte" id="btn-mdf" ></li>
                            </form>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <form action="Controleur" method="POST">
                                <input type="hidden" value="main" name="action"/>
                                <input type="hidden" value="${passe}" name="passe"/>
                                <input type="hidden" value="${login}" name="login"/>
                                <li><input type="submit" value="Allumer ou Eteindre objets" id="btn-mdf" ></li>
                            </form>
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <form action="Controleur" method="POST">
                                <input type="hidden" value="rpc" name="action"/>
                                <input type="hidden" value="${passe}" name="passe"/>
                                <input type="hidden" value="${login}" name="login"/>
                                <li><input type="submit" value="Rapport de consommation" id="btn-mdf" ></li>
                            </form>
                        </ul>-->
                    </div>
                </div>
            </nav><br/>

        </header> 


        <div class="container-login100" style="background-image: url('images/lampe.png');">
            <div class="wrap-login100 p-l-100 p-r-100 p-t-200 p-b-30" style="background-image: url('images/bg.png'); background-color: #faf9f8; width: 1000px;"> 

                <form class="login100-form validate-form" method="POST" action="Controleur" style="font-size:20px;"> 
                    <input type="hidden" name="action" value="enrMDF"/>
                    <span class="login100-form-title p-b-37" id="cal">
                        Mise à jour Compte
                    </span>        
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
                    <div class="form-group">
                        <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="hidden" name="idUser"   value="${idUser}" required>
                    </div>
                    <div class="form-group">
                        <label for="inputAddress2"><h5><a  style="font-size:20px;" >Login:</a></h5></label>
                        <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" value="${login}" name="login"  required>
                    </div>
                    <span class="login100-form-title p-b-37" id="mes">
                        ${message}
                    </span>  
                    <div classe="form-row">
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Mot de passe:</a></h5></label>
                            <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="password" value="${passe}" name="passe"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Confirmer mot de passe:</a></h5></label>
                            <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="password" value="${passe}" name="confirmpasse"  required>
                        </div>
                    </div>
                    <div classe="form-row">
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Prénom:</a></h5></label>
                            <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" value="${prenom}" name="prenom"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Nom:</a></h5></label>
                            <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" value="${nom}" name="nom"  required>
                        </div>
                    </div>
                    <div classe="form-row">
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Email:</a></h5></label>
                            <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="email" value="${email}" name="email"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Adresse:</a></h5></label>
                            <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" value="${adresse}" name="email"  required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputAddress2"><h5><a  style="font-size:20px;" >Téléphone</a></h5></label>
                        <input class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" name="tel" value="${tel}" onkeypress='return event.charCode >= 48 && event.charCode <= 57' required>
                    </div>
                    <div class="form-group">
                        <input class="input100" type="hidden" name="profil" value="${profil}">
                    </div>
                    <p id="demo" ></p>         
                    <div class="container-login100-form-btn">
                        <input type="submit" value="Enregistrer" class="login100-form-btn" style="max-width: 50px"/><br/><br/>
                    </div>
                </form>
            </div>
        </div>

    </div>
</div>
</div>

<footer class="footer" >
    <div class="container">
</footer>

<a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

<!-- ALL JS FILES -->
<script src="js/all.js"></script>
<!-- ALL PLUGINS -->
<script src="js/custom.js"></script>
<script src="js/portfolio.js"></script>
<script src="js/hoverdir.js"></script>    

</body>
</html>


