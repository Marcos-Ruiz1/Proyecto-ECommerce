/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import entidades.Carrito;
import entidades.Producto;
import java.util.ArrayList;
/**
 *
 * @author gaspa
 */
public class TMCarrito implements TableModel{
//    private List<Carrito> carrito;
    private List<Producto> producto;
    
    public TMCarrito(/*List <Carrito> listaC, */List <Producto> listaP){
//        carrito=listaC;
        producto=listaP;
    }
    @Override
    public int getRowCount() {
//        return carrito.size();
          return producto.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo=null;
        switch(columnIndex){
            case 0:{
                titulo = "Producto";
                break;
            }
            case 1:{
                titulo = "Precio";
                break;
            }
            case 2:{
                titulo = "Cantidad";
                break;
            }
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0:{
                return String.class;
            }
            case 1:{
                return int.class;
            }
            case 2:{
                return int.class;
            }
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        Carrito c = carrito.get(rowIndex);
        Producto p = producto.get(rowIndex);
        int cantidad =0;
        switch(columnIndex){
            case 0 -> {
                return p.getNombre();
                
            }
            case 1 -> {
                return p.getPrecio();
                
            }
            case 2 -> {
                return cantidad;
                
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        Carrito c = carrito.get(rowIndex);
        Producto p = producto.get(rowIndex);
        switch(columnIndex){
            case 0 -> {
                p.setNombre((String)aValue);
                
            }
            case 1 -> {
                p.setPrecio((int)aValue);
                
            }
            case 2 -> {
                
            }
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}