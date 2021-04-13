<%-- 
    Document   : TratarError
    Created on : 06/04/2021, 11:03:09
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Erro</title>
    </head>
    <body>
        <h1>Algo deu errado!</h1>
        Erro encontrado em: <%=exception%>
    </body>
</html>
