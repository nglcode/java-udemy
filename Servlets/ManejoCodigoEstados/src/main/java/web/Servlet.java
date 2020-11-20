package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Simulando los valores correctos
        String usuarioOK = "Juan";
        String passwordOK = "123";

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();

        if (usuarioOK.equals(usuario) && passwordOK.equals(password)) {
            int rc = response.getStatus();
            String html = "<h1> Datos correctos </h1>"
                    + "<br>"
                    + "Usuario: " + usuario
                    + "<br>"
                    + "Password: " + password
                    + "<hr>"
                    + "Status: " + rc;
            out.print(html);
        } else {
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas.");
        }

        out.close();
    }

}
