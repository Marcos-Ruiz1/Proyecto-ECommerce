
package negocio;
import entidades.Pedido;
import entidades.Producto;
import persistencia.PedidoDAO;
import servicio.Fecha;

//import persistencia.;
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
    
    
}
