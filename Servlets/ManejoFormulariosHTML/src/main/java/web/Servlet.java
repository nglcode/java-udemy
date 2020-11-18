package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        String tecnologias[] = req.getParameterValues("tecnologia");
        String genero = req.getParameter("genero");
        String ocupacion = req.getParameter("ocupacion");
        String musica[] = req.getParameterValues("musica");
        String comentario = req.getParameter("comentarios");

        String html
                = "<html>"
                + "<head>"
                + "<title>Resultado Servlet</title>"
                + "</head>"
                + "<body>"
                + "<h1>Parametros procesados por el Servlet:</h1>"
                + "<table border='1'>"
                + "<tr>"
                + "<td>Usuario</td>"
                + "<td>" + usuario + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Password</td>"
                + "<td>" + password + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Tecnologias</td>"
                + "<td>";

        for (String tecnologia : tecnologias) {
            html += tecnologia + " ";
        }

        html += "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Genero</td>"
                + "<td>" + genero + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Ocupación</td>"
                + "<td>" + ocupacion + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Música</td>"
                + "<td>";

        if (musica != null) {
            for (String elemento : musica) {
                html += elemento + " ";
            }
        } else {
            html += "N/S";
        }
        
        if(comentario == null) {
            comentario = "N/S";
        }

        html += "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Comentarios</td>"
                + "<td>" + comentario + "</td>"
                + "</tr>"
                + "</table>"
                + "</body>"
                + "</html>";

        out.print(html);

    }

}
