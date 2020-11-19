package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String metodoHttp = req.getMethod();
        String uri = req.getRequestURI();
        Enumeration cabeceras = req.getHeaderNames();

        String html
                = "<html>"
                + "<head>"
                + "<title>Headers HTTP</title>"
                + "</head>"
                + "<body>"
                + "<h1>Headers HTTP</h1>"
                + "<div>Metodo HTTP: " + metodoHttp + "</div>"
                + "<div>URI Solicitada: " + uri + "</div>";

        while (cabeceras.hasMoreElements()) {            
            String nombreCabecera = (String) cabeceras.nextElement();
            html += "<div><b>" + nombreCabecera +": </b>" + req.getHeader(nombreCabecera) + "</div>";
        }
        
        html += "</body>"
                + "</html>";

        out.print(html);
    }

}
