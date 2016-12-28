package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<header style=\"padding-bottom:30px;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row clearfix\">\n");
      out.write("            <form role=\"form\" action=\"SignUp\" method=\"post\">\n");
      out.write("                <div class=\"col-md-12 column\" style=\"margin-top:100px;\">\n");
      out.write("                    <h1>\n");
      out.write("                        Register\n");
      out.write("                    </h1><br><br>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1 style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">Student ID</div>\n");
      out.write("                    <input id=\"idd\" class=\"form-field\" type=\"number\" name=\"stdid\" required/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">Name</div>\n");
      out.write("                    <input id=\"firstname\" class=\"form-field\" type=\"text\" name=\"firstname\" required />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">Surname</div>\n");
      out.write("                    <input id=\"lastname\" class=\"form-field\" type=\"text\" name=\"lastname\" required/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-title\">Password</div>\n");
      out.write("                    <input id=\"password\" class=\"form-field\" type=\"password\" name=\"password\" required/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">Repeat Password</div>\n");
      out.write("                    <input id=\"conpassword\" class=\"form-field\" type=\"password\" name=\"conpassword\" required/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">Phone</div>\n");
      out.write("                    <input id=\"tel\" class=\"form-field\" type=\"phone\" name=\"tel\" required/><br />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-title\">Email</div>\n");
      out.write("                    <input id=\"email\" class=\"form-field\" type=\"email\" name=\"email\" required/><br/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-warning\">Sign Up</button>\n");
      out.write("                </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
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
