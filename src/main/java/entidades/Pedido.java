
package entidades;
/**
 *
 * @author Equipo 2
 */
public class Pedido {
    
    private int idPedido;
    private String fechaDePedido;
    private float cantidad;
    private int idUsuario;
    private Carrito carrito;
    /**
     * Constructor vacio
     */
    public Pedido(){
        
    }
    
    /**
     *  Metodo que crea un pedido.
     * @param idPedido Id del pedido.
     * @param fechaDePedido Fecha del pedido.
     * @param cantidad Cantidad del pedido.
     * @param idUsuario  Id del usuario.
     */
    public Pedido(int idPedido, String fechaDePedido, float cantidad, int idUsuario){
        this.idPedido = idPedido;
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
    }
    
    /**
     *  Metodo que crea un pedido sin el id pedido.
     * @param fechaDePedido Fecha de pedido.
     * @param cantidad Cantidad del pedido.
     * @param idUsuario Id de usuario del pedido.
     */
    public Pedido(String fechaDePedido, float cantidad, int idUsuario){
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
    }
    
    /**
     *  Metodo que genera un pedido con el atributo de carrito.
     * @param fechaDePedido Fecha de pedido.
     * @param cantidad Cantidad de pedido.
     * @param idUsuario Id del usuario
     * @param carrito Carrito del pedido.
     */
    public Pedido(String fechaDePedido, float cantidad, int idUsuario, Carrito carrito){
        this.fechaDePedido = fechaDePedido;
        this.cantidad = cantidad;
        this.idUsuario = idUsuario;
        this.carrito = carrito;
    }

    /**
     *  Obtiene el id del pedido
     * @return retorna el id del pedido.
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     *  Asigna el id del pedido
     * @param idPedido Id del pedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     *  Obtiene la fecha del pedido
     * @return retorna la fecha del pedido
     */
    public String getFechaDePedido() {
        return fechaDePedido;
    }

    /**
     *  Asigna la fecha del pedido
     * @param fechaDePedido Fecha del pedido
     */
    public void setFechaDePedido(String fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    /**
     * Obtiene la cantidad 
     * @return Cantidad del pedido
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Asigna la cantidad del pedido
     * @param cantidad Cantidad del pedido
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el id del usuario
     * @return id del Carrito
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Asigna el id del usuario
     * @param idUsuario Id del usuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el carrito
     * @return retorna el carrito
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * Asigna el Carrito
     * @param carrito Carrito
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
}
