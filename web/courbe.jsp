<%-- 
    Document   : statistiques
    Created on : 31 oct. 2019, 20:59:12
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html lang="fr">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>memoire</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Sign Up Form by Colorlib</title>
        <!-- Bootstrap CSS -->
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
        <script src="https://code.highcharts.com/highcharts.js"></script>
        <script src="https://code.highcharts.com/modules/series-label.js"></script>
        <script src="https://code.highcharts.com/modules/exporting.js"></script>
        <script src="https://code.highcharts.com/modules/export-data.js"></script>

        <script src="js/modernizer.js"></script>
        <script src="js/highcharts.js"></script>
        <script src="js/highstock.js"></script>
        <script src="js/modules/stock.js"></script>
        <script src="js/modules/map.js"></script>
        <script src="js/highmaps.js"></script>
        <script lang="JavaScript">

        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

        <script lang="JavaScript">
            document.addEventListener('DOMContentLoaded', function () {
                    var myChart = Highcharts.chart('container2', {
                    chart: {
                    type: 'spline'
        }, title: {
                            text: 'Représentation graphique des données issues des capteurs'
        },
                    xAxis: {
                            categories: ['Ventilateur', 'Caméra surveillance', 'Lampe']
        }, yAxis: {
                            title: {
                            text: ''
        }
            }, series: [{
                                    name: 'Luminosité',
                                    data: [5, 20, 87] }, {
                                    name: 'Température', data: [55, 77, 63]         }, {
            name: 'Energie consommée', data: [91, 148, 53]         }]
        });
            });         var chart1; // globally available
        document.addEventListener('DOMContentLoaded', function() {
                                        chart1 = Highcharts.stockChart('container2', {                                         rangeSelector: {
                                    selected: 1
        },       series: [{
                                            name: 'USD to EUR',
            data: usdtoeur // predefined JavaScript array
        }]
        });  
        });   </script> 

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
                    <ul class="nav  navbar-right">

                        <a href="accueilAbonne.jsp"> <figure><img src="img/shutdown.png" alt="image" style="max-height: 50px;max-width: 50px"><figcaption style="font-size: 16px;font-family: Arial Black;color:#000">Retour</figcaption></figure></a>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
        <br/>    
<div id="container2" style="width:100%; height:450px;"></div>
            <footer class="footer">
                <div class="container">
            </footer>
        </body>

    </html>
