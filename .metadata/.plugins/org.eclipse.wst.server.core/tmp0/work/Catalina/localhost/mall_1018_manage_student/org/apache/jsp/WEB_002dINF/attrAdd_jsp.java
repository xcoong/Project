/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2018-03-26 07:24:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class attrAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
      out.write("\r\n");
      out.write("\r\n");
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction b(){}\r\n");
      out.write("</script>\r\n");
      out.write("<title>硅谷商城</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t添加商品属性\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<form action=\"attr_add.do\">\r\n");
      out.write("\t<input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flbh2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"flbh2\"/>\r\n");
      out.write("\t<table border=\"1\" width=\"700px\">\r\n");
      out.write("\t\t<tr><td>属性名：<input type=\"text\" name=\"list_attr[0].shxm_mch\"></td><td></td><td>添加属性值</td></tr>\r\n");
      out.write("\t\t<tr><td>属性值：<input type=\"text\" name=\"list_attr[0].list_value[0].shxzh\"></td><td>单位：<input type=\"text\" name=\"list_attr[0].list_value[0].shxzh_mch\"></td><td>删除</td></tr>\r\n");
      out.write("\t\t<tr><td>属性值：<input type=\"text\" name=\"list_attr[0].list_value[1].shxzh\"></td><td>单位：<input type=\"text\" name=\"list_attr[0].list_value[1].shxzh_mch\"></td><td>删除</td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table border=\"1\" width=\"700px\">\r\n");
      out.write("\t\t<tr><td>属性名：<input type=\"text\" name=\"list_attr[1].shxm_mch\"></td><td></td><td>添加属性值</td></tr>\r\n");
      out.write("\t\t<tr><td>属性值：<input type=\"text\" name=\"list_attr[1].list_value[0].shxzh\"></td><td>单位：<input type=\"text\" name=\"list_attr[1].list_value[0].shxzh_mch\"></td><td>删除</td></tr>\r\n");
      out.write("\t\t<tr><td>属性值：<input type=\"text\" name=\"list_attr[1].list_value[1].shxzh\"></td><td>单位：<input type=\"text\" name=\"list_attr[1].list_value[1].shxzh_mch\"></td><td>删除</td></tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t添加：<input type=\"submit\" value=\"提交\" >\r\n");
      out.write("\t</form>\r\n");
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