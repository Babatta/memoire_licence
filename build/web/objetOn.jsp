
<%-- 
    Document   : DefinirAbonne
    Created on : 1 sept. 2019, 12:23:05
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <html lang="fr">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
            <title>memoire</title>
            <meta name="description"/>
            <script>
                function $_GET(param) {
                    var queue = window.location.search.substr(1);
                    if (queue !== null) {
                        var params = queue.split('&');

                        alert(vars);
                        return vars;
                    }

                }

                function init() {
                    var bouton = document.getElementById("act");
                    var params = window.location.search;
                    var etat = params.split('=');
                    if (etat[2] === "1") {
                        bouton.checked = true;
                    } else if (etat[2] === "0") {
                        bouton.checked = false;
                    }
                }

                function change(idObj) {
                    var action = document.getElementById("act/" + idObj);
                    if (action.checked === true) {
                        window.location.href = "http://172.31.255.254/arduino/arduino_1/digital/" + idObj + "/1";
                    } else {
                        window.location.href = "http://172.31.255.254/arduino/arduino_1/digital/" + idObj + "/0";
                    }
                }
            </script>

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

                                    <link rel="stylesheet" href="css/bootstrap.min.css">
                                        <link rel="stylesheet" type="text/css" href="css/style_1.css" />
                                        <!-- Site CSS -->
                                        <link rel="stylesheet" href="style_1.css">
                                            <!-- Responsive CSS -->
                                            <link rel="stylesheet" href="css/responsive.css">
                                                <!-- Custom CSS -->
                                                <link rel="stylesheet" href="css/custom.css">

                                                    <!-- Modernizer for Portfolio -->
                                                    <script src="js/modernizer.js"></script>


                                                    </head>
                                                    <body onload="init()">



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
                                                                        <a class="navbar-brand" href="bienvenu.jsp"><img src="images/logos/logo.png" alt="image"></a>
                                                                    </div>
                                                                    <div id="navbar" class="navbar-collapse collapse">
                                                                        <ul class="nav navbar-nav navbar-right">
                                                                           <li><a href="Controleur?action=ObjetOff&id=${idUser}" style="font-size: 140%">Objets Non actifs</a></li>
                                                                            <li><a href="Controleur?action=objet&id=${idUser}" style="font-size: 150%">retour</a></li>
                                                                        </ul>
                                                                    </div>
                                                                </div>
                                                            </nav>
                                                        </header>


                                                        <div id="about" class="section wb"  style="background-image: url('images/bg.png');">
                                                            <div class="container">
                                                                <div class="section-title text-center">
                                                                    <h3>Liste des objets actifs</h3>
                                                                </div><!-- end title -->
                                                                <c:forEach var="ob" items="${listeObjet}">
                                                                    <div class="row">
                                                                        <div class="col-md-4 col-sm-6">
                                                                            <div class="pricingTable">
                                                                                <div class="pricingTable-header">
                                                                                    <h3 class="title">${ob.nomObjet}</h3>
                                                                                    <span class="sub-title">${ob.idObjet}</span>
                                                                                    <span class="sub-title">${ob.nomStation}</span>
                                                                                    <span class="sub-title">${ob.nomZone}</span>
                                                                                    <span class="sub-title">${ob.nomBatiment}</span>
                                                                                    <span class="sub-title">${ob.nomLocalisation}</span>
                                                       <!--                             <span class="sub-title">${ob.connectivite}</span>-->
                                                                                    <span class="year">Voltage<br>${ob.voltage}</span>
                                                                                </div>

                                                                                <a>
                                                                                    <form name="formule" class="form-horizontal" action="Control" methode="POST">
                                                                                        <input type="hidden" name="etatcheck" value="on"/>
                                                                                        <input type="hidden" name="etatcheck" value="off"/>
                                                                                        <a href="http://www.outils-web.com"><img src="../../img/ow.png" border="0" width="200" height="50" alt=""></a>
                                                                                        <br/><p class="tt" ></p><br /><br />
                                                                                        <section class="main">
                                                                                            <div class="switch demo">
                                                                                                <c:if test="${ob.etat == 1}">
                                                                                                    <input type="checkbox" name="action" id="act/${ob.idObjet}" checked="true" onclick="change(${ob.idObjet})"/><label><i></i></label>
                                                                                                        </c:if>
                                                                                                        <c:if test="${ob.etat  == 0}">
                                                                                                    <input type="checkbox" name="action" id="act/${ob.idObjet}" onclick="change(${ob.idObjet})"/><label><i></i></label>
                                                                                                        </c:if>
                                                                                            </div>
                                                                                            <!--                                                                                                     <div class="switch demo">
                                                                                                                                                                                                        <input type="checkbox" checked><label><i></i></label>
                                                                                                                                                                                                </div> -->
                                                                                        </section>
                                                                                    </form> </a>
                                                                            </div>
                                                                        </div>

                                                                    </c:forEach>
                                                                </div><!-- end row -->
                                                            </div><!-- end container -->
                                                        </div><!-- end section -->


                                                        <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

                                                        <!-- ALL JS FILES -->
                                                        <script src="js/all.js"></script>
                                                        <!-- ALL PLUGINS -->
                                                        <script src="js/custom.js"></script>
                                                        <script src="js/portfolio.js"></script>
                                                        <script src="js/hoverdir.js"></script>    

                                                    </body>
                                                    </html>
