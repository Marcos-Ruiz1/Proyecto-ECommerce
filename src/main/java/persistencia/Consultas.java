/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author marcos_zr
 */
public class Consultas extends Conexion{
    
    public Consultas(){
        
    }
    
    public boolean aunteticacion(String nombre){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String consulta = "select usuarios.nombre from usuarios where nombre=?";
            System.out.println("Consulta es " + consulta);
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
       
            rs = pst.executeQuery();
            
            if(rs.next()){
                System.out.println("usuario valido");
                return true;
            }
            
            
        } catch(Exception e){
            System.out.println("Error en: " + e);
        }finally{
            try{
                if(getConexion() != null){
                    getConexion().close();
                }
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            } catch (Exception e){
                System.out.println("Error en " + e);
            }
        }
        System.out.println("usuario no valido");
        return false;
    }
}
