package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.

        // Leer los parametros del formulario html
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");

        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);

        PrintWriter out = resp.getWriter();
        String html
                = "<html>"
                + "<body>"
                + "El parámetro usuario es: " + usuario
                + "<br/>"
                + "El parámetro password es: " + password
                + "</body>"
                + "</html>";

        out.print(html);
        out.close();

    }

}
