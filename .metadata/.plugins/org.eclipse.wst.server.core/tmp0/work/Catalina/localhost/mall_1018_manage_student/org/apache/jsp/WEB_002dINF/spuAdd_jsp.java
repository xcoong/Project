/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2018-03-27 05:51:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class spuAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\"  content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction click_image(index){\r\n");
      out.write("\t\t$(\"#file_\"+index).click();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction replace_image(index){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//获得图片对象\r\n");
      out.write("\t\tvar blob_image =$(\"#file_\"+index)[0].files[0];\r\n");
      out.write("\t\tvar url=window.URL.createObjectURL(blob_image);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//替换image\r\n");
      out.write("\t\t$(\"#image_\"+index).attr(\"src\",url);\r\n");
      out.write("\t\tvar length=$(\":file\").length;\r\n");
      out.write("\t\tif((index+1)==length){\r\n");
      out.write("\t\t\t//用户选择的是最后一张图片\r\n");
      out.write("\t\t\tadd_image(index);\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\tfunction add_image(index){\r\n");
      out.write("\t\t\tvar a = '<div id =\"d_'+(index+1)+'\" style=\"float:left;margin-left:10px;border:1px red solid;\">';\r\n");
      out.write("\t\t\tvar b = '<input id=\"file_'+(index+1)+'\" type=\"file\" name=\"files\" style=\"display:none;\" onChange=\"replace_image('+(index+1)+')\"/>'\r\n");
      out.write("\t\t\tvar c = '<img id=\"image_'+(index+1)+'\" onclick=\"click_image('+(index+1)+')\" style=\"cursor:pointer;\" src=\"image/upload_hover.png\" width=\"100px\" height=\"100px\"/>'\r\n");
      out.write("\t\t\tvar d = '</div>';\r\n");
      out.write("\t\t\t$(\"#d_\"+index).after(a+b+c+d);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<title>硅谷商城</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\tspu信息添加");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spu.flbh1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('|');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spu.flbh2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('|');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spu.pp_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<form action=\"spu_add.do\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"flbh1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spu.flbh1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"flbh2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spu.flbh2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"pp_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spu.pp_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t商品名称：<input name=\"shp_mch\" type=\"text\"><br>\r\n");
      out.write("\t\t商品描述：<textarea name=\"shp_msh\" rows=\"10\" cols=\"50\"></textarea>\r\n");
      out.write("\t\t商品图片：<br>\r\n");
      out.write("\t\t<div id=\"d_0\" style=\"float:left;margin-left: 10px;border: 1px;red solid;\">\r\n");
      out.write("\t\t\t<input id=\"file_0\" type=\"file\" name=\"files\" style=\"display: none;\" onchange=\"replace_image(0)\"/>\r\n");
      out.write("\t\t\t<img id=\"img_0\" onclick=\"click_image(0)\" style=\"cursor: pointer;\" src=\"image/upload_hover.png\"width=\"100px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"提交\">\r\n");
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
