
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletSesiones")
public class ServletSesiones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = req.getSession();
        String titulo = null;
        
        // se usa el tipo Object porque si se usa un tipo primitivo, no es posible preguntar por null
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        PrintWriter out = resp.getWriter();
        out.print(titulo);
        out.print("<br>"); 
        out.print("Nº de accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("Id de la sesion: " + sesion.getId());
        out.close();
        
    }
    
    
    
}
