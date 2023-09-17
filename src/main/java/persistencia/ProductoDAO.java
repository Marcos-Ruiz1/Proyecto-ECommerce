package persistencia;
import java.sql.PreparedStatement;
import entidades.Producto;

/**
 *
 * @author 216100
 */
public class ProductoDAO extends Conexion {

    public ProductoDAO() {
    }
    /**
     * Registro de producto.
     * @param producto crea el producto para la base de datos
     * @return retorna el producto en la base de datos.
     */
  public boolean registrar (Producto producto){
      PreparedStatement pst = null;
      
      try{
          String consulta = "INSERT INTO  productos(nombre, direccion, precio) VALUES(?, ?, ?)";
          pst = getConexion().prepareStatement(consulta);
          pst.setString(1, producto.getNombre());
          pst.setString(2, producto.getDescripcion());
          pst.setString(3, producto.getPrecio());
          
          if(pst.executeUpdate() == 1){
              System.out.println("Producto creado.");
              return true;
          }
      }catch(Exception e){
          System.out.println("Error en "+e);
      }finally{
          try{
              if(getConexion() != null)getConexion().close();
              if(pst != null)pst.close();
          }catch(Exception e){
              System.out.println("Error en "+e);
          }
      }
      System.out.println("Producto no registrado");
      return false;
  }
    

}
