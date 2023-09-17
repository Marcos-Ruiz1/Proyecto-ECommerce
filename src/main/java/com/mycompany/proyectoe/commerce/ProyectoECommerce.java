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
/**
 *
 * @author marcos_zr
 */
public class ProyectoECommerce {

    public static void main(String[] args) {
        
        Conexion conex = new Conexion();
        
        conex.getConexion();
        
        ArrayList<Integer> productos = new ArrayList<>();
        
        productos.add(1);
        Carrito carrito = new Carrito();
        carrito.getIdProducto().add(1);
        
        Pedido pedido = new Pedido("2023-09-15", 0, 13, carrito);
        
        Pedidos negocioPedidos = new Pedidos();
        
        negocioPedidos.registrarPedido(pedido);
//        
//        Carrito carrito = new Carrito(13, productos);
//        frmUsuario frameUsuario = new frmUsuario();
//        
//        frameUsuario.setVisible(true);
        
//        Usuario usuarioNuevo = new Usuario("Juan Perez", "password1", "juan@gmail.com", 
//                "123-456-7890", "Calle 123, Ciudad X");
//        
//        Usuarios negocioUsuarios = new Usuarios();
//        
//        negocioUsuarios.registrarUsuario(usuarioNuevo);
 //Creamos un usuario de prueba, estos valores serían los que se obtienen de la capa de presentación es decir la interfaz gráfica
//        Usuario usuarioPrueba = new Usuario("marcos antonio zazueta ruiz", "contraseña", 
//                "marcos.zazueta216354@potros.itson.edu.mx","6441316354", 
//                "Ciudad Obregón, Sonora. Colonia Nueva Palmira cerrada desierto #6032");
//        
//        Usuarios negocioUsuarios = new Usuarios();
//        
//        
//        //Mandamos el usuario creado en la interfaz grafica hacía la capa de Negocio
//        negocioUsuarios.autentificarUsuario(usuarioPrueba);
    }
}
