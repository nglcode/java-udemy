package test;

import datos.Conexion;
import datos.IUsuarioDAO;
import datos.PersonaDaoJDBC;
import datos.UsuarioDaoJDBC;
import domain.PersonaDTO;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class TestManejoUsuarios {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            IUsuarioDAO usuarioDAO = new UsuarioDaoJDBC(conexion);

            usuarioDAO.update(new UsuarioDTO(8, "karlencia", "4r5tdcfv"));

            List<UsuarioDTO> usuarios = usuarioDAO.select();
            
            for (UsuarioDTO usuario : usuarios) {
                System.out.println(usuario);
            }

            conexion.commit();
            System.out.println("Operaciones procesadas correctamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback...");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        } 
    }

}
