package com.mycompany.proyectoe.commerce;

import Interfaz.frmInicio;
import persistencia.Conexion;


/**
 *
 * @author marcos_zr
 */
public class ProyectoECommerce {

    public static void main(String[] args) {

        Conexion conex = new Conexion();

        conex.getConexion();
        
        frmInicio log = new frmInicio();
        log.setVisible(true);     


    }
}
