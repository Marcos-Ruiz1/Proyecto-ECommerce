/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoe.commerce;
import persistencia.Conexion;
import Interfaz.frmUsuario;
import persistencia.Consultas;
import entidades.Usuario;
import negocio.Usuarios;
import entidades.Carrito;
import entidades.Pedido;
import negocio.Pedidos;
import java.util.ArrayList;
import entidades.*;
import negocio.*;
/**
 *
 * @author marcos_zr
 */
public class ProyectoECommerce {

    public static void main(String[] args) {
        
        Conexion conex = new Conexion();
        
        conex.getConexion();
        
        Producto productoPrueba = null;
        Productos negocioProductos = new Productos();
        
        productoPrueba = negocioProductos.obtenerProducto(2);
        System.out.println(productoPrueba.getNombre() + " " + productoPrueba.getPrecio());
        
        
//        
//        ArrayList<Integer> productos = new ArrayList<>();
//        
//        productos.add(1);
//        Carrito carrito = new Carrito();
//        carrito.getIdProducto().add(1);
//        
//        Pedido pedido = new Pedido("2023-09-15", 0, 13, carrito);
//        
//        Pedidos negocioPedidos = new Pedidos();
//        
//        negocioPedidos.registrarPedido(pedido);
    }
}
