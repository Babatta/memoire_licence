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

    </head>
    <body>
        <%@include file="menuAdmin.jsp" %>

        <div class="container-login100" style="background-image: url('images/lampe.png');">
            <div class="wrap-login100 p-l-100 p-r-100 p-t-200 p-b-30" style="background-image: url('images/bg.png'); background-color: #faf9f8; width: 1000px;"> 

                <form class="login100-form validate-form" method="POST" action="Controleur" style="font-size:20px;">
                    <input type="hidden" name="action" value="ajouterUser"/>

                    <span class="login100-form-title p-b-37" id="cal">
                        Formulaire d'ajout d'un utilisateur
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
                    <div class="form-row">
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Login:</a></h5></label>
                            <input type="text" class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" placeholder="Login" name="login"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Mot de Passe:</a></h5></label>
                            <input type="text" class="form-control" style="font-size:20px;"   id="inputAddress2" type="text" placeholder="Password" name="passe"  required>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Prenom:</a></h5></label>
                            <input type="text" class="form-control"  style="font-size:20px;"  id="inputAddress2" type="text" placeholder="Prenom" name="prenom"  required>
                        </div>
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a style="font-size:20px;" >Nom:</a></h5></label>
                            <input type="text" class="form-control"  style="font-size:20px;"  id="inputAddress2" type="text" placeholder="nom" name="nom"  required>
                        </div></div>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="inputAddress2"><h5><a  style="font-size:20px;" >Email:</a></h5></label>
                            <input type="text" class="form-control"  style="font-size:20px;"  id="inputAddress2" type="email" name="email"  placeholder="email"  required>
                        </div>

                        <div class="form-group">
                            <label for="inputCity"><h5><a  style="font-size:20px;" >Adresse:</a></h5></label>
                            <input type="text" class="form-control"  style="font-size:20px;"  id="inputCity" type="text" name="adresse"  placeholder="adresse"  required>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="form-group">
                            <label for="inputState"><h5><a  style="font-size:20px;" >Operateur Telephonique: </a></h5></label>
                            <select id="inputState"   style="font-size:20px;max-width: 350px; height: 33px;"  class="form-control" name="tel1">

                                <option value="76">76 </option>
                                <option value="77">77 </option>
                                <option value="76">78 </option>
                                <option value="70">70 </option>
                                <option value="33">33 </option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="inputZip"><h5><a  style="font-size:20px; " >Numero Telephone</a></h5></label>
                            <input type="int" class="form-control" style="font-size:20px;" id="inputZip" name="tel2" placeholder="numero" onkeypress='return event.charCode >= 48 && event.charCode <= 57' required>
                        </div>
                    </div>  <div class="form-row">
                        <div class="form-group"  style="font-size:20px;">
                            <label for="inputState"><h5><a style="font-size:20px;"> Profil:</a></h5></label>
                            <select id="inputState"  style="font-size:20px; height: 35px; " class="form-control" name="profil">
                                <option value="administrateur" >administrateur </option>
                                <option value="abonne">abonne </option>
                            </select>
                        </div> </div> 
                    <br>
                    <div class="container-login100-form-btn">
                        <input type="submit"   value="Valider" class="login100-form-btn" style="max-width: 50px;font-size:20px;"/><br/><br/>
                    </div>
                </form> </div>

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

