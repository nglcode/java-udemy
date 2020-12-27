
package com.nglcode.sga.servicio;

import com.nglcode.sga.datos.UsuarioDAO;
import com.nglcode.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote{
    
    @Inject
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.findAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioPorId(Usuario usuario) {
        return usuarioDAO.findUsuarioById(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorUsername(Usuario usuario) {
        return usuarioDAO.findUsuarioByUsername(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDAO.insertUsuario(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDAO.updateUsuario(usuario);
        
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDAO.deleteUsuario(usuario);
        
    }
    
    
    
}
