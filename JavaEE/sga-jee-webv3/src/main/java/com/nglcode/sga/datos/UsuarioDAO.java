
package com.nglcode.sga.datos;

import com.nglcode.sga.domain.Usuario;
import java.util.List;


public interface UsuarioDAO {
    
    public List<Usuario> findAllUsuarios();
    
    public Usuario findUsuarioById(Usuario usuario);
    
    public Usuario findUsuarioByUsername(Usuario usuario);
    
    public void insertUsuario(Usuario usuario);
    
    public void updateUsuario(Usuario usuario);
    
    public void deleteUsuario(Usuario usuario);
    
}
