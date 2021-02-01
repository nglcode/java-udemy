<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo" /></title>
    </head>
    <body>
        <h1><s:property value="titulo" /></h1>
        <s:form>
            <s:textfield key="form.usuario" name="usuario"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.boton" name="submit" />
        </s:form>
        <div>
            <b><s:text name="form.valores" />:</b>
            <br>
            <s:property value="user"/>: <s:property value="usuario"/>
            <br>
            <s:property value="pass"/>: <s:property value="password"/>
        </div>
    </body>
</html>
