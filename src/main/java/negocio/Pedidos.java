
package negocio;
import entidades.Pedido;
import entidades.Producto;
import persistencia.PedidoDAO;
import servicio.Fecha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcos_zr
 */
public class Pedidos {
    
    public Pedidos(){
        
    }
    
    public void registrarPedido(Pedido pedido){
        
        PedidoDAO pedidoDAO = new PedidoDAO();
        Productos productos = new Productos();
        Producto producto = null;
        float sumaPrecioProductos = 0.0f;
        
        for (int i = 0; i < pedido.getCarrito().getIdProducto().size(); i++) {
            int idProducto = pedido.getCarrito().getIdProducto().get(i);
            // Ahora puedes utilizar idProducto como una variable int
            System.out.println("ID del producto: " + idProducto);
            producto = productos.obtenerProducto(idProducto);
            
            sumaPrecioProductos = sumaPrecioProductos + producto.getPrecio();
        }
        
        pedido.setCantidad(sumaPrecioProductos);

        
        pedidoDAO.registrar(pedido);
    }
    
    public Pedido obtenerPedido(int idUsuario, Fecha fecha){
        Pedido pedido = null;
        PedidoDAO pedidoDAO = new PedidoDAO();
        
        pedido = pedidoDAO.obtener(idUsuario, fecha);
        
        return pedido;
    }
    
    /**
     * Método obtenerPedidos que recibe como parámetro el id del usuario para conectarse con la capa de persistencia.
     * Regresa la lista de pedidos obtenidos de la capa de persistencia
     * @param idUsuario el identificador del usuario en la base de datos
     * @return la lista de pedidos del usuario
     */
    public List<Pedido> obtenerPedidos(int idUsuario){
        List<Pedido> pedidos = null;
        
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidos = pedidoDAO.obtenerPedidos(idUsuario);
        
        return pedidos;
        
    }
    
    
}
