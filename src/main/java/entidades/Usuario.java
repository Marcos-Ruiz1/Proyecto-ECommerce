/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Equipo2
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String contrasena;
    private String email;
    private String telefono;
    private String direccion;

    /**
     * Constructor vacio
     */
    public Usuario() {

    }

    /**
     * método que ayuda a registrar un usuario
     *
     * @param nombre nombre del usuario
     * @param contrasena contraseña del usuario
     * @param email email del usuario
     * @param telefono telefono del usuario
     * @param direccion dirección del usuario
     */
    public Usuario(String nombre, String contrasena, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * método que ayuda a registrar un usuario con parametro idUsuario
     *
     * @param idUsuario id del usuario
     * @param nombre nombre del usuario
     * @param contrasena contraseña del usuario
     * @param email email del usuario
     * @param telefono telefono del usuario
     * @param direccion dirección del usuario
     */
    public Usuario(int idUsuario, String nombre, String contrasena, String email, String telefono, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene nombre del usuario
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del usuario
     *
     * @param nombre asignado del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la contraseña del usuario
     *
     * @return contraseña del usuario
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Asigna la contraseña del usuario
     *
     * @param contrasena del usuario
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el email del usuario
     *
     * @return el email del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Asigna el email del usuario
     *
     * @param email asignado del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el telefono del usuario
     *
     * @return telefono obtenido del usuario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Asigna el telefono del usuario
     *
     * @param telefono asignado del usuario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del usuario
     *
     * @return Dirección del usuario
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Asigna la dirección del usuario
     *
     * @param direccion asignada del usuario
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el id del usuario
     *
     * @return id del usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Asigna el id del usuario
     *
     * @param idUsuario asignado
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

}
