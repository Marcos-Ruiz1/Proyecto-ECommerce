/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import entidades.Producto;
import persistencia.ProductoDAO;
/**
 *
 * @author marcos_zr
 */
public class Productos {
    
    
    /**
     * Método obtenerProducto que obtiene un producto contectandose con el DAO del producto
     * @param idProducto el identificador del producto que se desea obtener desde la base de datos
     * @return el producto buscado en la base de datos
     */
    public Producto obtenerProducto(int idProducto){
        Producto producto = null;
        ProductoDAO productoDAO = new ProductoDAO();
        
        producto = productoDAO.obtenerProducto(idProducto);
        
        return producto;
    }
}
