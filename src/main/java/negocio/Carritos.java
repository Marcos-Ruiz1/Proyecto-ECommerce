
package negocio;
import entidades.Carrito;
import persistencia.CarritoDAO;

/**
 *
 * @author Equipo 2
 */
public class Carritos {
    /**
     * constructor vacio.
     */
    public Carritos(){
        
    }
    
    /**
     * Metodo para registrar el carrito
     * @param carrito carrito
     */
    public void registrarCarrito(Carrito carrito){
        
        CarritoDAO carritoDAO = new CarritoDAO();
        
        carritoDAO.registrar(carrito);
    }
    
    /**
     * Obtiene el carrito con su id
     * @param idCarrito Id de carrito
     * @return Retorna el id del carrito
     */
    public Carrito obtenerCarrito(Carrito idCarrito){
        Carrito carrito = null;
        CarritoDAO carritoDAO = new CarritoDAO();
        
        carrito = carritoDAO.obtener(idCarrito);
        return carrito;
    }
    

}
