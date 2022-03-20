
<%-- 
    Document   : DefinirAbonne
    Created on : 1 sept. 2019, 12:23:05
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

    </head>
    <body>
        <%@include file="menuAdmin.jsp" %>

        <div class="container-login100" style="background-image: url('images/lampe.png'); background-attachment: fixed;">
            <div class="wrap-login100 p-l-100 p-r-100 p-t-200 p-b-30" style="background-image: url('images/bg.png'); background-color: #faf9f8; width: 1000px;"> 
                <form class="login100-form validate-form" method="POST" action="Controleur">

                    <input type="hidden" name="action" value="enrStation"/> 
                    <span class="login100-form-title p-b-37" id="cal">
                        Ajouter une nouvelle Station:
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
                    </span> 
                    <div class="form-group">
                        <label for="inputAddress2"><h5><a style="font-size:20px;">Nom Station</a></h5></label>
                        <input class="form-control"  style="font-size:20px;" id="inputAddress2" type="text" name="nomStation"   placeholder="Nom Station"   required>
                    </div>

                    <div class="form-group">
                        <label for="inputAddress2"><h5><a style="font-size:20px;">Type Station</a></h5></label>
                        <input  class="form-control" type="text" name="typeStation"  id="inputAddress2"  placeholder="type station"   required>

                    </div>
                    <div class="form-group">
                        <label for="inputAddress2"><h5><a style="font-size:20px;">Connectivite</a></h5></label>
                        <input  class="form-control" style="font-size:20px;" type="text" id="inputAddress2" name="connectivite"   placeholder="connectivité"   required>

                    </div>
                    <div class="form-group">
                        <label for="inputAddress2"><h5><a style="font-size:20px;">Alerte</a></h5></label>
                        <input  class="form-control" type="text" style="font-size:20px;" id="inputAddress2" name="alerte"   placeholder="alerte"   required>

                    </div>
                    <div class="form-group">
                        <label for="inputAddress2"><h5><a style="font-size:20px;"> Choisir un Reseau</a></h5></label>
                        <select type="text" style="font-size:20px; height: 35px;" id="inputAddress2" class="form-control" name="idReseau" required >                                      
                            <c:forEach var="rs" items="${listeReseau}">
                                <option value="${rs.idReseau}" style="font-size:20px;"> ${rs.nomReseau}  </option>
                            </c:forEach>
                        </select>

                    </div>


                    <div class="form-group">
                        <input type="submit" value="Enregistrer" class="login100-form-btn" style="font-size:20px;max-width: 75px"/><br/><br/>
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
