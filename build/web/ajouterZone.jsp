<%-- 
    Document   : ajouterZone
    Created on : 28 oct. 2019, 13:02:07
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

                <form class="login100-form validate-form" method="POST" action="Controleur">
                    <input type="hidden" name="action" value="enrZone"/>  
                    <span class="login100-form-title p-b-37" id="cal">
                        Formulaire d'ajout d'une zone
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
                    <div class="for-group">
                        <label for="inputAddress2"><h5><a>Nom Zone</a></h5></label>
                        <input  class="form-control" id="inputAddress2" type="text" name="nomZone"   placeholder="nom"   required>

                    </div> <br></br>
                    <div class="container-login100-form-btn">
                        <input type="submit" value="Enregistrer" class="login100-form-btn" style="max-width: 50px"/><br/><br/>
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
