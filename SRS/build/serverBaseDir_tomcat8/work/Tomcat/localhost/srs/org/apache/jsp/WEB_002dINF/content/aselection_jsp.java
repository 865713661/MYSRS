/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-03 18:04:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aselection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>  \r\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/static/h-ui.admin/css/style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<title>用户管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table class=\"table table-bordered table-hover\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<th  bgcolor=\"#E0FFFF\">编号</th>\r\n");
      out.write("\t\t\t\t<th bgcolor=\"#E0FFFF\">名字</th>\r\n");
      out.write("\t\t\t\t<th  bgcolor=\"#E0FFFF\">职位</th>\r\n");
      out.write("\t\t\t\t<th  bgcolor=\"#E0FFFF\">分科</th>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody id=\"allProfessor\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/static/h-ui/js/H-ui.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/lib/My97DatePicker/4.8/WdatePicker.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/lib/datatables/1.10.0/jquery.dataTables.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/mystyle/lib/laypage/1.2/laypage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/personAction_findAllProfessor',\r\n");
      out.write("\t\ttype : 'POST',\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\tdata : {},\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t$(\"#allProfessor\").empty();\r\n");
      out.write("\t\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\t\tvar p = data[i];\r\n");
      out.write("\t\t\t\tvar ps =\"'\" + p.ssn + \"'\";\r\n");
      out.write("\t\t\t\tvar html = '<tr><td>'\r\n");
      out.write("\t\t\t\t\t+ p.ssn\r\n");
      out.write("\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t+ p.name\r\n");
      out.write("\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t+ p.title\r\n");
      out.write("\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t+ p.department\r\n");
      out.write("\t\t\t\t\t+ '</td><td><a href=\"addp\">添加</a>'\r\n");
      out.write("\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"delectProfessor('+ ps +')\">删除</a></td></tr>';\r\n");
      out.write("\t\t\t\t\t$(\"#allProfessor\").append(html);\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("})\r\n");
      out.write("//添加教师\r\n");
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
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('.table-sort').dataTable({\r\n");
      out.write("\t\t\"aaSorting\": [[ 1, \"desc\" ]],//默认第几个排序\r\n");
      out.write("\t\t\"bStateSave\": true,//状态保存\r\n");
      out.write("\t\t\"aoColumnDefs\": [\r\n");
      out.write("\t\t  //{\"bVisible\": false, \"aTargets\": [ 3 ]} //控制列的隐藏显示\r\n");
      out.write("\t\t  {\"orderable\":false,\"aTargets\":[0,8,9]}// 制定列不参与排序\r\n");
      out.write("\t\t]\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("/*用户-添加*/\r\n");
      out.write("function member_add(title,url,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("/*用户-查看*/\r\n");
      out.write("function member_show(title,url,id,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("/*用户-停用*/\r\n");
      out.write("function member_stop(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要停用吗？',function(index){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\turl: '',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a style=\"text-decoration:none\" onClick=\"member_start(this,id)\" href=\"javascript:;\" title=\"启用\"><i class=\"Hui-iconfont\">&#xe6e1;</i></a>');\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-defaunt radius\">已停用</span>');\r\n");
      out.write("\t\t\t\t$(obj).remove();\r\n");
      out.write("\t\t\t\tlayer.msg('已停用!',{icon: 5,time:1000});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*用户-启用*/\r\n");
      out.write("function member_start(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要启用吗？',function(index){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\turl: '',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a style=\"text-decoration:none\" onClick=\"member_stop(this,id)\" href=\"javascript:;\" title=\"停用\"><i class=\"Hui-iconfont\">&#xe631;</i></a>');\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-success radius\">已启用</span>');\r\n");
      out.write("\t\t\t\t$(obj).remove();\r\n");
      out.write("\t\t\t\tlayer.msg('已启用!',{icon: 6,time:1000});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
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
