
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ServletCookies")
public class ServletCookies extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //suponemos que el usuario visita por primera vez
        boolean nuevoUsuario = true;
        
        //obtenemos el arreglo de cookies
        Cookie[] cookies = req.getCookies();
        String mensaje;
        
        //buscamos si ya existe una cookie previa
        if(cookies != null){
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario = false;
                    break;
                }
                
            }
        }
        
        if(nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            resp.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez.";
        } else {
            mensaje = "Gracias por visitar nuestro sitio nuevamente.";
        }
        
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(mensaje);
        out.close();
    }
    
    
}
