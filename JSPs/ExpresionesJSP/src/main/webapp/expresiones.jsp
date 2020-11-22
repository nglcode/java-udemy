<%-- 
    Document   : Expresiones
    Created on : 22 nov. 2020, 19:23:11
    Author     : agdev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        Concatenación: <%= "Saludos" + " " + "JSP" %>
        <br>
        Operación Matemática: <%= 2*3/2 %>
        <br>
        Session ID: <%= session.getId() %>
        <br>
        <hr>
        <br>
        <a href="index.html">Regresar al inicio</a>
        
    </body>
</html>
