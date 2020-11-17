package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.UsuarioDAO;
import domain.Persona;
import domain.Usuario;
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

            UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);

            usuarioDAO.actualizar(new Usuario(8, "karlencia", "aicnelnrak"));

            usuarioDAO.insertar(new Usuario("carly.petardo", "15975asd"));

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
