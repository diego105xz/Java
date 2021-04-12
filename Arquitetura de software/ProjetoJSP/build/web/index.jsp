<%-- 
    Document   : index
    Created on : 22/03/2021, 09:31:27
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulário Teste</h1>
        <form name="teste" action="./Controller" method="post"> 
            <%--Criar um formulário com dois campos de texto e um botão--%>
            <%--Campos:  Nome e Sobrenome --%>
            <input type ="text" name="nome" placeholder="Nome"><br>
            <input type ="text" name="sobrenome" placeholder="Sobrenome"><br>
            <input type="submit" name="enviar" value="Enviar">
            
        </form>
    </body>
</html>
