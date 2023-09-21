package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entidades.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Equipo2
 */
public class UsuarioDAO extends Conexion {

    /**
     * Constructor vacío de la clase UsuarioDAO.
     */
    public UsuarioDAO() {

    }

    /**
     * Obtiene un producto de la base de datos según su ID.
     *
     * @param idProducto El ID del producto a obtener.
     * @return El objeto de tipo Producto correspondiente al producto
     * encontrado, o null si no se encuentra.
     */
    public boolean aunteticacion(Usuario usuario) {

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select usuarios.idUsuario from usuarios where idUsuario=?";
            System.out.println("Consulta es " + consulta);
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, usuario.getIdUsuario());

            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("usuario valido");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Error en: " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }
        }
        System.out.println("usuario no valido");
        return false;
    }

    /**
     * Registra un nuevo usuario en la base de datos.
     *
     * @param usuario El objeto Usuario a registrar.
     * @return true si el usuario se registra con éxito, false en caso
     * contrario.
     */
    public boolean registrar(Usuario usuario) {
        PreparedStatement pst = null;

        try {
            String consulta = "INSERT INTO usuarios (nombre, email, telefono, direccion, contrasena) VALUES (?, ?, ?, ?, ?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getTelefono());
            pst.setString(4, usuario.getDireccion());
            pst.setString(5, usuario.getContrasena());

            if (pst.executeUpdate() == 1) {
                System.out.println("Usuario registrado con exito");
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error en " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }
        }

        System.out.println("Usuario no registrado con exito");
        return false;
    }

    /**
     * Obtiene un usuario de la base de datos según su ID.
     *
     * @param idUsuario El ID del usuario que se desea obtener.
     * @return Un objeto Usuario si se encuentra en la base de datos, o null si
     * no se encuentra.
     */
    public Usuario obtener(int idUsuario) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {

            String consulta = "SELECT * FROM usuarios WHERE idUsuario = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idUsuario);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Obtener datos del resultado y crear un objeto Usuario
                int id = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String contrasena = rs.getString("contrasena");

                usuario = new Usuario(nombre, contrasena, email, telefono, direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }
        }

        return usuario;
    }

    /**
     * Obtiene un usuario de la base de datos según su dirección de correo
     * electrónico y contraseña.
     *
     * @param email La dirección de correo electrónico del usuario.
     * @param contrasena La contraseña del usuario.
     * @return Un objeto Usuario si las credenciales son válidas y se encuentra
     * en la base de datos, o null si no se encuentra.
     */
    public Usuario obtener(String email, String contrasena) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {

            String consulta = "SELECT * FROM usuarios WHERE email=? AND contrasena=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, email);
            pst.setString(2, contrasena);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Obtener datos del resultado y crear un objeto Usuario
                int id = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("email");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String password = rs.getString("contrasena");

                usuario = new Usuario(id, nombre, password, correo, telefono, direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error en " + e);
            }
        }

        return usuario;
    }
}
