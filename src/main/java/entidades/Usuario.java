/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author marcos_zr
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String contrasena;
    private String email;
    private String telefono;
    private String direccion;
    
    public Usuario(){
        
    }
    
    /**
     * 
     * @param nombre
     * @param contrasena
     * @param email
     * @param telefono
     * @param direccion 
     */
    public Usuario(String nombre, String contrasena, String email, String telefono, String direccion){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    /**
     * 
     * @param idUsuario
     * @param nombre
     * @param contrasena
     * @param email
     * @param telefono
     * @param direccion 
     */
    public Usuario(int idUsuario, String nombre, String contrasena, String email, String telefono, String direccion){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * 
     * @param contrasena 
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return 
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * 
     * @param idUsuario 
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
