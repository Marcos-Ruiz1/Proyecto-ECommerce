
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
    public Carrito obtenerCarrito(Carrito idCarrito){
        Carrito carrito = null;
        CarritoDAO carritoDAO = new CarritoDAO();
        
        carrito = carritoDAO.obtener(idCarrito);
        return carrito;
    }

}
