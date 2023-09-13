/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoe.commerce;
import persistencia.Conexion;
import persistencia.Consultas;
import entidades.Usuario;
import negocio.Usuarios;
/**
 *
 * @author marcos_zr
 */
public class ProyectoECommerce {

    public static void main(String[] args) {
        
        Conexion conex = new Conexion();
        
        conex.getConexion();
        
        Usuario usuarioNuevo = new Usuario("Juan Perez", "password1", "juan@gmail.com", 
                "123-456-7890", "Calle 123, Ciudad X");
        
        Usuarios negocioUsuarios = new Usuarios();
        
        negocioUsuarios.registrarUsuario(usuarioNuevo);
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
