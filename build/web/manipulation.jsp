<%-- 
    Document   : manipulation
    Created on : 30 nov. 2019, 21:29:32
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>memoire</title>

        <!-- Basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">   

        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- Site Metas -->
        <title></title>  
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
                                <a href="tel:1234567890"><i class="fa fa-phone" aria-hidden="true"></i> +221776235535</a>
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
                            <li><a href="Controleur?action=ab" style="font-size: 140%">Retour</a></li>
                        </ul>

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
                                <input type="hidden" value="rpc" name="action"/>
                                <input type="hidden" value="${passe}" name="passe"/>
                                <input type="hidden" value="${login}" name="login"/>
                                <li><input type="submit" value="Rapport de consommation" id="btn-mdf" ></li>
                            </form>
                        </ul>
                    </div>
                </div>
            </nav><br/>
            <ul class="nav nav-tabs">
                <li class="active"><a href="Controleur?action=bienvenu" id="menu">Accueil</a></li>
                <li><a href="Controleur?action=stat" id="menu">Visualiser les statistiques</a></li>
                <!-- <li class="dropdown">
                     <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="menu"> Mes objets <span class="caret"></span> </a>
                     <ul class="dropdown-menu" > 
                             <li > <a href="#" id="puce">${listeObjet}</a> </li>
                     </ul>
                 </li>-->
                <table align="right">
                    <tr><td><span class="login100-form-title p-b-37" style="color:#fd6802;font-size: 150%">${prenom}&nbsp;${nom}</span></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
                </table>
            </ul> 

        </header>
    </body>
</html>
