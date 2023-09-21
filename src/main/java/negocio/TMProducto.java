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
 * @author Equipo2
 */
public class TMProducto implements TableModel {

    private List<Producto> productos;

    /**
     * Constructor de la clase TMProducto.
     *
     * @param lista La lista de productos que se utilizará para inicializar el
     * modelo.
     */
    public TMProducto(List<Producto> lista) {
        productos = lista;
    }

    /**
     * Devuelve el número de filas en el modelo de datos.
     *
     * @return El número de filas en el modelo de datos.
     */
    @Override
    public int getRowCount() {
        return productos.size();
    }

    /**
     * Devuelve el número de columnas en el modelo de datos.
     *
     * @return El número de columnas en el modelo de datos.
     */
    @Override
    public int getColumnCount() {
        return 5;
    }

    /**
     * Devuelve el nombre de la columna en el modelo de datos, dado su índice.
     *
     * @param columnIndex El índice de la columna para la que se desea obtener
     * el nombre.
     * @return El nombre de la columna correspondiente al índice proporcionado.
     */
    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "idProducto";
                break;
            }
            case 1: {
                titulo = "nombre";
                break;
            }
            case 2: {
                titulo = "descripcion";
                break;
            }
            case 3: {
                titulo = "precio";
                break;
            }
            case 4: {
                titulo = "idCategoria";
                break;
            }
        }
        return titulo;
    }

    /**
     * Devuelve la clase de datos de la columna en el modelo de datos, dado su
     * índice.
     *
     * @param columnIndex El índice de la columna para la que se desea obtener
     * la clase de datos.
     * @return La clase de datos correspondiente a la columna especificada.
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: {
                return int.class;
            }
            case 1: {
                return String.class;
            }
            case 2: {
                return String.class;
            }
            case 3: {
                return float.class;
            }
            case 4: {
                return int.class;
            }
        }
        return null;
    }

    /**
     * Determina si una celda en el modelo de datos es editable o no, dado su
     * índice de fila y columna.
     *
     * @param rowIndex El índice de fila de la celda.
     * @param columnIndex El índice de columna de la celda.
     * @return `true` si la celda es editable, `false` si no lo es.
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /**
     * Devuelve el valor de una celda en el modelo de datos, dado su índice de
     * fila y columna.
     *
     * @param rowIndex El índice de fila de la celda.
     * @param columnIndex El índice de columna de la celda.
     * @return El valor de la celda correspondiente a la fila y columna
     * especificadas.
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);

        switch (columnIndex) {
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

    /**
     * Establece el valor de una celda en el modelo de datos, dado su índice de
     * fila y columna.
     *
     * @param aValue El nuevo valor a establecer en la celda.
     * @param rowIndex El índice de fila de la celda.
     * @param columnIndex El índice de columna de la celda.
     */
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        switch (columnIndex) {
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
                p.setIdCategoria((int) aValue);

            }
        }
    }

    /**
     * Agrega un oyente para escuchar eventos relacionados con el modelo de la
     * tabla.
     *
     * @param l El oyente a agregar.
     */
    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    /**
     * Elimina un oyente que ya no escuchará eventos relacionados con el modelo
     * de la tabla.
     *
     * @param l El oyente a eliminar.
     */
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
