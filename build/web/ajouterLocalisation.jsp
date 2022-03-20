<%-- 
    Document   : ajouAbonne
    Created on : 31 août 2019, 02:51:59
    Author     : LENOVO
--%>
<%@page import="java.util.List"%>
<%@page import="model.Batiment"%>
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
            var liste = "<label for='inputAddress2'><h5><a style='font-size:20px;max-width: 350px; height: 33px;'>Choisir un Batiment</a></h5></label>";
            liste += "<select type='integer'  style='font-size:20px;max-width: 350px; height: 33px;' id='inputState1' class=\"form-control\" name='idBatiment'  onchange='myFunction1()' required >";
            var choix = parseInt(document.getElementById("inputState").value);
            
        <c:forEach var='bat' items='${listerBatiment}'>
            if (choix === parseInt(${bat.idZone})) {

                liste += "<option value='${bat.idBatiment}'> ${bat.nomBatiment}  </option>";

            }
        </c:forEach>
            liste += "</select>";
            
            document.getElementById("afficheZone").innerHTML = liste;


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
                        <li><a  href="Controleur?action=retour" style="font-size: 140%">retour</a></li>
                    </ul>
                </div>
            </div>
        <br/>
        <ul class="nav nav-tabs">
            <li class="active"><a href="Controleur?action=bienvenu" id="menu">Accueil</a></li>
            <li><a href="Controleur?action=voirD" id="menu">Consulter Demandes</a></li>  
                <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="menu"> Ajouter <span class="caret"></span> </a>
                <ul class="dropdown-menu"> 
                    <li> <a href="Controleur?action=AjObjet" id="puce"><p style="color:#FFA500">Objet</p></a> </li>
                    <li> <a href="Controleur?action=AjZone" id="puce"><p style="color:#FFA500">Zone</p></a> </li>
                    <li> <a href="Controleur?action=AjBat" id="puce"><p style="color:#FFA500">Bâtiment</p></a> </li>
                    <li> <a href="Controleur?action=AjLocalisation" id="puce"><p style="color:#FFA500">Localisation</p></a> </li>
                    <li> <a href="Controleur?action=AjReseau" id="puce"><p style="color:#FFA500"> Réseau</p></a> </li>
                    <li> <a href="Controleur?action=AjStation" id="puce"> <p style="color:#FFA500">Station</p></a> </li>
                    <li class="divider"></li> 
                    <li class="divider"></li> 
                    <li > <a href="Controleur?action=ajUser" id="puce"><p style="color:#FFA500">Utilisateur</p></a> </li>
                </ul>
            </li>
                <li class="dropdown">
                 <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="menu"> Lister <span class="caret"></span> </a>
                <ul class="dropdown-menu"> 
                    <li> <a href="Controleur?action=listeObjet" id="puce"><p style="color:#FFA500">Objet</p></a> </li>
                    <li> <a href="Controleur?action=listeZone" id="puce"><p style="color:#FFA500">Zone</p></a> </li>
                    <li> <a href="Controleur?action=listeBat" id="puce"><p style="color:#FFA500">Bâtiment</p></a> </li>
                    <li> <a href="Controleur?action=listeLocalisation" id="puce"><p style="color:#FFA500">Localisation</p></a> </li>
                    <li> <a href="Controleur?action=listeReseau" id="puce"><p style="color:#FFA500"> Réseau</p></a> </li>
                    <li> <a href="Controleur?action=listeStation" id="puce"> <p style="color:#FFA500">Station</p></a> </li>
                    <li class="divider"></li> 
                    <li class="divider"></li> 
                    <li > <a href="Controleur?action=listeAbonne" id="puce"><p style="color:#FFA500">Utilisateur</p></a> </li>
                </ul>
            </li>
        </ul> </nav>
    </header> 



        <div class="container-login100" style="background-image: url('images/lampe.png'); background-attachment: fixed;">
            <div class="wrap-login100 p-l-100 p-r-100 p-t-200 p-b-30" style="background-image: url('images/bg.png'); background-color: #faf9f8; width: 1000px;"> 
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
                        <input type="hidden" name="action" value="enrLoca"/>
                        
                        <span class="login100-form-title p-b-37" id="cal">
                            Ajouter une Localisation
                        </span> 

                        </span> 
                              
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                <label for="inputAddress2"><h5><a style="font-size:20px;">Choisir une Zone</a></h5></label>
                                <select type="integer" id="inputState" style="font-size:20px;max-width: 350px; height: 43px;" class="form-control" name="idZone" required onchange="myFunction()">
                                    <!--                                        <select name="idZone" class="form-control"  data-style="btn-white" id="titre">-->
                                    <option value=""> Choix Zone</option>                                        
                                    <c:forEach var="zo" items="${listerZone}">
                                        int idZone=${zo.idZone};
                                        <option value="${zo.idZone}"> ${zo.nomZone}  </option>
                                    </c:forEach>


                                </select>
                            </div>
                                 <div class="form-group col-md-6" id='afficheZone'>
                            
                                 </div>       
                            </div>  <br>            
                         
                        <div class="form-row">
                                <div class="form-group col-md-6">
                            <label for="inputAddress2"><h5><a style="font-size:20px;">Nom Localisation</a></h5></label>
                            <input type="text" class="form-control" id="inputAddress2" style="font-size:20px;"  type="text" placeholder="nom localisation" name="nomLoca"   required>
                                </div></div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a style="font-size:20px;">Type Localisation</a></h5></label>
                            <input type="text" class="form-control" style="font-size:20px;" id="inputAddress2" type="text" placeholder="type localisation" name="typeLoca"  required>
                        </div><br>

                        <div class="container-login100-form-btn">
                            <input type="submit" value="Enregistrer" style="font-size:20px;max-width: 75px" class="login100-form-btn"/><br/><br/>
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
    <div class="container"></div>

</footer>  


</body>
</html>




