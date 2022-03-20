<%-- 
    Document   : bienvenu
    Created on : 29 août 2019, 16:32:29
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    <!-- LOADER -->
    <div id="preloader">
        <div class="loader">
            <div class="loader__bar"></div>
            <div class="loader__bar"></div>
            <div class="loader__bar"></div>
            <div class="loader__bar"></div>
            <div class="loader__bar"></div>
            <div class="loader__ball"></div>
        </div>
    </div><!-- end loader -->
    <!-- END LOADER -->

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
                    <a class="navbar-brand" href="Controleur?action=bienvenu"><img src="images/logos/logo.png" alt="image"></a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a  href="Controleur?action=connexion1" style="font-size: 140%">Deconnexion</a></li>
                    </ul>
                </div>
            </div>
        <br/>
        <ul class="nav nav-tabs">
            <li class="active"><a href="accueilAdmin.jsp" id="menu">Accueil</a></li>
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



        <div class="slider-area">
            <div class="slider-wrapper owl-carousel">
                <div class="slider-item home-one-slider-otem slider-item-four slider-bg-one">
                    <div class="container">
                        <div class="row">
                            <div class="slider-content-area">
                                <div class="slide-text">
                                    <h1 class="homepage-three-title">Bienvenue sur votre Plateforme de<span> gestion centralisée </span>d'objets connectés</h1>
                                    <h2>La solution idéale pour assurer <br>votre confort et garantir la sécurité de vos objets. </h2>
                                    <div class="slider-content-btn">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="slider-item text-center home-one-slider-otem slider-item-four slider-bg-two">
                    <div class="container">
                        <div class="row">
                            <div class="slider-content-area">
                                <div class="slide-text">
                                    <h1 class="homepage-three-title">Bienvenue sur votre Plateforme de<span> gestion centralisée </span>d'objets connectés</h1>
                                    <h2>La solution idéale pour assurer <br>votre confort et garantir la sécurité de vos objets. </h2>
                                    <div class="slider-content-btn">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="slider-item home-one-slider-otem slider-item-four slider-bg-three">
                    <div class="container">
                        <div class="row">
                            <div class="slider-content-area">
                                <div class="slide-text">
                                    <h1 class="homepage-three-title">Bienvenue sur votre Plateforme de<span> gestion centralisée </span>d'objets connectés</h1>
                                    <h2>La solution idéale pour assurer <br>votre confort et garantir la sécurité de vos objets. </h2>
                                    <div class="slider-content-btn">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div></div>
<div id="about" class="section wb">
                    <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="message-box">
                        <h4></h4>
                        <h2>Bienvenue sur notre Plateforme de gestion centralisée de parc parc d'objet.</h2>
                        <p class="lead">Quisque eget nisl id nulla sagittis auctor quis id. Aliquam quis vehicula enim, non aliquam risus. Sed a tellus quis mi rhoncus dignissim.</p>

                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed vitae rutrum neque. Ut id erat sit amet libero bibendum aliquam. Donec ac egestas libero, eu bibendum risus. Phasellus et congue justo. </p>

                        <a href="#services" class="btn btn-light btn-radius btn-brd grd1">En Savoir Plus</a>
                    </div><!-- end messagebox -->
                </div><!-- end col -->

                <div class="col-md-6">
                    <div class="post-media wow fadeIn">
                        <img src="uploads/auth.png" alt="" class="img-responsive img-rounded">
                        <a href="http://www.youtube.com/watch?v=nrJtHemSPW4" data-rel="prettyPhoto[gal]" class="playbutton"><i class="flaticon-play-button"></i></a>
                    </div><!-- end media -->
                </div><!-- end col -->
            </div><!-- end row -->

            <hr class="hr1"> 

            <div class="row">
				<div class="col-md-6">
                    <div class="post-media wow fadeIn">
                        <img src="uploads/dev.png" alt="" class="img-responsive img-rounded">
                    </div><!-- end media -->
                </div><!-- end col -->
				
                <div class="col-md-6">
                    <div class="message-box">
                        <h4>Qui sommes-nous?</h4>
                        <h2>Nous vous apportons une solution pour interagir avec vos objets connectés.</h2>
                        <p class="lead">Quisque eget nisl id nulla sagittis auctor quis id. Aliquam quis vehicula enim, non aliquam risus. Sed a tellus quis mi rhoncus dignissim.</p>

                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed vitae rutrum neque. Ut id erat sit amet libero bibendum aliquam. Donec ac egestas libero, eu bibendum risus. Phasellus et congue justo. </p>

                        <a href="#services" class="btn btn-light btn-radius btn-brd grd1">En Savoir Plus</a>
                    </div><!-- end messagebox -->
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </div><!-- end section -->
            
            
            
            
            
            
            

<footer class="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <img src="images/logos/logo-2.png" alt="" />
                        </div>
                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>
                        <p>Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>
                    </div><!-- end clearfix -->
                </div><!-- end col -->

				<div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="widget clearfix">
                        <div class="widget-title">
                            <h3>Pages</h3>
                        </div>

                        <ul class="footer-links hov">
                            <li><a href="#">Home <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">Blog <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">Pricing <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">About <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">Faq <span class="icon icon-arrow-right2"></span></a></li>
							<li><a href="#">Contact <span class="icon icon-arrow-right2"></span></a></li>
                        </ul><!-- end links -->
                    </div><!-- end clearfix -->
                </div><!-- end col -->
				
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <div class="footer-distributed widget clearfix">
                        <div class="widget-title">
                            <h3>Subscribe</h3>
							<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which one know this tricks.</p>
                        </div>
						
						<div class="footer-right">
							<form method="get" action="#">
								<input placeholder="Subscribe our newsletter.." name="search">
								<i class="fa fa-envelope-o"></i>
							</form>
						</div>                        
                    </div><!-- end clearfix -->
                </div><!-- end col -->
            </div><!-- end row -->
        </div><!-- end container -->
    </footer><!-- end footer -->

    <div class="copyrights">
        <div class="container">
            <div class="footer-distributed">
                <div class="footer-left">                   
                    <p class="footer-company-name">All Rights Reserved. &copy; 2018 <a href="#">GoodWEB</a> Design By : 
					<a href="https://html.design/">html design</a></p>
                </div>

                
            </div>
        </div><!-- end container -->
    </div><!-- end copyrights -->

    <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
    <script src="js/portfolio.js"></script>
    <script src="js/hoverdir.js"></script>    

</body>
</html>