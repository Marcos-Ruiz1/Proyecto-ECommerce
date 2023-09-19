/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import entidades.Producto;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
/**
 *
 * @author gaspa
 */

public class TMProducto implements TableModel{
    private List <Producto> productos;
    
    public TMProducto(List <Producto> lista){
        productos=lista;
    }
    
    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo= null;
        switch(columnIndex){
            case 0:{
                titulo = "idProducto";
                break;
            }
            case 1:{
                titulo = "nombre";
                break;
            }
            case 2:{
                titulo = "descripcion";
                break;
            }
            case 3:{
                titulo = "precio";
                break;
            }
            case 4:{
                titulo = "idCategoria";
                break;
            }
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0:{
                return int.class;
            }
            case 1:{
                return String.class;
            }
            case 2:{
                return String.class;
            }
            case 3:{
                return float.class;
            }
            case 4:{
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
        Producto p = productos.get(rowIndex);
        
        switch(columnIndex){
            case 0 -> {
                return p.getIdProducto();
                
            }
            case 1 -> {
                return p.getNombre();
                
            }
            case 2 -> {
                return p.getDescripcion();
                
            }
            case 3 -> {
                return p.getPrecio();
                
            }
            case 4 -> {
                return p.getIdCategoria();
                
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        switch(columnIndex){
            case 0 -> {
                p.setIdProducto((int) aValue);
                
            }
            case 1 -> {
                p.setNombre(aValue.toString());
            }
            case 2 -> {
                p.setDescripcion(aValue.toString());
                
            }
            case 3 -> {
                p.setPrecio((int) aValue);
                
            }
            case 4 -> {
                p.setIdCategoria((int)aValue);
                
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
