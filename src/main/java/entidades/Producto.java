/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Equipo2 
 */
public class Producto {

    private int idProducto;
    private String nombre;
    private String descripcion;
    private float precio;
    private int idCategoria;

    /**
     * Constructor de la clase
     */
    public Producto() {
    }

    /**
     * metodo que ayuda a registrar un producto.
     *
     * @param nombre Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param precio Precio del producto.
     * @param idCategoria
     */
    public Producto(int idProducto, String nombre, String descripcion, float precio, int idCategoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idCategoria = idCategoria;
    }

    /**
     * Obtiene el nombre del producto
     *
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nombre del producto
     *
     * @param nombre del producto asignado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto
     *
     * @return la descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna la descripción del producto
     *
     * @param descripcion del producto asignado
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio del producto
     *
     * @return regresa el precio del producto
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Asigna el precio del producto
     *
     * @param precio del producto asignado
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el id de la categoria del producto
     *
     * @return id de la categoria del producto
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Asigna el id de la categoria
     *
     * @param idCategoria del producto asignado
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * Obtiene el id del producto
     *
     * @return id del producto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Asigna el id del producto
     *
     * @param idProducto asignado
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

}
