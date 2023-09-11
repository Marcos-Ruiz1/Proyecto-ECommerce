/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoe.commerce;
import controlador.Conexion;
import controlador.Consultas;
/**
 *
 * @author marcos_zr
 */
public class ProyectoECommerce {

    public static void main(String[] args) {
        
        Conexion conex = new Conexion();
        
        conex.getConexion();
        
        Consultas sql = new Consultas();
        
        sql.aunteticacion("marcos antonio zazueta ruiz");
    }
}
