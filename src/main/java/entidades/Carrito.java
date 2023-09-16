
package entidades;
import java.util.ArrayList;

/**
 *
 * @author marcos_zr
 */
public class Carrito {
    
    private int idCarrito;
    private int idUsuario;
    private ArrayList<Integer> idProducto = new ArrayList<Integer>();
    
    public Carrito(){
        
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
    
    
    
}
