<%-- 
    Document   : index
    Created on : 13 พ.ย. 2558, 15:18:57
    Author     : willy
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Belle Vetements</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/agency.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" class="index">
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="index.jsp" style="font-size: 30px;">Belle Vetements</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="Register.jsp">Register</a>
                    </li>
                    <li>
                        <a href="Shopping.jsp">Shopping</a>
                    </li>
                    <li>
                         <a href="AccountDetail.jsp">Profile</a>
                    </li>
                    <li>
                        <a href="Cart.jsp"><img src="images/cart.png"  width="50px"/></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

 
    <header>
      
         <div class="container">
            <div class="intro-text">
                <div class="col-md-12 column" style="margin-top:10px;">
                    <h1>
                        Login
                    </h1><br><br>
                </div>
                <form action="Login" method="post">
                <div class="intro-lead-in">
                
                    <div class="col-md-6" >
                    <div class="form-title">email</div>
                    <input style="background-color: black" class="form-field" id="email" type="text" name="email" required />
                </div>       
                     <div class="col-md-6">
                    <div class="form-title">password</div>
                    <input style="background-color: black" class="form-field" id="password" type="text" name="password" required />
                </div>
                 
               </div>
                <div> 
                   <table><tr><br><br><br><br><br></tr>
                      <tr><br><br><br><br><br><tr></tr></table>
               </div>
              <div class="col-md-6" style="margin-left: 25%;height: 200px;margin-top: 100px">
                 <input type="submit" class="btn btn-warning" style="font-size: 35px" value="Login"/>
           
                  <h1 style="color:red;">${message}</h1>
              
                </div>
                </form>
            </div>
               
    </header>

   
   <section id="contact">
       <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <h2 class="section-heading">Contact us!</h2>
                <hr class="primary">

            </div>
            <div class="col-lg-4 col-lg-offset-2 text-center">
                <i class="fa fa-phone fa-3x wow bounceIn"></i>
                <p>02-123-4567</p>
            </div>
            <div class="col-lg-4 text-center">
                <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay=".1s"></i>
                <p><a href="mailto:your-email@your-domain.com">BelleVetements_Shop@gmail.com</a></p>
            </div>
        </div>
    </div>
</section>
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="js/classie.js"></script>
    <script src="js/cbpAnimatedHeader.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <!--<script src="js/contact_me.js"></script>-->

    <!-- Custom Theme JavaScript -->
    <script src="js/agency.js"></script>
 
</body>

</html>

