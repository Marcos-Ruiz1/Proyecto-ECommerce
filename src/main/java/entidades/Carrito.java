
package entidades;
import java.util.ArrayList;

/**
 *
 * @author marcos_zr
 */
public class Carrito {
    
    private int idCarrito;
    private int idUsuario;
    private int idPedido;
    private ArrayList<Integer> idProducto = new ArrayList<Integer>();
    
    public Carrito(){
        
    }
    
    public Carrito(int idUsuario, int idPedido, ArrayList<Integer> idProducto){
        this.idUsuario = idUsuario;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }
    

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Integer> getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(ArrayList<Integer> idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    
    
}
