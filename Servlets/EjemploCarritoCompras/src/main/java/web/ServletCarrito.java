package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletCarrito")
public class ServletCarrito extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        // creamos o recuperamos el objeto http session
        HttpSession sesion = req.getSession();

        // recuperamos la lista de articulos previos si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        // verificamos si la lista de articulos existe
        if (articulos == null) {
            // inicializamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        // procesamos el nuevo articulo
        String articuloNuevo = req.getParameter("articulo");

        // revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try ( // imprimimos la lista de articulos
                 PrintWriter out = resp.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br>");
            // iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
            out.print("");
        }

    }

}
