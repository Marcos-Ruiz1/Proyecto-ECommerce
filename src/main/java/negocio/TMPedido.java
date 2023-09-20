
package negocio;
import entidades.Pedido;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author marcos_zr
 */
public class TMPedido implements TableModel{
    private List <Pedido> pedidos;
    
    public TMPedido(List <Pedido> lista){
        pedidos=lista;
    }
    
    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo= null;
        switch(columnIndex){
            case 0:{
                titulo = "idPedido";
                break;
            }
            case 1:{
                titulo = "cantidad";
                break;
            }
            case 2:{
                titulo = "fecha pedido";
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
                return float.class;
            }
            case 2:{
                return String.class;
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
        Pedido p = pedidos.get(rowIndex);
        
        switch(columnIndex){
            case 0 -> {
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

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Pedido p = pedidos.get(rowIndex);
        switch(columnIndex){
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

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
