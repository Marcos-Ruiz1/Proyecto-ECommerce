/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import entidades.Producto;
/**
 *
 * @author Equipo 2
 */
public class TMCarrito implements TableModel{
//    private List<Carrito> carrito;
    private List<Producto> producto;
    /**
     * Clase que genera el modelo de la tabla carrito
     * @param listaP Lista de productos
     */
    public TMCarrito(/*List <Carrito> listaC, */List <Producto> listaP){
//        carrito=listaC;
        producto=listaP;
    }
    /**
     * Obtiene el numero de filas
     * @return numero de filas
     */
    @Override
    public int getRowCount() {
//        return carrito.size();
          return producto.size();
    }
    /**
     * Obtiene el numero de columnas
     * @return numero de columnas
     */
    @Override
    public int getColumnCount() {
        return 3;
    }
    /**
     * Obtiene los nombres de las columnas
     * @param columnIndex numero de columna
     * @return Nombre de columna
     */
    @Override
    public String getColumnName(int columnIndex) {
        String titulo=null;
        switch(columnIndex){
            case 0:{
                titulo = "id";
                break;
            }
            case 1:{
                titulo = "Producto";
                break;
            }
            case 2:{
                titulo = "Precio";
                break;
            }
        }
        return titulo;
    }
    /**
     * Obtiene las clases 
     * @param columnIndex 
     * @return clases
     */
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
                return int.class;
            }
        }
        return null;
    }
    /**
     * Establece si la tabla es editable
     * @param rowIndex numero de fila
     * @param columnIndex numero de columna
     * @return true si es editable, falso en caso contrario
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    /**
     * Regresa el valor dado en los parametros
     * @param rowIndex numero de fila
     * @param columnIndex numero de columna
     * @return valor dado en los parametros
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        Carrito c = carrito.get(rowIndex);
        Producto p = producto.get(rowIndex);
        
        switch(columnIndex){
            case 0 -> {
                
                return p.getIdProducto();
                
            }
            case 1 -> {
                return p.getNombre();
                
            }
            case 2 -> {
                return p.getPrecio();
                
            }
        }
        return null;
    }
    /**
     * Establece el valor
     * @param aValue Valor del objeto
     * @param rowIndex numero de columna  
     * @param columnIndex numero de fila
     */
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        Carrito c = carrito.get(rowIndex);
        Producto p = producto.get(rowIndex);
        switch(columnIndex){
            case 0-> {
                p.setIdProducto((int)aValue);
            }
            case 1-> {
                p.setNombre((String)aValue);
            }
            case 2->{
                p.setPrecio((int)aValue);
            }
        }
    }
    /**
     * Implementacion de TableModel
     * @param l TableModelListener
     */
    @Override
    public void addTableModelListener(TableModelListener l) {
    }
    /**
     * implementacion de TableModel
     * @param l TableModelListener
     */
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
    
    
}