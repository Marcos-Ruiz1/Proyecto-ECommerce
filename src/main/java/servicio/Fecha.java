
package servicio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDate fecha;

    public Fecha(){
        
    }
    
    public Fecha(int dia, int mes, int año) {
        this.fecha = LocalDate.of(año, mes, dia);
    }

    public int getDia() {
        return fecha.getDayOfMonth();
    }

    public int getMes() {
        return fecha.getMonthValue();
    }

    public int getAño() {
        return fecha.getYear();
    }

    public void setDia(int dia) {
        fecha = fecha.withDayOfMonth(dia);
    }

    public void setMes(int mes) {
        fecha = fecha.withMonth(mes);
    }

    public void setAño(int año) {
        fecha = fecha.withYear(año);
    }

    public String getFecha(){
        
        return (getAño() + "-" + getMes() + "-" + getDia());
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatter);
    }
}