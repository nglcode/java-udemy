package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Procesamos parametros
        String accion = req.getParameter("accion");

        // Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(2, 4);
        Rectangulo recSesion = new Rectangulo(3, 5);
        Rectangulo recAplicacion = new Rectangulo(2, 5);

        // Agregamos el javabean a algun alcance
        // revisamos la accion proporcionada
        if ("agregaVariables".equals(accion)) {
            // alcance request
            req.setAttribute("rectanguloRequest", recRequest);
            // alcance session
            HttpSession sesion = req.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            // alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);

            //Agregamos un mensaje
            req.setAttribute("mensaje", "Las variables fueron agregadas.");

            // redireccionamos al jsp de index
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            
        } else if ("listarVariables".equals(accion)) {
            // redireccionamos al jsp que despliega las variables
            req.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(req, resp);
        } else {
            // redireccionamos a la pagina de inicio
            req.setAttribute("mensaje", "Accion no proporcionada o desconocida.");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

        // Redireccionar a la vista seleccionada
        RequestDispatcher rd = req.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(req, resp);
    }

}
