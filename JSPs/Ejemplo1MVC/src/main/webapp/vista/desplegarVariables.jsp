<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        Variable en alcance request: ${mensaje}
        <br><hr><br>
        Variable en alcance de sesion: <br>
        Rectangulo: <br>
        Base: ${rectangulo.base} <br>
        Altura: ${rectangulo.altura} <br>
        Area: ${rectangulo.area} <br>
        <hr>
        <a href="${pageContext.request.contextPath}/index.jsp">Volver al inicio</a>
    </body>
</html>
