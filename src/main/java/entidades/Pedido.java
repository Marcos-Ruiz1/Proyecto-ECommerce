
package entidades;
/**
 *
 * @author marcos_zr
 */
public class Pedido {
    
    private int idPedido;
    private String fechaDePedido;
    private float cantidad;
    private int idUsuario;
    private Carrito carrito;
    
    public Pedido(){
        
    }
    
    /**
     * 
     * @param idPedido
     * @param fechaDePedido
     * @param cantidad
     * @param idUsuario 
     */
    public Pedido(int idPedido, String fechaDePedido, float cantidad, int idUsuario){
        this.idPedido = idPedido;
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
    }
    
    /**
     * 
     * @param fechaDePedido
     * @param cantidad
     * @param idUsuario 
     */
    public Pedido(String fechaDePedido, float cantidad, int idUsuario){
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
    }
    
    /**
     * 
     * @param fechaDePedido
     * @param cantidad
     * @param idUsuario
     * @param carrito 
     */
    public Pedido(String fechaDePedido, float cantidad, int idUsuario, Carrito carrito){
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
        this.carrito = carrito;
    }

    /**
     * 
     * @return 
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * 
     * @param idPedido 
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * 
     * @return 
     */
    public String getFechaDePedido() {
        return fechaDePedido;
    }

    /**
     * 
     * @param fechaDePedido 
     */
    public void setFechaDePedido(String fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    /**
     * 
     * @return 
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * 
     * @param cantidad 
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
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

    /**
     * 
     * @return 
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * 
     * @param carrito 
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
}
