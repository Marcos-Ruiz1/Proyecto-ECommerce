/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author 216100 216690
 */
public class Producto {
    
    private String nombre; 
    private String descripcion;
    private String precio;
    //private String idCategoria  //consultar con equipo para saber si lo pondremos o no.

    public Producto() {
    }
    /**
     * meto que ayuda a registrar un producto.
     * @param nombre Nombre del producto. 
     * @param descripcion Descripción del producto.
     * @param precio Precio del producto.
     */
    public Producto(String nombre, String descripcion,String precio ){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
    
}
