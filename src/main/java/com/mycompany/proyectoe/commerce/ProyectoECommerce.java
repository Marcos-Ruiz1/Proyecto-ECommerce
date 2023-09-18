

package com.mycompany.proyectoe.commerce;
import persistencia.Conexion;
import Interfaz.frmUsuario;
import entidades.Usuario;
import negocio.Usuarios;
import entidades.Carrito;
import entidades.Pedido;
import negocio.Pedidos;
import java.util.ArrayList;
import entidades.*;
import negocio.*;
import servicio.*;
/**
 *
 * @author marcos_zr
 */
public class ProyectoECommerce {

    public static void main(String[] args) {
        
        Conexion conex = new Conexion();
        
        conex.getConexion();
        
        
//        ArrayList<Integer> productosEnCarrito = new ArrayList<>();
//        
//        productosEnCarrito.add(2);
//        productosEnCarrito.add(1);
//        productosEnCarrito.add(1);
//        productosEnCarrito.add(1);
//        Carrito carrito = new Carrito(12, 0, productosEnCarrito);
//
//        Fecha fecha = new Fecha(01, 06, 2001);
//        
//        
//        Pedido pedido = new Pedido(fecha.getFecha(), 0, 12, carrito);
//        
//        Pedidos negocioPedidos = new Pedidos();
//        Carritos negocioCarritos = new Carritos();
//        
//        negocioPedidos.registrarPedido(pedido);
//        Pedido pedidoObtenido = negocioPedidos.obtenerPedido(12, fecha);
//        
//        System.out.println(pedidoObtenido.getIdPedido() + " " + pedidoObtenido.getFechaDePedido() + 
//                " " + pedidoObtenido.getCantidad() + " " + pedidoObtenido.getIdUsuario());
        
    }
}
