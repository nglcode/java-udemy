<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="persona.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="persona.titulo" /></h1>

        <s:if test="personas.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona" /></th>
                        <th><s:text name="p.nombre" /></th>
                        <th><s:text name="p.apePat" /></th>
                        <th><s:text name="p.apeMat" /></th>
                        <th><s:text name="p.email" /></th>
                    </tr>
                    <s:iterator value="personas">
                        <tr>
                            <td><s:property value="idPersona" /></td>
                            <td><s:property value="nombre" /></td>
                            <td><s:property value="apellidoPaterno" /></td>
                            <td><s:property value="apellidoMaterno" /></td>
                            <td><s:property value="email" /></td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>

        <s:form>
            <s:submit key="persona.boton" name="submit" />
        </s:form>

        <div><s:text name="persona.contador" />: <s:property value="contadorPersonas" /></div>
    </body>
</html>
