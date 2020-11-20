
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContador")
public class ServletContador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int contador = 0;
        
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for (Cookie c : cookies) {
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        contador++;
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        c.setMaxAge(3600);
        resp.addCookie(c);
        
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("Contador de visitas: " + contador);
        
        
    }
    
    
}
