
package negocio;
import entidades.Pedido;
import persistencia.PedidoDAO;
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
        
        for (int i = 0; i < pedido.getCarrito().getIdProducto().size(); i++) {
            int idProducto = pedido.getCarrito().getIdProducto().get(i);
            // Ahora puedes utilizar idProducto como una variable int
            System.out.println("ID del producto: " + idProducto);
            
        }
        
//        for (int idProducto : productos) {
//            // Ahora puedes utilizar idProducto como una variable int
//            System.out.println("ID del producto: " + idProducto);
//        }
        
        pedidoDAO.registrar(pedido);
    }
    
    
}
