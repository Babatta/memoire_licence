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
            var liste = "<label for='inputState1'><h5><a  style='font-size:20px;'>Choisir un Batiment</a></h5></label>";
            liste += "<select type='text'style='font-size:20px; height: 35px;' id='inputState1' class=\"form-control\" name='idBatiment'  onchange='myFunction1()' required >";
            var choix = parseInt(document.getElementById("inputState").value);
            liste += "<option value=''> ----------- Choisir un Batiment ------------ </option>";

        <c:forEach var='bat' items='${listerBatiment}'>
            if (choix === parseInt(${bat.idZone})) {
                liste += "<option value='${bat.idBatiment}&" + choix + "'> ${bat.nomBatiment} </option>";
//               alert(liste); 
            }
        </c:forEach>
            liste += "</select>";
            document.getElementById("afficheZone").innerHTML = liste;


        }

        function myFunction1() {
            var liste1 = "<label for='inputState2'><h5><a style='font-size:20px;'>Choisir une Localisation</a></h5></label>";
            liste1 += "<select type='integer' style='font-size:20px; height: 35px;' id=\inputState2\" class=\"form-control\" name='idLocalisation'  required >";
            liste1 += "<font align='center'><option value='' > ----------- Choisir une localisation ------------ </option></font>";
            var choix1 = document.getElementById("inputState1").value;
            var tableau = choix1.split('&');

        <c:forEach var='loca' items='${listerLoca}'>
//                    alert("idZone="+tableau[1]);
//                    alert("idBatiment="+tableau[0]);
//                    alert("idBat="+parseInt(${loca.idBatiment}));
            //alert(${loca.idLocalisation});
            if ((parseInt(tableau[1]) === parseInt(${loca.idZone})) && (parseInt(tableau[0]) === parseInt(${loca.idBatiment}))) {
                liste1 += "<option value='${loca.idLocalisation}'> ${loca.nomLocalisation}  </option>";
            }
        </c:forEach>
            liste1 += "</select>";
            liste1 += "</div>";
            document.getElementById("afficheBatiment").innerHTML = liste1;



//          var  liste1 = "<label for='inputState2'><h5><a>Choisir une Localisation</a></h5></label>";
//            liste1 += "<select type=\"text\" id=\"inputState2\" class=\"form-control\" name=\"idLocalisation\"  required >";
//            var choix1 = parseInt(document.getElementById("inputState1").value);
//
//        <c:forEach var='loca' items='${listerLoca}'>
//            if (choix1 === parseInt(${loca.idBatiment})) {
//                alert(choix1);
//                liste1 += "<option value='${loca.idLocalisation}'> ${loca.nomLocalisation}  </option>";
//
//            }
//        </c:forEach>
//            liste1 += "</select>";
//            liste1+="</div>";
//            document.getElementById("afficheBatiment").innerHTML = liste1;
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
                                <li><a  href="compte.jsp" style="font-size: 140%">Deconnexion</a></li>
                            </ul>
                        </div>
                    </div>
                    <br/>
                    <ul class="nav nav-tabs">
                        <li><a href="Controleur?action=bienvenu" id="menu">Accueil</a></li>
                        <li><a href="Controleur?action=voirD" id="menu">Consulter Demandes</a></li>  
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="menu"> Ajouter <span class="caret"></span> </a>
                            <ul class="dropdown-menu"> 
                                <li> <a href="Controleur?action=AjObjet" style="font-color:#fd6802;" id="puce"><p style="color:#fd6802">Objet</p></a> </li>
                                <li> <a href="Controleur?action=AjZone" id="puce"><p style="color:#fd6802">Zone</p></a> </li>
                                <li> <a href="Controleur?action=AjBat" id="puce"><p style="color:#fd6802">Bâtiment</p></a> </li>
                                <li> <a href="Controleur?action=AjLocalisation" id="puce"><p style="color:#fd6802">Localisation</p></a> </li>
                                <li> <a href="Controleur?action=AjReseau" id="puce"><p style="color:#fd6802"> Réseau</p></a> </li>
                                <li> <a href="Controleur?action=AjStation" id="puce"> <p style="color:#fd6802">Station</p></a> </li>
                                <li class="divider"></li> 
                                <li class="divider"></li> 
                                <li > <a href="Controleur?action=ajUser" id="puce"><p style="color:#fd6802">Utilisateur</p></a> </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="menu"> Lister <span class="caret"></span> </a>
                            <ul class="dropdown-menu"> 
                                <li> <a href="Controleur?action=listeObjet" id="puce"><p style="color:#fd6802">Objet</p></a> </li>
                                <li> <a href="Controleur?action=listeZone" id="puce"><p style="color:#fd6802">Zone</p></a> </li>
                                <li> <a href="Controleur?action=listeBat" id="puce"><p style="color:#fd6802">Bâtiment</p></a> </li>
                                <li> <a href="Controleur?action=listeLocalisation" id="puce"><p style="color:#fd6802">Localisation</p></a> </li>
                                <li> <a href="Controleur?action=listeReseau" id="puce"><p style="color:#fd6802"> Réseau</p></a> </li>
                                <li> <a href="Controleur?action=listeStation" id="puce"> <p style="color:#fd6802">Station</p></a> </li>
                                <li class="divider"></li> 
                                <li class="divider"></li> 
                                <li > <a href="Controleur?action=listeAbonne" id="puce"><p style="color:#fd6802">Utilisateur</p></a> </li>
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
                    <center>
                        <form class="login100-form validate-form" method="POST" action="Controleur" >
                            <input type="hidden" name="action" value="enrObjet"/>

                            <span class="login100-form-title p-b-37" id="cal">
                                Formulaire d'ajout d'un Objet
                            </span> 

                            </span>      
                            <div class="form-group">
                                <label for="inputAddress2"><h5><a style="font-size:20px;">Choisir une Zone</a></h5></label>
                                <select type="text" id="inputState" class="form-control"  style="font-size:20px; height: 35px;" name="idZone" required onchange="myFunction()">

                                <c:forEach var="zo" items="${listerZone}">
                                    int idZone=${zo.idZone};
                                    <option value="${zo.idZone}"> ${zo.nomZone}  </option>
                                </c:forEach>


                            </select>

                        </div>      

                        <div class="form-group"  id='afficheZone'>

                        </div>

                        <div class="form-group">      
                            <div class="form-group" id='afficheBatiment'>


                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputAddress2"><h5><a style="font-size:20px;">Nom Objet</a></h5></label>
                            <input type="text" class="form-control" style="font-size:20px;" id="inputAddress2" type="text" placeholder="Nom Objet" name="nomObjet"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a style="font-size:20px;">Type</a></h5></label>
                            <input type="text" class="form-control" style="font-size:20px;"id="inputAddress2" type="text" placeholder="type" name="type"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a style="font-size:20px;">Connectivite</a></h5></label>
                            <input type="text" class="form-control" style="font-size:20px;"id="inputAddress2" type="email" name="connectivite"  placeholder="connectivite"  required>
                        </div>



                        <div class="form-group">
                            <label for="inputState"><h5><a style="font-size:20px;">Station de Base</a></h5></label>
                            <select id="inputState" style="font-size:20px; height: 35px;" class="form-control" name="idStation"> 
                                <c:forEach var="st" items="${listeStation}">

                                    <option value="${st.idStation}">${st.nomStation}  </option>
                                </c:forEach>

                            </select>
                        </div>
                        <div class="form-row">      
                            <div class="form-group col-md-6">
                                <label for="inputCity"><h5><a style="font-size:20px;">Voltage</a></h5></label>
                                <input type="integer" style="font-size:20px;"class="form-control" id="inputCity" type="text" name="voltage"  placeholder="voltage"  required>
                            </div>
                            <div class="form-group col-md-4">
                                <label for="inputState"><h5><a style="font-size:20px;">Abonne</a></h5></label>
                                <select id="inputState" style="font-size:20px; height: 35px;width: 400px; align-content: center;" type="integer" class="form-control" name="idUser"> 
                                    <c:forEach var="ab" items="${listeAbonne}">                    
                                        <option value="${ab.idUser}"> ${ab.prenom}&nbsp;${ab.nom}&nbsp${ab.tel}  </option>
                                    </c:forEach>
                                </select>
                                </select>
                            </div>
                        </div> 
                        <div class="container-login100-form-btn">
                            <input type="submit" value="Enregistrer" style="font-size:20px;" class="login100-form-btn" style="max-width: 50px"/><br/><br/>
                        </div>
                    </form></center>
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

