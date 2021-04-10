package com.nglcode.web;

import com.nglcode.domain.Persona;
import com.nglcode.servicio.ServicioPersonas;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        ServicioPersonas servicioPersonas = new ServicioPersonas();
        List<Persona> personas = servicioPersonas.listarPersonas();
        
        req.setAttribute("personas", personas);
        req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
        
    }
    
    
    
}
