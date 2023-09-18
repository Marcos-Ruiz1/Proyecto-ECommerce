
package persistencia;
import servicio.Fecha;
import entidades.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author marcos_zr
 */
public class PedidoDAO extends Conexion{
    
    
    public boolean registrar(Pedido pedido){
        PreparedStatement pst = null;
      
        try{
            String consulta = "INSERT INTO pedidos (fechaDePedido, cantidad, idUsuario) VALUES (?, ?, ?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, pedido.getFechaDePedido());
            pst.setFloat(2, pedido.getCantidad());
            pst.setInt(3, pedido.getIdUsuario());
            
            
            
            if(pst.executeUpdate() == 1){
                System.out.println("Pedido registrado con exito");
                return true;
            }
        } catch(Exception e){
            System.out.println("Error en " + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.out.println("Error en " + e);
            }
        }
        
        System.out.println("Pedido no registrado con exito");
        return false;
    }
    
    
    public Pedido obtener(int idUsuario, Fecha fecha) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        Pedido pedido = null;

        try {
           
            String consulta = "SELECT * FROM Pedidos WHERE idUsuario = ? AND fechaDePedido=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, idUsuario);
            pst.setString(2, fecha.getFecha());
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
        } finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.out.println("Error en " + e);
            }
        }

        return pedido;
    }
}
