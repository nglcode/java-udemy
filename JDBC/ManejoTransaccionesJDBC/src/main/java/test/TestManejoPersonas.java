package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import domain.Usuario;
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

            PersonaDAO personaDAO = new PersonaDAO(conexion);

            personaDAO.actualizar(new Persona(2, "Carla", "Lara", "klara@mail.com", "987456321"));

            personaDAO.insertar(new Persona("Carlos", "Carlanga", "ccarlanga@mail.com", "159753654"));

            conexion.commit();

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
