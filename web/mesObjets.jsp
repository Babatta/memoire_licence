
<%-- 
    Document   : DefinirAbonne
    Created on : 1 sept. 2019, 12:23:05
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="fr">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="style_1.css">  
    <link rel="stylesheet" href="style.css">
    <!-- Bootstrap CSS -->
    <!-- Site CSS -->
    <link rel="stylesheet" href="style_1.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/custom.css">
    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Site Metas -->
    <title>memoire</title>  

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
                                      <li><a href="Controleur?action=ab&id=${idUser}" style="font-size: 150%"> <!--<figure><img src="img/compteUser.png" alt="image" style="max-height: 85px;max-width: 85px"><figcaption ></figcaption></figure>--> retour</a></li>
                                    </ul>&nbsp;&nbsp;&nbsp;&nbsp;

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

    <div id="about" class="section wb" style="background-image: url('images/bg.png');">

        <div class="container-fluid">

            <center>

                <div class="row text-center">

                    <div class="col-md-3 col-sm-6">
                        <div class="about-item">

                            <div class="about-icon">
                                <span class="icon"><img alt="lampe" src="images/on.png" style="height: 300px;width: 300px"/></span>
                            </div>
                            <br/><br/>
                            <div class="about-text">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="ObjetOn" name="action"/>
                                    <input type="hidden" value="${idUser}" name="id"/>
                                    <input type="submit" value="Objets Actifs" id="btn-mdf" >
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="about-item">
                            <div class="about-icon">
                                <span class="icon"><img alt="lampe" src="images/off.png" style="height: 300px;width: 300px"/></span>
                            </div><br/><br/>
                            <div class="about-text">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="ObjetOff" name="action"/>
                                    <input type="hidden" value="${idUser}" name="id"/>
                                    <input type="submit" value="Objets Non Actifs" id="btn-mdf" >
                                </form>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="about-item">
                            <div class="about-icon">
                                <span class="icon"><img alt="lampe" src="images/stat.jpg" style="height: 300px;width: 300px"/></span>
                            </div><br/><br/>
                            <div class="about-text">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="stat" name="action"/>
                                    <input type="hidden" value="${idUser}" name="id"/>
                                    <input type="submit" value="Statistiques" id="btn-mdf" >
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="about-item">
                            <div class="about-icon">
                                <span class="icon"><img alt="lampe" src="images/cam.jpg" style="height: 300px;width: 300px"/></span>
                            </div><br/><br/>
                            <div class="about-text">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="stat" name="action"/>
                                    <input type="hidden" value="${idUser}" name="id"/>
                                    <input type="submit" value="Caméra" id="btn-mdf" >
                                </form>
                            </div>
                        </div>
                    </div>
            </center>
        </div>
    </div><!-- end container -->
</div><!-- end section -->

</div><!-- end row -->




<footer class="footer">
    <div class="container">
        <div class="row">


            <div class="col-md-4 col-sm-4 col-xs-12">
                <div class="widget clearfix">

                </div><!-- end clearfix -->
            </div><!-- end col -->


        </div><!-- end row -->
    </div><!-- end container -->
</footer><!-- end footer -->



<a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

<!-- ALL JS FILES -->
<script src="js/all.js"></script>
<!-- ALL PLUGINS -->
<script src="js/custom.js"></script>
<script src="js/portfolio.js"></script>
<script src="js/hoverdir.js"></script>    

</body>
</html>