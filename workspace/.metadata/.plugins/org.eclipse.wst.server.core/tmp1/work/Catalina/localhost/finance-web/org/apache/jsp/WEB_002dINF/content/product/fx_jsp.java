/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2017-05-10 11:22:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fx_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fhidden_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fhidden_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.release();
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
      out.write("\r\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    boolean _jspx_th_s_005fform_005f0_reused = false;
    try {
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /WEB-INF/content/product/fx.jsp(3,0) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setCssClass("form-horizontal");
      // /WEB-INF/content/product/fx.jsp(3,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("/fx/regist");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fform_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("  <div class=\"form-group\">\r\n");
          out.write("    <div class=\"col-sm-10\">\r\n");
          out.write("      <div  class=\"col-sm-12\" >\r\n");
          out.write("        <div class=\"col-sm-12\" style=\"border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;\">\r\n");
          out.write("            <label class=\"control-label\">TradeID:</label>\r\n");
          out.write("            <label class=\"control-label\">\r\n");
          out.write("              ");
          if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("              ");
          if (_jspx_meth_s_005fhidden_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            </label>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("      <div class=\"col-sm-6\" >\r\n");
          out.write("        <div class=\"col-sm-4\">\r\n");
          out.write("          <label class=\"control-label\">Counterparty:</label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-8\">\r\n");
          out.write("          ");
          if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-4\">\r\n");
          out.write("          <label class=\"control-label\">EffectiveDate:</label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-8\">\r\n");
          out.write("          <div class=\"input-group date\" data-date=\"%{effectiveDate}\"  data-date-format=\"yyyy/mm/dd\">\r\n");
          out.write("            ");
          if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            <span class=\"input-group-addon\"><span class=\"add-on glyphicon glyphicon-th\"></span></span>\r\n");
          out.write("          </div>\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("      <div class=\"col-sm-6\" >\r\n");
          out.write("      </div>\r\n");
          out.write("    </div>\r\n");
          out.write("    <div class=\"col-sm-10\" >\r\n");
          out.write("      <div class=\"col-sm-6\">\r\n");
          out.write("        <div class=\"col-sm-12\"  style=\"border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;\">\r\n");
          out.write("          <label class=\"control-label\" ><h5 style=\"color: Red;\">Buy-Side</h5></label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-4\">\r\n");
          out.write("          <label class=\"control-label\">Currency:</label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-8\">\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-4\">\r\n");
          out.write("          <label class=\"control-label\">Amount:</label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-8\">\r\n");
          out.write("          ");
          if (_jspx_meth_s_005ftextfield_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("      <div class=\"col-sm-6\">\r\n");
          out.write("        <div class=\"col-sm-12\"  style=\"border-bottom : solid 1px #bbbbbb; margin-bottom: 15px;\">\r\n");
          out.write("          <label class=\"control-label\" ><h5 style=\"color: Red;\">Sell-Side</h5></label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-4\">\r\n");
          out.write("          <label class=\"control-label\">Currency:</label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-8\">\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-4\">\r\n");
          out.write("          <label class=\"control-label\">Amount:</label>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"col-sm-8\">\r\n");
          out.write("          ");
          if (_jspx_meth_s_005ftextfield_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("    </div>\r\n");
          out.write("    <div class=\"col-sm-10\">\r\n");
          out.write("      <div class=\"col-sm-12\">\r\n");
          out.write("        <div class=\"col-sm-12\"  style=\"border-top : solid 1px #bbbbbb; padding-top: 15px; margin-top: 15px;\">\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("        </div>\r\n");
          out.write("      </div>\r\n");
          out.write("    </div>\r\n");
          out.write("  </div>\r\n");
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f0);
      _jspx_th_s_005fform_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fform_005f0_reused) {
        _jspx_th_s_005fform_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fform_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    boolean _jspx_th_s_005fproperty_005f0_reused = false;
    try {
      _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(10,14) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fproperty_005f0.setValue("%{zeroToBlank(tradeID)}");
      int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
      if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      _jspx_th_s_005fproperty_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fproperty_005f0_reused) {
        _jspx_th_s_005fproperty_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fproperty_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_005fhidden_005f0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fs_005fhidden_0026_005fproperty_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    boolean _jspx_th_s_005fhidden_005f0_reused = false;
    try {
      _jspx_th_s_005fhidden_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(11,14) null
      _jspx_th_s_005fhidden_005f0.setDynamicAttribute(null, "property", "tradeID");
      // /WEB-INF/content/product/fx.jsp(11,14) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fhidden_005f0.setName("tradeID");
      int _jspx_eval_s_005fhidden_005f0 = _jspx_th_s_005fhidden_005f0.doStartTag();
      if (_jspx_th_s_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fhidden_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_s_005fhidden_005f0);
      _jspx_th_s_005fhidden_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fhidden_005f0_reused) {
        _jspx_th_s_005fhidden_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fhidden_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f0_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(20,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setName("counterpartyID");
      // /WEB-INF/content/product/fx.jsp(20,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setCssClass("form-control");
      int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
      if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      _jspx_th_s_005ftextfield_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005ftextfield_005f0_reused) {
        _jspx_th_s_005ftextfield_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005ftextfield_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f1_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(27,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f1.setName("effectiveDate");
      // /WEB-INF/content/product/fx.jsp(27,12) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f1.setCssClass("form-control date-form");
      // /WEB-INF/content/product/fx.jsp(27,12) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f1.setValue("%{toString(effectiveDate)}");
      int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
      if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      _jspx_th_s_005ftextfield_005f1_reused = true;
    } finally {
      if (!_jspx_th_s_005ftextfield_005f1_reused) {
        _jspx_th_s_005ftextfield_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005ftextfield_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    boolean _jspx_th_s_005fselect_005f0_reused = false;
    try {
      _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(44,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setName("buyCurrency");
      // /WEB-INF/content/product/fx.jsp(44,10) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setList("currencyList");
      // /WEB-INF/content/product/fx.jsp(44,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f0.setCssClass("form-control");
      int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
      if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      _jspx_th_s_005fselect_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fselect_005f0_reused) {
        _jspx_th_s_005fselect_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fselect_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f2_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(50,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f2.setName("buyAmount");
      // /WEB-INF/content/product/fx.jsp(50,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f2.setCssClass("form-control");
      int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
      if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      _jspx_th_s_005ftextfield_005f2_reused = true;
    } finally {
      if (!_jspx_th_s_005ftextfield_005f2_reused) {
        _jspx_th_s_005ftextfield_005f2.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005ftextfield_005f2);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    boolean _jspx_th_s_005fselect_005f1_reused = false;
    try {
      _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(61,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f1.setName("sellCurrency");
      // /WEB-INF/content/product/fx.jsp(61,10) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f1.setList("currencyList");
      // /WEB-INF/content/product/fx.jsp(61,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fselect_005f1.setCssClass("form-control");
      int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
      if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fname_005flist_005fcssClass_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      _jspx_th_s_005fselect_005f1_reused = true;
    } finally {
      if (!_jspx_th_s_005fselect_005f1_reused) {
        _jspx_th_s_005fselect_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fselect_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f3_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(67,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f3.setName("sellAmount");
      // /WEB-INF/content/product/fx.jsp(67,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f3.setCssClass("form-control");
      int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
      if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      _jspx_th_s_005ftextfield_005f3_reused = true;
    } finally {
      if (!_jspx_th_s_005ftextfield_005f3_reused) {
        _jspx_th_s_005ftextfield_005f3.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005ftextfield_005f3);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    boolean _jspx_th_s_005fsubmit_005f0_reused = false;
    try {
      _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/content/product/fx.jsp(74,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setValue("Save");
      // /WEB-INF/content/product/fx.jsp(74,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setCssClass("btn btn-primary");
      int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
      if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fcssClass_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      _jspx_th_s_005fsubmit_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fsubmit_005f0_reused) {
        _jspx_th_s_005fsubmit_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fsubmit_005f0);
      }
    }
    return false;
  }
}
