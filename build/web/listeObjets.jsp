<%-- 
    Document   : ListeAbonne
    Created on : 15 sept. 2019, 17:44:17
    Author     : LENOVO
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
                            <li> <a href="Controleur?action=AjObjet" style="font-color:#fd6802;" id="puce"><p style="color:#fd6802">Objet</p></a> </li>
                            <li> <a href="Controleur?action=AjZone" id="puce"><p style="color:#fd6802">Zone</p></a> </li>
                            <li> <a href="Controleur?action=AjBat" id="puce"><p style="color:#fd6802">B??timent</p></a> </li>
                            <li> <a href="Controleur?action=AjLocalisation" id="puce"><p style="color:#fd6802">Localisation</p></a> </li>
                            <li> <a href="Controleur?action=AjReseau" id="puce"><p style="color:#fd6802"> R??seau</p></a> </li>
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
                            <li> <a href="Controleur?action=listeBat" id="puce"><p style="color:#fd6802">B??timent</p></a> </li>
                            <li> <a href="Controleur?action=listeLocalisation" id="puce"><p style="color:#fd6802">Localisation</p></a> </li>
                            <li> <a href="Controleur?action=listeReseau" id="puce"><p style="color:#fd6802"> R??seau</p></a> </li>
                            <li> <a href="Controleur?action=listeStation" id="puce"> <p style="color:#fd6802">Station</p></a> </li>
                            <li class="divider"></li> 
                            <li class="divider"></li> 
                            <li > <a href="Controleur?action=listeAbonne" id="puce"><p style="color:#fd6802">Utilisateur</p></a> </li>
                        </ul>
                    </li>
                </ul> </nav>
        </header>
        <br/>
        <div class="container">          
            <nav class="navbar navbar-light bg-light" style="size: 40px; align-content: center; ">
                <form class="form-inline" class="form-horizontal" action="Controleur" methode="POST">
                    <input type="hidden" name="action" value="RchObjet"/>
                    <div class="form-row">
                        <table align="center">
                            <tbody>
                                <tr>
                                    <td><input class="form-control mr-sm-2" type="text" placeholder="---Taper votre recherche---" aria-label="Search" type="hidden" name="rechObjet" style="width:230px"/></td>
                                    <td><button type="submit" class="btn btn-primary mb-2" style="background-color:orange ;color: white;padding: 10px;height: 38px" ><img src="img/rech.png" style="width: 25px"/></button></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </form>
            </nav>
            <div class="container" style="text-align: center; font-size:15px;">
                <c:if test="${!empty listeObjet && !vu}">



                    <!--  <table class="table table-dark table-hover table-border">
                      <thead>--><div class="container">
                        <div class="col-lg-12">
                            <table class="table table-hover">
                                <thead>
                                    <tr style="text-align: center; font-size:20px;background-color: #FFA500"  >
                                        <th  scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Identifiant Objet</th>
                                        <th  scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Nom Zone</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Nom Batiment</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Nom Localisation</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Nom Station</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Nom Objet</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Nom Abonne</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Connectivite</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Voltage</th>
                                        <th scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Etat</th>
                                        <th  scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Suprimer</th>
                                        <th  scope="col" style="text-align: center; font-size:20px; Time new Roman;color: black">Modifier</th>


                                    </tr>
                                </thead>

                                <tbody>
                                    <c:forEach var="ob" items="${listeObjet}">
                                        <tr style="text-align: center; font-size:17px;">

                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.idObjet}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.nomZone}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.nomBatiment}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.nomLocalisation}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.nomStation}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.nomObjet}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.email}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.connectivite}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.voltage}</th>
                                            <th scope="col"  style="text-align: center; font-size:15px; Time new Roman;color: black">${ob.etat}</th>

                                            <th style="text-align: center;"><a href='Controleur?action=supprimerOb&idOb=${ob.idObjet}'><img src="img/del.png" style="width: 25px"/></a></th>
                                            <th style="text-align: center;"> <a href='Controleur?action=modifierOb&idOb=${ob.idObjet}'><img src="img/pen.png" style="width: 25px"/></a></th>


                                        </tr>

                                    </c:forEach>
                                </tbody>

                            </table></div></div></c:if></div>
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

