/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-12-29 07:15:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/css/login-page-style.css", Long.valueOf(1640728003442L));
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Login</title>\n");
      out.write("<link\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\"\n");
      out.write("\tintegrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("     ");
      out.write("@charset \"UTF-8\";\n");
      out.write("*{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".google-btn{\n");
      out.write("\tbackground-color: #3b5998;\n");
      out.write("\twidth: 350px;\n");
      out.write("\theight: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".facebook-btn{\n");
      out.write("\tbackground-color: #dd4b39;\n");
      out.write("\twidth: 350px;\n");
      out.write("\theight: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-btn{\n");
      out.write("\twidth: 350px; height: 50px\n");
      out.write("}");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<section class=\"vh-100\" style=\"background-color: #508bfc;\">\n");
      out.write("  <div class=\"container py-5 h-100\">\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("      <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\n");
      out.write("        <div class=\"card shadow-2-strong\" style=\"border-radius: 1rem;\">\n");
      out.write("          <div class=\"card-body p-5 text-center\">\n");
      out.write("\t\t\t<form action=\"/login\" method=\"post\">\n");
      out.write("            <h3 class=\"mb-5\">Sign in</h3>\n");
      out.write("\n");
      out.write("            <div class=\"form-outline mb-4\">\n");
      out.write("              <input type=\"email\" name=\"email\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" placeholder=\"Email\"/>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-outline mb-4\">\n");
      out.write("              <input type=\"password\" name=\"password\" id=\"typePasswordX-2\" class=\"form-control form-control-lg\" placeholder=\"Password\"/>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-check d-flex justify-content-start mb-4\">\n");
      out.write("              <input\n");
      out.write("                class=\"form-check-input\"\n");
      out.write("                type=\"checkbox\"\n");
      out.write("                name=\"checkbox\"\n");
      out.write("                value=\"\"\n");
      out.write("                id=\"form1Example3\"\n");
      out.write("              />\n");
      out.write("              <label class=\"form-check-label ms-2\" for=\"form1Example3\"> Remember password </label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"btn btn-primary btn-lg btn-block login-btn\" type=\"submit\">Login</button>\n");
      out.write("\n");
      out.write("            <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("            <button class=\"btn btn-lg btn-block btn-primary mb-2 facebook-btn\" type=\"submit\"><i class=\"fab fa-google me-2\"></i> Sign in with google</button>\n");
      out.write("            <button class=\"btn btn-lg btn-block btn-primary google-btn\" type=\"submit\"><i class=\"fab fa-facebook-f me-2\"></i>Sign in with facebook</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\"\n");
      out.write("\t\tcrossorigin=\"anonymous\" type=\"text/javascript\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\"\n");
      out.write("\t\tcrossorigin=\"anonymous\" type=\"text/javascript\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
