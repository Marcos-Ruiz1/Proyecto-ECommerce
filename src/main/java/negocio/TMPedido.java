package negocio;

import entidades.Pedido;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Equipo 2
 */
public class TMPedido implements TableModel {

    private List<Pedido> pedidos;

    /**
     * Constructor de la clase TMPedido.
     *
     * @param lista Una lista de pedidos que se utilizará para inicializar el
     * modelo de tabla.
     */
    public TMPedido(List<Pedido> lista) {
        pedidos = lista;
    }

    /**
     * Devuelve el número total de filas en la tabla.
     *
     * @return El número de filas en la tabla.
     */
    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    /**
     * Devuelve el número total de columnas en la tabla.
     *
     * @return El número de columnas en la tabla.
     */
    @Override
    public int getColumnCount() {
        return 3;
    }

    /**
     * Devuelve el nombre de la columna en la tabla en función del índice de
     * columna.
     *
     * @param columnIndex El índice de columna.
     * @return El nombre de la columna.
     */
    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "idPedido";
                break;
            }
            case 1: {
                titulo = "cantidad";
                break;
            }
            case 2: {
                titulo = "fecha pedido";
                break;
            }
        }
        return titulo;
    }

    /**
     * Devuelve la clase de datos que se encuentra en la columna especificada.
     *
     * @param columnIndex El índice de columna.
     * @return La clase de datos en la columna.
     */
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: {
                return int.class;
            }
            case 1: {
                return float.class;
            }
            case 2: {
                return String.class;
            }
        }
        return null;
    }

    /**
     * Determina si una celda en la tabla es editable o no.
     *
     * @param rowIndex El índice de fila de la celda.
     * @param columnIndex El índice de columna de la celda.
     * @return True si la celda es editable, false en caso contrario.
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    /**
     * Obtiene el valor de una celda en la tabla de pedidos en la posición
     * especificada.
     *
     * @param rowIndex El índice de fila de la celda.
     * @param columnIndex El índice de columna de la celda.
     * @return El valor de la celda en la posición especificada.
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido p = pedidos.get(rowIndex);

        switch (columnIndex) {
            case 0-> {
                return p.getIdPedido();

            }
            case 1 -> {
                return p.getCantidad();

            }
            case 2 -> {
                return p.getFechaDePedido();

            }
        }
        return null;
    }

    /**
     * Establece el valor de una celda en la tabla en la posición especificada.
     *
     * @param aValue El nuevo valor que se establecerá en la celda.
     * @param rowIndex El índice de fila de la celda.
     * @param columnIndex El índice de columna de la celda.
     */
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Pedido p = pedidos.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                p.setIdPedido((int) aValue);

            }
            case 1 -> {
                p.setCantidad((float) aValue);
            }
            case 2 -> {
                p.setFechaDePedido(aValue.toString());

            }

        }
    }

    /**
     * Agrega un oyente al modelo de tabla para escuchar eventos de cambios en
     * la tabla.
     *
     * @param l El oyente de tabla que se va a agregar.
     */
    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    /**
     * Elimina un oyente del modelo de tabla para dejar de escuchar eventos de
     * cambios en la tabla.
     *
     * @param l El oyente de tabla que se va a eliminar.
     */
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
