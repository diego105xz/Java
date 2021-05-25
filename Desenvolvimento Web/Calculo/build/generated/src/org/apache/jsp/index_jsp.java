package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Suporte.Tabelas;
import Suporte.Paciente;
import java.util.List;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Exemplo IMC</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Calcular IMC</h2>\n");
      out.write("\n");
      out.write("        <div id=\"div_imc\">\n");
      out.write("            <p>IMC = Índice de Massa Corporea</p>\n");
      out.write("            <form action=\"calculo.jsp\" method=\"get\" target=\"result\">\n");
      out.write("                Peso: <input type=\"text\" name=\"peso\"><br>\n");
      out.write("                Altura: <input type=\"text\" name=\"altura\"><br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"enviar\" value=\"Calcular\">       \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <div id=\"div_resultado\">\n");
      out.write("            <iframe name=\"result\" width=\"300\" height=\"200\"></iframe>\n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("        <br> \n");
      out.write("        \n");
      out.write("          ");
      out.print(new Tabelas().getImc());
      out.write("\n");
      out.write("        \n");
      out.write("        ");

           //int nivelIMC[] = {10,12,13,14,15,17,18,25,30,31,42,51,60};
           out.print("Primeiro teste");
           out.print(new Tabelas().nivel_Imc(10));
           out.print("<br><br>Segundo teste");
           out.print(new Tabelas().nivel_Imc(1,5));
           out.print("<br><br>Terceiro teste");
           out.print(new Tabelas().nivel_Imc());

        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            //Paciente p = new Paciente("Fábio","123.456.789-12",18);
            
            List<Paciente> p = new ArrayList<Paciente>();
            
            p.add(new Paciente("Nome","123.456.789-12",18));
            p.add(new Paciente("João","456.456.789-12",40));
            p.add(new Paciente("Maria","789.456.789-12",50));
            p.add(new Paciente("Robson","321.456.789-12",20));
            p.add(new Paciente("Aline", "2211-3324", 17));
            p.add(new Paciente("Mirian", "6666-8888", 23));
            
            for(Paciente valor :p){
                out.print("----------------------<br>");
                out.print("Nome = " + valor.getNome() + "<br>");
                out.print(valor.getCpf());
                out.print("Idade: " + valor.getIdade()+ "<br>");
            }
            
            //out.println("Nome = " + p.getNome() + "<br>");
            //out.println("Idade = " + p.getIdade() + "<br>");
            //out.println(p.getCpf());
        
      out.write("\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
