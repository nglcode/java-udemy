<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="pform.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="pform.titulo" /></h1>
        <a href="<s:url action="agregarPersona"/>"><s:text name="pform.agregar" /></a>
        <s:if test="personas.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona" /></th>
                        <th><s:text name="p.nombre" /></th>
                        <th><s:text name="p.apePat" /></th>
                        <th><s:text name="p.apeMat" /></th>
                        <th><s:text name="p.email" /></th>
                        <th><s:text name="pform.editar" /></th>
                        <th><s:text name="pform.eliminar" /></th>

                    </tr>
                    <s:iterator value="personas">
                        <tr>
                            <td><s:property value="idPersona" /></td>
                            <td><s:property value="nombre" /></td>
                            <td><s:property value="apellidoPaterno" /></td>
                            <td><s:property value="apellidoMaterno" /></td>
                            <td><s:property value="email" /></td>
                            <td>
                                <s:url action="editarPersona" var="editarURL">
                                    <s:param name="persona.idPersona" value="%{idPersona}"></s:param>
                                </s:url>
                                <s:a href="%{editarURL}"><s:text name="pform.editar" /></s:a>
                            </td>
                            <td>
                                <s:url action="eliminarPersona" var="eliminarURL">
                                    <s:param name="persona.idPersona" value="%{idPersona}"></s:param>
                                </s:url>
                                <s:a href="%{eliminarURL}"><s:text name="pform.eliminar" /></s:a>
                                </td>
                            </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
    </body>
</html>
