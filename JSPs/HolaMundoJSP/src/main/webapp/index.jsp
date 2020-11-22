<%-- 
    Document   : index
    Created on : 22 nov. 2020, 17:34:10
    Author     : agdev
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li> <% out.print("HolaMundo con Scriplets");%> </li>
            <li> ${"HolaMundo con Expression Language (EL)"} </li>
            <li> <%= "HolaMundo con Expresiones"%> </li>
            <li> <c:out value="HolaMundo con JSTL" /> </li>
        </ul>

    </body>
</html>
