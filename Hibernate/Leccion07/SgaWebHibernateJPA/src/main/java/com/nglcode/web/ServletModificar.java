package com.nglcode.web;

import com.nglcode.domain.Alumno;
import com.nglcode.domain.Contacto;
import com.nglcode.domain.Domicilio;
import com.nglcode.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modificar = request.getParameter("Modificar");
        String eliminar = request.getParameter("Eliminar");
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        
        if (modificar != null) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String noCalle = request.getParameter("noCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCalle(noCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);
            
            servicioAlumno.guardarAlumno(alumno);

            sesion.removeAttribute("alumno");
            
        } else if (eliminar != "Eliminar") {
            
            String idAlumnoStr = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoStr);
            Alumno alumno = new Alumno(idAlumno);
            servicioAlumno.eliminarAlumno(alumno);
            
        }
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idAlumnoStr = req.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoStr);

        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);

//        req.setAttribute("alumno", alumno); video 432, min 2:00
        HttpSession sesion = req.getSession();
        sesion.setAttribute("alumno", alumno);

        req.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(req, resp);

    }

}
