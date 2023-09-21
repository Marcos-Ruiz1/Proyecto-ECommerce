/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import entidades.Carrito;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Equipo 2
 */
public class CarritoDAO extends Conexion{
    /**
     * Constructor vacio.
     */
    public CarritoDAO(){
        
    }
    /**
 * Registra los productos en el carrito en la base de datos.
 *
 * @param carrito El objeto de tipo Carrito que contiene los productos a registrar.
 * @return true si la operación de registro fue exitosa, false en caso contrario.
 */
    public boolean registrar(Carrito carrito){
        PreparedStatement pst = null;
      
        try{
            String consulta = "INSERT INTO ProductosPedidos(idPedido, idProducto) VALUES (?, ?)";
            pst = getConexion().prepareStatement(consulta);
            
            for (Integer idProducto : carrito.getIdProducto()) {
                pst.setInt(1, carrito.getIdUsuario());
                pst.setInt(2, idProducto);
                pst.addBatch(); // Agregar la consulta al lote
            }
            
            int[] resultados = pst.executeBatch(); // Ejecutar todas las inserciones en lote
            
            // Verificar si todas las inserciones tuvieron éxito
            for (int resultado : resultados) {
                if (resultado != 1) {
                    getConexion().rollback(); // Deshacer la transacción en caso de error
                    return false;
                }
            }
            
            getConexion().commit(); // Confirmar la transacción si todo fue exitoso
            System.out.println("Carrito registrado con éxito");
            return true;
            
        } catch(Exception e){
            System.out.println("Error en " + e);
        }finally{
            try{
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch(Exception e){
                System.out.println("Error en " + e);
            }
        }
        
        System.out.println("Carrito no registrado con exito");
        return false;
    }
    
   /**
 * Obtiene un carrito de productos de la base de datos según algún criterio.
 *
 * @param carrito El objeto de tipo Carrito que contiene información sobre el carrito a buscar.
 * @return El carrito de productos encontrado, o null si no se encuentra.
 */
    public Carrito obtener(Carrito carrito){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "select ProductosPedidos.idProducto from ProductosPedidos where idProducto=?";
            System.out.println("Consulta es " + consulta);
            pst = getConexion().prepareStatement(consulta);
            pst.setInt(1, 1);
       
            rs = pst.executeQuery();
            
            if(rs.next()){
                System.out.println("carrito valido");
                return carrito;
            }
            
            
        } catch(Exception e){
            System.out.println("Error en: " + e);
        }finally{
            try{
                if(getConexion() != null){
                    getConexion().close();
                }
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            } catch (Exception e){
                System.out.println("Error en " + e);
            }
        }
        System.out.println("carrito no valido");
        return null;
    }
}
