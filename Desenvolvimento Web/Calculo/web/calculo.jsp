<%@page import="Suporte.Tabelas" %>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="TratarError.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%
            try {
                String peso_txt, altura_txt;

                float peso, altura;
                peso = 0f;
                altura = 0f;

                peso_txt = request.getParameter("peso");
                altura_txt = request.getParameter("altura");

                peso = Float.parseFloat(peso_txt);
                altura = Float.parseFloat(altura_txt);

                float imc = peso / (altura * altura);
                out.println("IMC = " + imc + "<br>");

                if (imc < 18) {
                    out.println("Abaixo do peso ");
                }

                if (imc >= 18.5 && imc < 25) {
                    out.println("Peso normal ");
                }

                if (imc >= 25 && imc < 30) {
                    out.println("Obesidade grau 1 ");
                }

                if (imc >= 30 && imc < 35) {
                    out.println("Obesidade grau 2 ");
                }

                if (imc >= 35 && imc < 40) {
                    out.println("Obesidade grau 3 ");
                }

                if (imc >= 40) {
                    out.println("Obesidade morbida ");
                }
                
                out.println(new Tabelas().CalculoImc(peso, altura));
                
            }catch(Exception ex){
                out.print("Erro = "+ ex.getMessage());
            }
        %>
    </body>
</html>