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
        <link rel="stylesheet" href="css/main.css">
        <!-- Modernizer for Portfolio -->
        <script src="js/modernizer.js"></script>

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
            var float energie=${passe};
        document.addEventListener('DOMContentLoaded', function () {
                    var myChart = Highcharts.chart('container1', {
                    chart: {
                    type: 'column'
        }, title: {
                            text: 'Diagramme en Barres'
        },
        xAxis: {
                            categories: ['Ventilateur', 'Caméra surveillance', 'Lampe']
        },
        yAxis: {
                            title: {
        text: ''
        }
        },
        series: [{
                                    name: 'Luminosité',
                                    data: [5, 20, 87]
        }, {
                                    name: 'Température', data: [55, 77, 63]
        }, {
                                    name: 'Energie consommée', data: [91, 148, 53]
}] }); });         var chart1; // globally available
        document.addEventListener('DOMContentLoaded', function() {
                                        chart1 = Highcharts.stockChart('container1', {
                                    rangeSelector: {
        selected: 1
        },
        series: [{                                 name: 'USD to EUR',
data: usdtoeur // predefined JavaScript array
        }]
        });       });
        </script> 
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
    
<li><a href="Controleur?action=objet&id=${idUser}" style="font-size: 150%">retour</a></li> 
</ul>
</div>
</div>
</nav>
</ul>
</header> 

<div id="container1" style="width:100%; height:450px;"></div><br/><br/>
<table>
    <tr>
        <td><div id="container5" style="width:100%; height:350px;"></div></td>
    </tr>
</table>

<footer class="footer">
    <div class="container">
</footer>
</body>
</html>
