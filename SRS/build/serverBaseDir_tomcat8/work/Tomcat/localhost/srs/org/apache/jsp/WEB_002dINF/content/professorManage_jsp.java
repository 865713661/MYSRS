/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-03 15:28:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class professorManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>  \r\n");
      out.write("<title>addSection</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//查询所有教师\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/personAction_findAllProfessor',\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#allProfessor\").empty();\r\n");
      out.write("\t\t\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\t\t\tvar p = data[i];\r\n");
      out.write("\t\t\t\t\tvar ps =\"'\" + p.ssn + \"'\";\r\n");
      out.write("\t\t\t\t\tvar html = '<tr><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.ssn\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.name\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.title\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.department\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"updateProfessor('+ ps +')\">updateProfessor</a>'\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"delectProfessor('+ ps +')\">delect</a></td></tr>';\r\n");
      out.write("\t\t\t\t\t\t$(\"#allProfessor\").append(html);\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\t//添加教师\r\n");
      out.write("\tfunction addProfessor(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/personAction_addProfessor',\r\n");
      out.write("\t\t\ttype:'POST',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdata:{ssn:$(\"#ssn\").val(),name:$(\"#name\").val(),title:$(\"#title\").val(),department:$(\"#department\").val()},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\r\n");
      out.write("\t\t\t\t\talert(\"添加成功！\");\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t//删除教师\r\n");
      out.write("\tfunction delectProfessor(val){   \r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/personAction_deleteProfessor',\r\n");
      out.write("\t\t\ttype:'POST',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdata:{ssn:val},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\r\n");
      out.write("\t\t\t\t\talert(\"删除成功！\");\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}) \r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group col-md-4\">\r\n");
      out.write("\t\t\t\t<h1>Add Section</h1>\r\n");
      out.write("\t\t\t\t<label>ssn:</label> \r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"ssn\" />\r\n");
      out.write("\t\t\t\t<label>name:</label> \r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"name\" /> \r\n");
      out.write("\t\t\t\t<label>title:</label>\r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"title\" />\r\n");
      out.write("\t\t\t\t<label>department:</label>\r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"department\" /><br />\r\n");
      out.write("\t\t\t\t<button onclick=\"addProfessor()\" class=\"btn btn-default btn-lg btn-block\">add</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h2>All Professor</h2>\r\n");
      out.write("\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>ssn</td>\r\n");
      out.write("\t\t\t\t\t<td>name</td>\r\n");
      out.write("\t\t\t\t\t<td>title</td>\r\n");
      out.write("\t\t\t\t\t<td>department</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"allProfessor\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
