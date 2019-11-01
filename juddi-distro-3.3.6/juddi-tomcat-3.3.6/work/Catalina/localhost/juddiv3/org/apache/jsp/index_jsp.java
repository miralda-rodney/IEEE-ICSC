/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2019-10-24 18:46:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringEscapeUtils;
import java.util.List;
import org.apache.juddi.config.Install;
import javax.xml.bind.JAXBException;
import org.uddi.v3_service.DispositionReportFaultMessage;
import org.apache.juddi.config.AppConfig;
import org.apache.juddi.config.Property;
import org.uddi.api_v3.BusinessEntity;
import org.uddi.api_v3.Name;
import org.uddi.api_v3.Description;
import java.io.IOException;
import org.apache.juddi.config.Release;

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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.apache.juddi.config.Install");
    _jspx_imports_classes.add("org.uddi.api_v3.Description");
    _jspx_imports_classes.add("org.uddi.api_v3.BusinessEntity");
    _jspx_imports_classes.add("org.uddi.api_v3.Name");
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("org.uddi.v3_service.DispositionReportFaultMessage");
    _jspx_imports_classes.add("org.apache.juddi.config.Release");
    _jspx_imports_classes.add("javax.xml.bind.JAXBException");
    _jspx_imports_classes.add("org.apache.commons.lang.StringEscapeUtils");
    _jspx_imports_classes.add("org.apache.juddi.config.AppConfig");
    _jspx_imports_classes.add("org.apache.juddi.config.Property");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

        
        /*
 * Copyright 2001-2008 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
        
        
      out.write("\r\n");
      out.write("<!-- index.jsp -->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Apache jUDDI Registry</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"juddi.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\" align=\"right\"><a href=\"http://juddi.apache.org/\" target=\"_top\">jUDDI@Apache</a></div>\r\n");
      out.write("        <h1>Apache jUDDI version ");
      out.print( Release.getRegistryVersion());
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h2><em>Welcome</em> to Apache jUDDI!</h2>\r\n");
      out.write("        jUDDI is an open source implementation of <a href=\"http://oasis-open.org\">OASIS</a>'s <a href=\"http://oasis-open.org/committees/uddi-spec/doc/tcspecs.htm#uddiv3\">Universal Discovery Description and Integration (UDDI)</a>.\r\n");
      out.write("        You've reached the deployment page for jUDDI's web services.<br>\r\n");
      out.write("\r\n");
      out.write("        Looking for the old jUDDI Portal/Porlets? We've completely rewritten it. \r\n");
      out.write("\r\n");
      out.write("        <h4><a href=\"/juddi-gui\">View the jUDDI User Interface</a> - This is a nearly complete UDDIv3 end user web application.</h4>\r\n");
      out.write("\r\n");
      out.write("        <h4><a href=\"admin\">View the jUDDI Administration Interface</a> - This is for administrators to use to reconfigure jUDDI, check the status, and perform administrative actions.</h4>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        Here's some useful links to learn more about the UDDI and jUDDI.\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"services\">View the service listing on this UDDI node</a></li>\r\n");
      out.write("            <li><a href=\"http://juddi.apache.org/\">The Apache-jUDDI Home Page</a></li>\r\n");
      out.write("            <li><a href=\"http://juddi.apache.org/docs.html\" >Documentation</a></li>\r\n");
      out.write("            <li><a href=\"http://wiki.apache.org/juddi\" >jUDDI Wiki</a></li>\r\n");
      out.write("            <li><a href=\"http://juddi.apache.org/issue-tracking.html\" >jUDDI's Issue Tracker (report a bug)</a></li>\r\n");
      out.write("            <li><a href=\"http://juddi.apache.org/source.html\" >jUDDI's Source Code</a></li>\r\n");
      out.write("            <li><a href=\"http://juddi.apache.org/mailing-list.html\">jUDDI's Mailing lists</a></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"install\">\r\n");
      out.write("            <h4>jUDDI Installation Status</h4>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                ");

                    // This will tirgger the install process...
                    String rootPartition = AppConfig.getConfiguration().getString(Property.JUDDI_ROOT_PARTITION);
                    String nodeId = AppConfig.getConfiguration().getString(Property.JUDDI_NODE_ID);
                    String rootBusiness = AppConfig.getConfiguration().getString(Property.JUDDI_NODE_ROOT_BUSINESS);
                    String nodeName = "";
                    String nodeDescription = "";
                    BusinessEntity be = null;
                    boolean ok = true;
                    String error = "";
                    try {
                        be = Install.getNodeBusinessEntity(rootBusiness);
                        Name n = be.getName().get(0);
                        if (n != null) {
                            nodeName = n.getValue();
                        }

                        List descList = be.getDescription();
                        if (descList != null && descList.size() > 0) {
                            Description d = (Description) descList.get(0);
                            if (d != null) {
                                nodeDescription = d.getValue();
                            }
                        }
                    } catch (Exception ex) {
                        ok = false;
                        error = ex.getMessage();

                    }
                    if (ok) {

                
      out.write("\r\n");
      out.write("                <div>jUDDI has been successfully installed!</div>\r\n");
      out.write("\r\n");
      out.write("                <h3>Node Information</h3>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Partition:</b></td>\r\n");
      out.write("                        <td>");
      out.print( StringEscapeUtils.escapeHtml(rootPartition));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Node Id:</b></td>\r\n");
      out.write("                        <td>");
      out.print(StringEscapeUtils.escapeHtml(nodeId));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Business Key:</b></td>\r\n");
      out.write("                        <td>");
      out.print( StringEscapeUtils.escapeHtml(rootBusiness));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Business Name:</b></td>\r\n");
      out.write("                        <td>");
      out.print( StringEscapeUtils.escapeHtml(nodeName));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Business Description:</b></td>\r\n");
      out.write("                        <td>");
      out.print(StringEscapeUtils.escapeHtml(nodeDescription));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("                <h2 color=\"red\">jUDDI has NOT installed correctly!</h2>\r\n");
      out.write("                <p />\r\n");
      out.write("                <h3>Error Information</h3>\r\n");
      out.write("                <p>\r\n");
      out.write("                    ");
      out.print(StringEscapeUtils.escapeHtml(error));
      out.write("<br>\r\n");
      out.write("                    Suggestion: Check the juddiv3.xml config file for the following settings (in Xpath notation) and ensure that they either match the defaults, or the install data.\r\n");
      out.write("                </p>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>config/juddi/nodeId, default = uddi:juddi.apache.org:node1</li>\r\n");
      out.write("                    <li>config/juddi/rootBusinessId, default = uddi:juddi.apache.org:businesses-asf</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                Configured values:\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Partition:</b></td>\r\n");
      out.write("                        <td>");
      out.print( StringEscapeUtils.escapeHtml(rootPartition));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Node Id:</b></td>\r\n");
      out.write("                        <td>");
      out.print(StringEscapeUtils.escapeHtml(nodeId));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Business Key:</b></td>\r\n");
      out.write("                        <td>");
      out.print( StringEscapeUtils.escapeHtml(rootBusiness));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Business Name:</b></td>\r\n");
      out.write("                        <td>");
      out.print( StringEscapeUtils.escapeHtml(nodeName));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><b>Root Business Description:</b></td>\r\n");
      out.write("                        <td>");
      out.print(StringEscapeUtils.escapeHtml(nodeDescription));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                ");
                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <hr />\r\n");
      out.write("        <table width=\"100%\" border=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"50\" align=\"center\" valign=\"bottom\" nowrap>\r\n");
      out.write("                    <div class=\"footer\">&nbsp;</div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
