package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {

        UsuarioDAO usuarioDao = new UsuarioDAO();

        //Insert
//        Usuario u1 = new Usuario("juancho", "1234");
//        Usuario u2 = new Usuario("karlencia", "4567");
//        
//        usuarioDao.insertar(u1);
//        usuarioDao.insertar(u2);
        //Listar
        List<Usuario> usuarios = usuarioDao.seleccionar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }

        System.out.println("----------");

        //Modificar
//        Usuario u3 = new Usuario(7, "juancho", "nUeVa1234");
//        usuarioDao.actualizar(u3);
        //Eliminar
        Usuario u4 = new Usuario(7);
        usuarioDao.eliminar(u4);

        //Listar
        usuarios = usuarioDao.seleccionar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }

        System.out.println("----------");
    }

}
