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
    private int idProducto;
    private String nombre; 
    private String descripcion;
    private float precio;
    private int idCategoria;  //consultar con equipo para saber si lo pondremos o no.

    public Producto() {
    }
    /**
     * meto que ayuda a registrar un producto.
     * @param nombre Nombre del producto. 
     * @param descripcion Descripción del producto.
     * @param precio Precio del producto.
     * @param idCategoria
     */
    public Producto(int idProducto, String nombre, String descripcion,float precio, int idCategoria){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idCategoria = idCategoria;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
    
    
}
