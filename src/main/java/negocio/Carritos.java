
package negocio;
import entidades.Carrito;
import persistencia.CarritoDAO;

/**
 *
 * @author marcos_zr
 */
public class Carritos {
    
    public Carritos(){
        
    }
    
    public void registrarCarrito(Carrito carrito){
        
        CarritoDAO carritoDAO = new CarritoDAO();
        
        carritoDAO.registrar(carrito);
    }
}
