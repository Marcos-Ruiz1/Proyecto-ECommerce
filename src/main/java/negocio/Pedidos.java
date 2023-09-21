
package negocio;
import entidades.Pedido;
import entidades.Producto;
import persistencia.PedidoDAO;
import java.util.List;

/**
 *
 * @author Equipo 2
 */
public class Pedidos {
    /**
     * Constructor vacio
     */
    public Pedidos(){
        
    }
    /**
     * Metodo que registra un pedido
     * @param pedido pedido del registro
     */
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
    
    /**
     * Metodo obtener Pedido que recibe como parametro el id del usuario y una fecha
     * @param idUsuario Id del usuario
     * @return retorna un pedido con los parametros IdUsuario y una fecha
     */
    public Pedido obtenerPedido(int idUsuario){
        Pedido pedido = null;
        PedidoDAO pedidoDAO = new PedidoDAO();
        
        pedido = pedidoDAO.obtener(idUsuario);
        
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
