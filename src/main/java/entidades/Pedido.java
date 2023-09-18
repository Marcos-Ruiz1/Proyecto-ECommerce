
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
    
    public Pedido(int idPedido, String fechaDePedido, float cantidad, int idUsuario){
        this.idPedido = idPedido;
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
    }
    
    public Pedido(String fechaDePedido, float cantidad, int idUsuario){
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
    }
    
    public Pedido(String fechaDePedido, float cantidad, int idUsuario, Carrito carrito){
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
        this.carrito = carrito;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(String fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
}
