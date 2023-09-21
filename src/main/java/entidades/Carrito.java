
package entidades;
import java.util.ArrayList;

/**
 *
 * @author Equipo 2
 */
public class Carrito {
    
    private int idCarrito;
    private int idUsuario;
    private int idPedido;
    private ArrayList<Integer> idProducto = new ArrayList<Integer>();
    /**
     * Constructor vacio.
     */
    public Carrito(){
        
    }
    /**
     * Metodo que genera el carrito.
     * @param idUsuario Id del usuario
     * @param idPedido Id del pedido
     * @param idProducto Id del producto
     */
    public Carrito(int idUsuario, int idPedido, ArrayList<Integer> idProducto){
        this.idUsuario = idUsuario;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }
    
    /**
     * Obtiene el id del carrito
     * @return retorna el id del carrito
     */
    public int getIdCarrito() {
        return idCarrito;
    }
    
    /**
     * Asigna el id de carrito
     * @param idCarrito id del carrito
     */
    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }
    
    /**
     * Obtiene el id del usuario
     * @return retorna el id del usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }
    
    /**
     * Obtiene el id del usuario
     * @param idUsuario Id del usuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    /**
     * Array donde se obtiene el id del producto
     * @return retorna una lista con los id del producto.
     */
    public ArrayList<Integer> getIdProducto() {
        return idProducto;
    }
    
    /**
     * Asigna el id con base a la lista de id producto
     * @param idProducto id producto
     */
    public void setIdProducto(ArrayList<Integer> idProducto) {
        this.idProducto = idProducto;
    }
        
    /**
     * Obtiene el id del pedido
     * @return Retorna el id del pedido
     */
    public int getIdPedido() {
        return idPedido;
    }
    
    /**
     * Asigna el id del pedido
     * @param idPedido Id del pedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    
    
}
