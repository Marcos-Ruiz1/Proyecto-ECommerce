package persistencia;

import entidades.Pedido;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Equipo2
 */
public class PedidoDAO extends Conexion {

    /**
     * Registra un pedido en la base de datos.
     *
     * @param pedido El pedido a registrar.
     * @return true si el pedido se registra con éxito, false en caso contrario.
     */
    public boolean registrar(Pedido pedido) {
        PreparedStatement pst = null;

        try {
            String consulta = "INSERT INTO pedidos (fechaDePedido, cantidad, idUsuario) VALUES (?, ?, ?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, pedido.getFechaDePedido());
            pst.setFloat(2, pedido.getCantidad());
            pst.setInt(3, pedido.getIdUsuario());

            if (pst.executeUpdate() == 1) {
                System.out.println("Pedido registrado con exito");
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

        System.out.println("Pedido no registrado con exito");
        return false;
    }

    /**
     * Obtiene un pedido de la base de datos según el ID de usuario y la fecha
     * de pedido.
     *
     * @param idUsuario El ID del usuario asociado al pedido.
     * @return Un objeto Pedido si se encuentra en la base de datos, o null si
     * no se encuentra.
     */
    public Pedido obtener(int idUsuario) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Pedido pedido = null;

        try {

            String consulta = "SELECT * FROM Pedidos WHERE idUsuario = ? ";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idUsuario);
            rs = pst.executeQuery();

            if (rs.next()) {
                // Obtener datos del resultado y crear un objeto Usuario
                int id = rs.getInt("idPedido");
                String fechaDePedido = rs.getString("fechaDePedido");
                float cantidad = rs.getFloat("cantidad");
                int idDelUsuario = rs.getInt("idUsuario");

                pedido = new Pedido(id, fechaDePedido, cantidad, idDelUsuario);
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

        return pedido;
    }

    /**
     * Método obtenerPedidos que recibe como parámetro el id del usuario y para
     * realizar una consulta con la base de datos. Regresa una lista de pedidos
     * que tiene el usuario
     *
     * @param idUsuario el identificador del usuario en la base de datos
     * @return la lista de pedidos del usuario
     */
    public List<Pedido> obtenerPedidos(int idUsuario) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Pedido> pedidos = new ArrayList<>();

        try {
            String consulta = "CALL ObtenerPedidosPorUsuario(?)"; //Sentencia del procedimiento almacenado
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idUsuario);
            rs = pst.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("idPedido");
                String fechaDePedido = rs.getString("fechaDePedido");
                float cantidad = rs.getFloat("cantidad");

                Pedido pedido = new Pedido(id, fechaDePedido, cantidad, idUsuario);
                pedidos.add(pedido);
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

        return pedidos;
    }

}
