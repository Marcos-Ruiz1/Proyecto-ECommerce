
package persistencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entidades.Usuario;

/**
 *
 * @author marcos_zr
 */
public class UsuarioDAO extends Conexion{
   
    public UsuarioDAO(){
        
    }
    
    public boolean aunteticacion(Usuario usuario){
        usuario.getNombre();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "select usuarios.nombre from usuarios where nombre=?";
            System.out.println("Consulta es " + consulta);
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario.getNombre());
       
            rs = pst.executeQuery();
            
            if(rs.next()){
                System.out.println("usuario valido");
                return true;
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
        System.out.println("usuario no valido");
        return false;
    }
    
    public boolean registrar(Usuario usuario){
        PreparedStatement pst = null;
      
        try{
            String consulta = "INSERT INTO usuarios (nombre, email, telefono, direccion, contrasena) VALUES (?, ?, ?, ?, ?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getTelefono());
            pst.setString(4, usuario.getDireccion());
            pst.setString(5, usuario.getContrasena());
            
            
            if(pst.executeUpdate() == 1){
                System.out.println("Usuario registrado con exito");
                return true;
            }
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
        
        System.out.println("Usuario no registrado con exito");
        return false;
    }
}
