package test;

import datos.Conexion;
import datos.IPersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            IPersonaDAO personaDAO = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDAO.select();
            
            for (PersonaDTO persona : personas) {
                System.out.println(persona.toString());
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
