<%@page import="Suporte.Tabelas"%>
<%@page import="Suporte.Paciente"%>
<%@page import='java.util.List'%>
<%@page import='java.util.ArrayList'%>

<!DOCTYPE html>

<%!
    float tot1, tot2, tot3 = 0;
    int vezes = 0;
    
    private void notas(float v1, float v2, float v3){
        this.vezes++;
        this.tot1 += v1;
        this.tot2 += v2;
        this.tot3 += v3;
    }

    private String medias(){
        String sRet = "";
        sRet += "<br>Media Nota 1: " + (this.tot1/vezes);
        sRet += "<br>Media Nota 2: " + (this.tot2/vezes);
        sRet += "<br>Media Nota 3: " + (this.tot3/vezes);
        return sRet;
    }

    private String status(){
        float notas=0;
        String resposta = "";
        
        notas += (this.tot1/vezes);
        notas += (this.tot2/vezes);
        notas += (this.tot3/vezes);
        
        if((notas/3)>= 6.0){
            resposta = "<br>Aprovado";
        }else{
            resposta = "<br>Reprovado";
        }
        return resposta;
    }

%>

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
            

             out.print("<br>-----------------------<br>");
             notas(10,8,4);
             notas(6,8,4.5f);
             notas(5,3,8.5f);
             out.println("Média entre as notas Av1, Av2 e Av3");
             out.println(medias());
             
             out.print("<br>-----------------------<br>");
             out.println(status());
        %>
        
        <br>
    </body>
</html>