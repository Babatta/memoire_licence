<%-- 
    Document   : ajouAbonne
    Created on : 31 août 2019, 02:51:59
    Author     : LENOVO
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <a class="navbar-brand" href="#"><img src="images/logos/logo.png" alt="image"></a>
                    </div>

                    <div id="navbar" class="navbar-collapse collapse">
                        <table align="right">
                            <tr>
                                <td>
                                    <ul class="nav navbar-nav navbar-right">
                                        <li><a  href="Controleur?action=connexion1" style="font-size: 150%">Connexion</a></li>

                                        <li><a href="Controleur?action=bienvenu" style="font-size: 150%"> <!--<figure><img src="img/compteUser.png" alt="image" style="max-height: 85px;max-width: 85px"><figcaption ></figcaption></figure>--> retour</a></li>
                                    </ul>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </nav>
        </header>


        <div class="container-login100" style="background-image: url('images/lampe.png');">
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
            <div classe="container">         
              <form class="login100-form validate-form" action="Controleur" method="POST" style='align-content: center; width: 50;'>
                                <input type="hidden" name="action" value="demandeAbonnement"/>
                                <span class="login100-form-title p-b-37" id="cal">
                                    Demande abonnement
                                </span><br/>
 
   <div class="form-group">
    <label for="inputAddress2"><h5><a>Prenom</a></h5></label>
    <input type="text" class="form-control" id="inputAddress2" type="text" placeholder="Prenom" name="prenom"  required>
  </div>
  <div class="form-group">
    <label for="inputAddress2"><h5><a>Nom</a></h5></label>
    <input type="text" class="form-control" id="inputAddress2" type="text" placeholder="nom" name="nom"  required>
  </div>
              <div class="form-group">
    <label for="inputAddress2"><h5><a>Email</a></h5></label>
    <input type="email" class="form-control" id="inputAddress2" type="email" name="email"  placeholder="email"  required>
  </div>
        <div class="form-row">      
     <div class="form-group col-md-6">
      <label for="inputCity"><h5><a>Adresse</a></h5></label>
      <input type="text" class="form-control" id="inputCity" type="text" name="adresse"  placeholder="adresse"  required>
    </div>
        </div> 
  <div class="form-row">

      <div class="form-group col-md-4">
      <label for="inputState"><h5><a>Operateur Telephonique</a></h5></label>
      <select id="inputState" class="form-control" name="tel1">
        
                                        <option value="76">76 </option>
                                        <option value="77">77 </option>
                                        <option value="76">78 </option>
                                        <option value="70">70 </option>
                                        <option value="33">33 </option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip"><h5><a>Numero Telephone</a></h5></label>
      <input type="int" class="form-control" id="inputZip" name="tel2" placeholder="numero" onkeypress='return event.charCode >= 48 && event.charCode <= 57' maxlength="7"  required>
    </div>
  </div>
                    <br><br>
  <div class="container-login100-form-btn">
                        <input type="submit" value="Enregistrer" class="login100-form-btn" style="max-width: 50px"/><br/><br/>
                    </div>
              </form></div>
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






<!--
<form class="login100-form validate-form" action="Controleur" method="POST">
                                <input type="hidden" name="action" value="demandeAbonnement"/>
                                <span class="login100-form-title p-b-37" id="cal">
                                    Demande abonnement
                                </span><br/>

                                <div class="wrap-input100 validate-input m-b-25" data-validate = "Entrer votre Prénom ">
                                    <input class="input100" type="text" name="prenom" placeholder="prenom" required>
                                    <span class="focus-input100"></span>
                                </div>

                                <div class="wrap-input100 validate-input m-b-25" data-validate = "Entrer votre Nom ">
                                    <input class="input100" type="text" name="nom" placeholder="nom" required>
                                    <span class="focus-input100"></span>
                                </div>

                                <div class="wrap-input100 validate-input m-b-25" data-validate = "Entrer votre Email ">
                                    <input class="input100" type="email" name="email" placeholder="email" required>
                                    <span class="focus-input100"></span>
                                </div>


                                <div class="wrap-input100 validate-input m-b-25" data-validate = "Entrer votre Adresse ">
                                    <input class="input100" type="text" name="adresse" placeholder="adresse" required>
                                    <span class="focus-input100"></span>
                                </div>

                                <table align="center">
                                    <tr>
                                        <td>&nbsp;
                                            <div class="form-group">
                                                <select class="form-control" type="text" name="tel1" id="titre" style="font-size: 16px" required> 
                                                    <option value="" >Opérateur téléphonique</option>
                                                    <option value="76">76 </option>
                                                    <option value="77">77 </option>
                                                    <option value="76">78 </option>
                                                    <option value="70">70 </option>
                                                    <option value="33">33 </option>
                                                </select>
                                            </div><br/>
                                        </td>
                                        <td>&nbsp</td>
                                        <td>
                                            <div class="wrap-input100 validate-input m-b-25" data-validate = "Entrer votre Numéro de Téléphone ">
                                                <input class="input100" type="text" name="tel2" placeholder="numero" onkeypress='return event.charCode >= 48 && event.charCode <= 57' maxlength="7" required>
                                                <span class="focus-input100"></span>
                                            </div>
                                        </td>
                                    </tr>

                                </table>
                                <div class="container-login100-form-btn">
                                    <input type="submit" value="Valider" class="login100-form-btn" style="max-width: 50px"/><br/><br/>
                                </div>
                        </div>
                        </form>
        -->