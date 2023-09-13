
package negocio;
import entidades.Usuario;
import persistencia.UsuarioDAO;
/**
 *
 * @author marcos_zr
 */
public class Usuarios {
    
    
    public Usuarios(){
        
    }
    
    public void autentificarUsuario(Usuario usuario){
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //Lógica de negocio: Todos los nombres deberán ser en minúscula
        usuario.setNombre(usuario.getNombre().toLowerCase());
        
        //Mandamos el usuario una vez aplicadas las reglas de negocio a la capa de persistencia
        usuarioDAO.aunteticacion(usuario);
    }
    
    public void registrarUsuario(Usuario usuario){
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        
        usuarioDAO.registrar(usuario);
        
    }
    
    
}
