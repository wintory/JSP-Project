<%-- 
    Document   : index
    Created on : 13 พ.ย. 2558, 15:18:57
    Author     : willy
--%>

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
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Services</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#portfolio">Products</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#about">About Products</a>
                    </li>
                    <li>
                        <a href="Login.jsp">Login</a>
                    </li>
                    <li>
                        <a href="Register.jsp">Register</a>
                    </li>
                    <li>
                        <a href="Shopping.jsp">Shopping</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="intro-text">
                <div class="intro-lead-in">Welcome to Belle Vetements Shop</div>
             
            <a href="Shopping.jsp"> <h1 style="color:red"> Enter Site</h1></a>
            </div>
            
        </div>
    </header>

    <!-- Services Section -->
    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Services</h2>
                </div>
            </div>
            <div class="row text-center">
                <div class="col-md-4">
                    <span class="fa-stack fa-4x">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-paint-brush "></i>
                    </span>
                    <h4 class="service-heading">การส่งสินค้า</h4>
                    <p class="text-muted">Belle Vetements Delivery บริการส่งเสื้อคุณภาพถึงบ้านคุณ</p>
                </div>
                <div class="col-md-4">
                    <span class="fa-stack fa-4x">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-laptop fa-stack-1x fa-inverse"></i>
                    </span>
                    <h4 class="service-heading">คุณภาพสินค้า</h4>
                    <p class="text-muted">เสื้อของBelle Vetements Delivery มีคุณภาพระดับพรีเมี่ยม เปลี่ยนประสบการณ์เสื้อทุกตัวที่คุณเคยสัมผัส ต้องลอง..ถึงเข้าใจ </p>
                    <a href="#page-top" class="page-scroll btn btn-xl">go top site</a>
                </div>
                <div class="col-md-4">
                    <span class="fa-stack fa-4x">
                        <i class="fa fa-circle fa-stack-2x text-primary"></i>
                        <i class="fa fa-lock fa-stack-1x fa-inverse"></i>
                    </span>
                    <h4 class="service-heading">ชำระเงินปลอดภัยสะดวกทันใจ</h4>
                    <p class="text-muted">Belle Vetements Delivery ให้ท่านสาารถชำระเงินได้สะดวกรวดเร็ว</p>
                </div>
            </div>
        
     
        </div>
    </section>

    <!-- Portfolio Grid Section -->
    <section id="portfolio" class="bg-light-Gold">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">PRODUCT</h2>
                    <h3 class="section-subheading text-muted">ชมสินค้าของเราที่นี่</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="v.jpg" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>VEST</h4>
                        <p class="text-muted">VEST Design</p>
                    </div>
                </div>

                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal2" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="v2.jpg" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>T-Shirt</h4>
                        <p class="text-muted">T-Shirt Design</p>
                         <a href="#page-top" class="page-scroll btn btn-xl">go top site</a>
                    </div>
                    
                </div>

                <div class="row">
                <div class="col-md-4 col-sm-6 portfolio-item">
                    <a href="#portfolioModal1" class="portfolio-link" data-toggle="modal">
                        <div class="portfolio-hover">
                            <div class="portfolio-hover-content">
                                <i class="fa fa-plus fa-3x"></i>
                            </div>
                        </div>
                        <img src="v3.jpg" class="img-responsive" alt="">
                    </a>
                    <div class="portfolio-caption">
                        <h4>SLEEVED SHIRT</h4>
                        <p class="text-muted">SLEEVED SHIRT Design</p>
                    </div>
                </div>
                 
    </section>

    <!-- About Section -->
    <section id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">About</h2>
                    <h3 class="section-subheading text-muted">Type of fabric</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <ul class="timeline">
                        <li>
                            <div class="timeline-image">
                                <img class="img-circle img-responsive" src="e1.jpg" alt="">
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    <h4>HIGH GRADE COTTON/ CVC</h4>
                                    
                                </div>
                                <div class="timeline-body">
                                    <p class="text-muted">The fabric is a blend of 80 % COTTON to make the fabric when it is produced . Wear a good level . The fabric is both soft style like no other fabric . Good ventilation Mop sweat And highly flexible Most of the companies producing clothing brand at the world level . I often use this kind of fabric . HI-END market to support it.</p>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted">
                            <div class="timeline-image">
                                <img class="img-circle img-responsive" src="e2.jpg" alt="">
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    <h4>DRY-TECH</h4>
                                    
                                </div>
                                <div class="timeline-body">
                                    <p class="text-muted">Ingredients include COTTON AND SPANDEX by the fabric, has two faces. Weaving through a resolution in the form of MICRO FIBER to wear very comfortable cool breathable fabric as compared to other species. Due to wipe the sweat almost immediately. The fabric is soft and silky feel of luxury. Innovative fabrics, semi-sporty. It is popular with customers who want the shirts are fine. And use in all weather conditions</p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <div class="timeline-image">
                                <img class="img-circle img-responsive" src="e3.jpg" alt="">
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    
                                    <h4 class="subheading">MICRO FIBER</h4>
                                </div>
                                <div class="timeline-body">
                                    <p class="text-muted">The fabric is a primary ingredient . POLYESTER through a woven pattern woven by MICRO FIBER strength . And better ventilation than a common market , such as TK TK-LINK fabrics are lighter , more comfortable wear . Popular orders for customers who want an affordable and quality polo shirt is different from the general fabric .</p>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted">
                            <div class="timeline-image">
                                <img class="img-circle img-responsive" src="e4.jpg" alt="">
                            </div>
                            <div class="timeline-panel">
                                <div class="timeline-heading">
                                    
                                    <h4 class="subheading">UNI-SOFT</h4>
                                </div>
                                <div class="timeline-body">
                                    <p class="text-muted">The fabric has the perfect combination between COTTON and POLYESTER through a woven MICRO FIBER make sense level. The fabric is soft , light and comfortable to wear because the fabric is woven through the details . This makes the fabric breathable very good . It is stronger than many other fabrics . Easy care wool works hard for every customer 's action is the most popular fabrics that do well.</p>
                                </div>
                            </div>
                        </li>
                        <li class="timeline-inverted">
                            <div class="timeline-image">
                                <br>
                                <h4> <a href="#page-top" style="color: white;">go top site</a></h4>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
    <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                       
                            <h2>Vest</h2>
                           
                            <img class="img-responsive img-centered" src="v.jpg" alt="">
                            <ul class="list-inline">
                                <li>Price : 259 Baht</li>
                            </ul>
                            <a href="Shopping.jsp"><button type="button" class="btn btn-primary" >Go Shopping</button></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
        <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-content">
            <div class="close-modal" data-dismiss="modal">
                <div class="lr">
                    <div class="rl">
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <div class="modal-body">
                       
                            <h2>T-Shirt</h2>
                           
                            <img class="img-responsive img-centered" src="v2.jpg" alt="">
                            <ul class="list-inline">
                                <li>Price : 399 Baht</li>
                            </ul>
                              <a href="Shopping.jsp"><button type="button" class="btn btn-primary" >Go Shopping</button></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
 
 

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
    <script src="js/contact_me.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/agency.js"></script>
 
</body>

</html>

