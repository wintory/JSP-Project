package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;

public final class EditAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Belle Vetements</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/agency.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\" class=\"index\">\n");

   Account a  = new Account();


      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header page-scroll\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a href=\"index.jsp\" style=\"font-size: 30px;\">Belle Vetements</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Login.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Shopping.jsp\">Shopping</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li name=\"email\">\n");
      out.write("                        <p style=\"color: red;font-size: 20px\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ></p><li>\n");
      out.write("                    <li name=\"cart_icon\">\n");
      out.write("                        <a href=\"Cart.jsp\"><img src=\"images/cart.png\"  width=\"50px\"/></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    <header>\n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"intro-text\">\n");
      out.write("                <div class=\"col-md-12 column\" style=\"margin-top:10px;\">\n");
      out.write("                    <h1>\n");
      out.write("                        Register\n");
      out.write("                    </h1><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"intro-lead-in\">\n");
      out.write("                \n");
      out.write("                    <div class=\"col-md-6\" >\n");
      out.write("                    <div class=\"form-title\">first name</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"firstname\" type=\"text\" name=\"firstname\" value=\"");
      out.print(request.getAttribute("customerId"));
      out.write("\" required />\n");
      out.write("                </div>       \n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">last name</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"lastname\" type=\"text\" name=\"lastname\" required />\n");
      out.write("                </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">password</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"password\" type=\"text\" name=\"password\" required />\n");
      out.write("                </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">re-password</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"re-password\" type=\"text\" name=\"re-password\" required />\n");
      out.write("                </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">email</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"email\" type=\"text\" name=\"email\" required />\n");
      out.write("                </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">address</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"address\" type=\"text\" name=\"address\" required />\n");
      out.write("                </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">phone</div>\n");
      out.write("                    <input style=\"background-color: black\" id=\"phone\" type=\"text\" name=phone\" required />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("                 <div> \n");
      out.write("                   <table><tr><br><br><br><br><br><tr>\n");
      out.write("                       <tr><br><br><br><br><br><tr><tr><br><br><br><br><br><tr></tr></table>\n");
      out.write("               </div>\n");
      out.write("             <div class=\"col-md-6\" style=\"margin-left: 25%;height: 200px;margin-top: 100px\">\n");
      out.write("                 <button type=\"submit\" class=\"btn btn-warning\" style=\"font-size: 35px\">Confirm Edit</button>\n");
      out.write("           \n");
      out.write("                  <h1 style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("              \n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <section id=\"contact\">\n");
      out.write("       <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                <h2 class=\"section-heading\">Contact us!</h2>\n");
      out.write("                <hr class=\"primary\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-lg-offset-2 text-center\">\n");
      out.write("                <i class=\"fa fa-phone fa-3x wow bounceIn\"></i>\n");
      out.write("                <p>02-123-4567</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center\">\n");
      out.write("                <i class=\"fa fa-envelope-o fa-3x wow bounceIn\" data-wow-delay=\".1s\"></i>\n");
      out.write("                <p><a href=\"mailto:your-email@your-domain.com\">BelleVetements_Shop@gmail.com</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"js/classie.js\"></script>\n");
      out.write("    <script src=\"js/cbpAnimatedHeader.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Contact Form JavaScript -->\n");
      out.write("    <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("    <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"js/agency.js\"></script>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
