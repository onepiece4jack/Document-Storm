/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.12
 * Generated at: 2019-05-21 06:22:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style.css\">\n");
      out.write("\n");
      out.write("<title>Document Storm</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/ie10-viewport-bug-workaround.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/asserts/css/offcanvas.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("<!--[if lt IE 9]><script src=\"assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-fixed-top navbar-inverse\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\n");
      out.write("\t\t\t\t\taria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"docstorm/index\">Document Storm</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"docstorm/index\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"mailto:ipasser@sina.cn\">Contact</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.nav-collapse -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /.container -->\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- /.navbar -->\n");
      out.write("\n");
      out.write("\t<hr />\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t<p class=\"pull-right visible-xs\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-xs\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"offcanvas\">Toggle nav</button>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t\t\t<h1>Hello, world!</h1>\n");
      out.write("\t\t\t\t\t<p>This is a site to convert document format</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t\t\t<p class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"docstorm\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/docstorm.png\">\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t<div class=\"row trans-table\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>PDF to Word</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>PDF文档转换成Word文档，还可以选择生成word的字体.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/docstorm/dispatcher?opt=pdf2doc\" role=\"button\">文件上传\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>MD to PDF</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>将Markdown格式文档完美渲染为PDF.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/docstorm/dispatcher?opt=md2pdf\" role=\"button\">文件上传\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>MD to HTML</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>将Markdown格式文档完美渲染为HTML.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/docstorm/dispatcher?opt=md2html\" role=\"button\">文件上传\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Word Translate</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>将Word翻译为指定的语言，目前只支持Word文档英文转中文.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/docstorm/dispatcher?opt=word_translate\" role=\"button\">文件上传\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>HTML to PDF</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>将本地的HTML文件或者指定url的网页转成PDF文件.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/docstorm/dispatcher?opt=html2pdf\" role=\"button\">文件上传\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-6 col-lg-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Image to PDF</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>将图片格式的文件转为PDF文档.完全免费哦</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"/docstorm/dispatcher?opt=image2pdf\" role=\"button\">文件上传\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&raquo;</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!--/.sidebar-offcanvas-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"commit\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comment.content }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-muted text-right\"><small >— 《");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comment.song.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("》 网易云热门</small></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"time\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comment.time }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"list-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"list-group-item active\">友情链接</a> <a href=\"http://www.bejson.com/\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">JSON在线格式化</a> <a href=\"https://jwc.xidian.edu.cn/\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">西电教务处</a> <a href=\"http://tool.oschina.net/apidocs/apidoc?api=jdk-zh\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">在线JDK文档</a> <a href=\"https://www.sohu.com/a/244589784_99949461\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">论文网站推荐</a> <a href=\"http://www.tietuku.com/\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">图床推荐</a> <a href=\"https://www.imooc.com/\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">慕课网</a> <a href=\"https://icankeep.github.io\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"list-group-item\">我的博客</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--/row-->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("\t\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("\t\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/asserts/js/offcanvas.js\"></script>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<footer>\n");
      out.write("\t\t\t\t<p>&copy; 2019 Company, Inc.</p>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
