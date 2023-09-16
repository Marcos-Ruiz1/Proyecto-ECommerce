
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
    
    public Pedido(){
        
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
    
    
    
}
