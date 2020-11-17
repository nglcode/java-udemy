package datos;

import domain.Persona;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public UsuarioDAO() {
    }

    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String user = rs.getString("usuario");
                String pass = rs.getString("password");

                usuario = new Usuario(idUsuario, user, pass);
                usuarios.add(usuario);
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());

            registros = ps.executeUpdate();
        } finally {
            try {
                Conexion.close(ps);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        System.out.println("Registros actualizados: " + registros);

        return registros;

    }

    public int actualizar(Usuario usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getIdUsuario());

            registros = ps.executeUpdate();
        } finally {
            try {
                Conexion.close(ps);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        System.out.println("Registros actualizados: " + registros);

        return registros;

    }

    public int eliminar(Usuario usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, usuario.getIdUsuario());

            registros = ps.executeUpdate();
        } finally {
            try {
                Conexion.close(ps);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        System.out.println("Registros actualizados: " + registros);

        return registros;

    }

}
