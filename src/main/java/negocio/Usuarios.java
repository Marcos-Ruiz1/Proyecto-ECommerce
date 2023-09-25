package negocio;

import entidades.Usuario;
import persistencia.UsuarioDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Equipo 2
 */
public class Usuarios {

    public Usuarios() {

    }

    /**
     *
     * @param usuario
     * @return
     */
    public boolean autentificarUsuario(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //Mandamos el usuario una vez aplicadas las reglas de negocio a la capa de persistencia
        if (usuarioDAO.aunteticacion(usuario)) {
            return true;
        }

        return false;
    }

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param usuario El objeto de tipo Usuario que representa al usuario que se
     * va a registrar.
     */
    public void registrarUsuario(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuarioDAO.registrar(usuario);

    }

    
    /**
     * Método eliminarUsuario que recibe como parámetro un usuario y es eliminado de la base de datos
     * @param usuario el usuario a eliminar
     */
    public boolean eliminarUsuario(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        return usuarioDAO.eliminar(usuario);

    }
    
    /**
     * Método actualizarUsuario que recibe como parámetro un usuario y actualiza sus datos en la base de datos
     * @param usuario el usuario a actualizar sus datos
     */
    public boolean actualizarUsuario(Usuario usuario) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        return usuarioDAO.actualizar(usuario);

    }

    
    /**
     * Valida si una contraseña cumple con los requisitos de complejidad
     * establecidos.
     *
     * @param contrasena La contraseña a validar.
     * @return true si la contraseña cumple con los requisitos, false en caso
     * contrario.
     */
    public boolean validarContrasena(String contrasena) {

        // La contraseña debe contener al menos una letra mayúscula, al menos un dígito,
        // al menos un carácter especial y tener una longitud de entre 8 y 10 caracteres.
        String expresionRegular = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,10}$";

        Pattern pattern = Pattern.compile(expresionRegular);

        Matcher matcher = pattern.matcher(contrasena);

        if (matcher.matches()) {
            return true;
        }

        return false;
    }

    /**
     * Obtiene un usuario de la base de datos utilizando su identificador único.
     *
     * @param idUsuario El identificador único del usuario a obtener.
     * @return El objeto de tipo Usuario correspondiente al usuario obtenido, o
     * null si no se encuentra.
     */
    public Usuario obtenerUsuario(int idUsuario) {
        Usuario usuario = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuario = usuarioDAO.obtener(idUsuario);

        return usuario;
    }

    /**
     * Obtiene un usuario de la base de datos utilizando el correo electrónico y
     * la contraseña proporcionados.
     *
     * @param email El correo electrónico del usuario.
     * @param contrasena La contraseña del usuario.
     * @return El objeto de tipo Usuario correspondiente al usuario autenticado,
     * o null si no se encuentra o la contraseña es incorrecta.
     */
    public Usuario obtenerUsuario(String email, String contrasena) {
        Usuario usuario = null;
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuario = usuarioDAO.obtener(email, contrasena);

        return usuario;
    }

}
