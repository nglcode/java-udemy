<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Variables Impl�citas</title>
    </head>
    <body>
        <h1>EL y Variables Impl�citas</h1>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${header["User-Agent"]}</li>
            <li>Session ID: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
        </ul>

    </body>
</html>
