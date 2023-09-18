
package negocio;
import entidades.Usuario;
import persistencia.UsuarioDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public boolean validarContrasena(String contrasena){
        
        // La contraseña debe contener al menos una letra mayúscula, al menos un dígito,
        // al menos un carácter especial y tener una longitud de entre 8 y 10 caracteres.
        String expresionRegular = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,10}$";
        
        Pattern pattern = Pattern.compile(expresionRegular);
        
        Matcher matcher = pattern.matcher(contrasena);
        
        if(matcher.matches()){
            return true;
        }
        
        return false;
    }
    
    public Usuario obtenerUsuario(int idUsuario){
        Usuario usuario = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuario = usuarioDAO.obtener(idUsuario);
        
        return usuario;
    }
    
    
}
