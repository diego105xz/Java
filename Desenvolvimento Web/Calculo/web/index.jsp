<%@page import="Suporte.Tabelas"%>
<%@page import="Suporte.Paciente"%>
<%@page import='java.util.List'%>
<%@page import='java.util.ArrayList'%>

<!DOCTYPE html>

<html>
    <head>
        <title>Exemplo IMC</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Calcular IMC</h2>

        <div id="div_imc">
            <p>IMC = Índice de Massa Corporea</p>
            <form action="calculo.jsp" method="get" target="result">
                Peso: <input type="text" name="peso"><br>
                Altura: <input type="text" name="altura"><br>

                <input type="submit" name="enviar" value="Calcular">       
            </form>
        </div>
        <br><br>
        
        <div id="div_resultado">
            <iframe name="result" width="300" height="200"></iframe>
        </div>
   
        <br> 
        
          <%=new Tabelas().getImc()%>
        
        <%
           //int nivelIMC[] = {10,12,13,14,15,17,18,25,30,31,42,51,60};
           out.print("Primeiro teste");
           out.print(new Tabelas().nivel_Imc(10));
           out.print("<br><br>Segundo teste");
           out.print(new Tabelas().nivel_Imc(1,5));
           out.print("<br><br>Terceiro teste");
           out.print(new Tabelas().nivel_Imc());

        %>
        
        <%
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
        %>
        
        <br>
    </body>
</html>