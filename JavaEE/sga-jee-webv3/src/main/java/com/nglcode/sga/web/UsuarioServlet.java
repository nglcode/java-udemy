
package com.nglcode.sga.web;

import com.nglcode.sga.domain.Usuario;
import com.nglcode.sga.servicio.UsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet {
    
    @Inject
    UsuarioService usuarioService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        System.out.println("Usuarios: " + usuarios);
        
        req.setAttribute("usuarios", usuarios);
        req.getRequestDispatcher("/listadoUsuarios.jsp").forward(req, resp);
    }
    
    
    
}
