package persistencia;

import java.sql.PreparedStatement;
import entidades.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Equipo 2
 */
public class ProductoDAO extends Conexion {

    /**
     * Constructor vacio.
     */
    public ProductoDAO() {

    }

    /**
     * Registra un producto en la base de datos.
     *
     * @param producto El objeto de tipo Producto que se va a registrar.
     * @return true si la operación de registro fue exitosa, false en caso
     * contrario.
     */
    public boolean registrar(Producto producto) {
        PreparedStatement pst = null;

        try {
            String consulta = "INSERT INTO  productos(nombre, direccion, precio) VALUES(?, ?, ?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, producto.getNombre());
            pst.setString(2, producto.getDescripcion());
            pst.setFloat(3, producto.getPrecio());

            if (pst.executeUpdate() == 1) {
                System.out.println("Producto creado.");
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
        System.out.println("Producto no registrado");
        return false;
    }

    /**
     * Obtiene un producto de la base de datos según su ID.
     *
     * @param idProducto El ID del producto a obtener.
     * @return El objeto de tipo Producto correspondiente al producto
     * encontrado, o null si no se encuentra.
     */
    public Producto obtener(int idProducto) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Producto producto = null;

        try {

            String consulta = "SELECT * FROM productos WHERE idProducto = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idProducto);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Obtener datos del resultado y crear un objeto Usuario
                int id = rs.getInt("idProducto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                float precio = rs.getFloat("precio");
                int idCategoria = rs.getInt("idCategoria");

                producto = new Producto(id, nombre, descripcion, precio, idCategoria);
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

        return producto;
    }

}
