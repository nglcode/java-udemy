
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlets</title>
    </head>
    <body>
        <h1>Scriptlets</h1>
        <br>
        <%-- Scriptlet para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un scriptlet");
        %>
        <%-- Scriptlet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la app: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriptlet con código condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        <h4>Sesión nueva</h4>
        <%
        } else if (session != null) {
        %>
        <h4>Sesión no es nueva</h4>
        <%
            }
        %>
        <br>
        <a href="index.html">Regresar al inicio</a>

    </body>
</html>
