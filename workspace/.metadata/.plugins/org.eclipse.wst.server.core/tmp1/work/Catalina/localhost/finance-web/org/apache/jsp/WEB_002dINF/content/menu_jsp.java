/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2017-03-19 14:08:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.5.10.jar", Long.valueOf(1487848590827L));
    _jspx_dependants.put("jar:file:/D:/x_finance_project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/finance-web/WEB-INF/lib/struts2-core-2.5.10.jar!/META-INF/struts-tags.tld", Long.valueOf(1485481076000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  <div class=\"col-sm-12\">\r\n");
      out.write("      <nav class=\"navbar navbar-default\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <!--\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Project name</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          -->\r\n");
      out.write("          <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li style=\"border-left : solid 1px #bbbbbb;\"><a href=\"");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" >Search</a></li>\r\n");
      out.write("              <li style=\"border-left : solid 1px #bbbbbb;\" class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Trade<span class=\"caret\"></span></a>\r\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                  <li><a href=\"");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" >FX</a></li>\r\n");
      out.write("                  <li><a href=\"");
      if (_jspx_meth_s_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" >Cash</a></li>\r\n");
      out.write("                  <!--\r\n");
      out.write("                  <li class=\"divider\"></li>\r\n");
      out.write("                  <li class=\"dropdown-header\">Nav header</li>\r\n");
      out.write("                  <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                  <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                  -->\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("                <li style=\"border-left : solid 1px #bbbbbb;\" class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Issue<span class=\"caret\"></span></a>\r\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                  <li><a href=\"#\" >Bond</a></li>\r\n");
      out.write("                  <li><a href=\"#\" >Stock</a></li>\r\n");
      out.write("                  <li><a href=\"#\" >Futures</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li style=\"border-left : solid 1px #bbbbbb;\" class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Code<span class=\"caret\"></span></a>\r\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                  <li><a href=\"#\" >Currency</a></li>\r\n");
      out.write("                  <li><a href=\"#\" >Market</a></li>\r\n");
      out.write("                  <li><a href=\"#\" >Rate Index</a></li>\r\n");
      out.write("                  <li><a href=\"#\" >Account</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li style=\"border-left : solid 1px #bbbbbb;\" class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Market<span class=\"caret\"></span></a>\r\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                  <li><a href=\"");
      if (_jspx_meth_s_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" >YieldCurve</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!--\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li class=\"active\"><a href=\"./\">Default <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("              <li><a href=\"../navbar-static-top/\">Static top</a></li>\r\n");
      out.write("              <li><a href=\"../navbar-fixed-top/\">Fixed top</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("  </div>");
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

  private boolean _jspx_meth_s_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    boolean _jspx_th_s_005furl_005f0_reused = false;
    try {
      _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f0.setParent(null);
      // /WEB-INF/content/menu.jsp(18,68) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f0.setValue("/trade/summery");
      int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
      if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      _jspx_th_s_005furl_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005furl_005f0_reused) {
        _jspx_th_s_005furl_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005furl_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    boolean _jspx_th_s_005furl_005f1_reused = false;
    try {
      _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f1.setParent(null);
      // /WEB-INF/content/menu.jsp(22,31) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f1.setValue("/fx");
      int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
      if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      _jspx_th_s_005furl_005f1_reused = true;
    } finally {
      if (!_jspx_th_s_005furl_005f1_reused) {
        _jspx_th_s_005furl_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005furl_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f2 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    boolean _jspx_th_s_005furl_005f2_reused = false;
    try {
      _jspx_th_s_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f2.setParent(null);
      // /WEB-INF/content/menu.jsp(23,31) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f2.setValue("/cash");
      int _jspx_eval_s_005furl_005f2 = _jspx_th_s_005furl_005f2.doStartTag();
      if (_jspx_th_s_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f2);
      _jspx_th_s_005furl_005f2_reused = true;
    } finally {
      if (!_jspx_th_s_005furl_005f2_reused) {
        _jspx_th_s_005furl_005f2.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005furl_005f2);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f3 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    boolean _jspx_th_s_005furl_005f3_reused = false;
    try {
      _jspx_th_s_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_s_005furl_005f3.setParent(null);
      // /WEB-INF/content/menu.jsp(52,31) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005furl_005f3.setValue("/yieldcurve");
      int _jspx_eval_s_005furl_005f3 = _jspx_th_s_005furl_005f3.doStartTag();
      if (_jspx_th_s_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f3);
      _jspx_th_s_005furl_005f3_reused = true;
    } finally {
      if (!_jspx_th_s_005furl_005f3_reused) {
        _jspx_th_s_005furl_005f3.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005furl_005f3);
      }
    }
    return false;
  }
}
