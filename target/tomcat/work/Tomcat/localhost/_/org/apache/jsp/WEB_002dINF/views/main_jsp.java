/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-16 14:56:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/common/header.jspf", Long.valueOf(1494946609571L));
    _jspx_dependants.put("/WEB-INF/common/navigation.jspf", Long.valueOf(1494355235776L));
    _jspx_dependants.put("/WEB-INF/common/footer.jspf", Long.valueOf(1494354006031L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Car rental store</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <!-- Static navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"navbar-brand\">Car rental store</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"/\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"/about\">About</a></li>\r\n");
      out.write("                    <li><a href=\"/contact\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li><a href=\"../navbar-fixed-top/\">Log in</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("        </div><!--/.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div class=\"jumbotron\">\r\n");
      out.write("    <h1>Navbar example</h1>\r\n");
      out.write("    <p>This example is a quick exercise to illustrate how the default, static navbar and fixed to top navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</p>\r\n");
      out.write("    <p>\r\n");
      out.write("        <a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">View navbar docs &raquo;</a>\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-12\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"well\">\r\n");
      out.write("                    <h4 class=\"text-success\"><span class=\"label label-success pull-right\">{search_count_db}</span><a href=\"/search\">Go searching</a>\r\n");
      out.write("                    </h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"well\">\r\n");
      out.write("                    <h4 class=\"text-primary\"><span class=\"label label-primary pull-right\">{car_count_db}</span><a href=\"/display\">Show all available</a>\r\n");
      out.write("                    </h4>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!--/row-->\r\n");
      out.write("    </div><!--/col-12-->\r\n");
      out.write("</div><!--/row-->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"/resources/jquery-3.2.1.min.js\"/>\r\n");
      out.write("<script src=\"/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js\"/>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
