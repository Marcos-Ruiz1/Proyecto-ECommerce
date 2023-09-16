
package negocio;
import entidades.Pedido;
import persistencia.PedidoDAO;
/**
 *
 * @author marcos_zr
 */
public class Pedidos {
    
    public Pedidos(){
        
    }
    
    public void registrarPedido(Pedido pedido){
        
        PedidoDAO pedidoDAO = new PedidoDAO();
        
        pedidoDAO.registrar(pedido);
    }
    
    
}
