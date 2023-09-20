
package servicio;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private LocalDateTime fechaHora;

    public Fecha() {
        fechaHora = LocalDateTime.now();
    }

    public int getDia() {
        return fechaHora.getDayOfMonth();
    }

    public int getMes() {
        return fechaHora.getMonthValue();
    }

    public int getAño() {
        return fechaHora.getYear();
    }

    public int getHora() {
        return fechaHora.getHour();
    }

    public int getMinutos() {
        return fechaHora.getMinute();
    }

    public void setDia(int dia) {
        fechaHora = fechaHora.withDayOfMonth(dia);
    }

    public void setMes(int mes) {
        fechaHora = fechaHora.withMonth(mes);
    }

    public void setAño(int año) {
        fechaHora = fechaHora.withYear(año);
    }

    public void setHora(int hora) {
        fechaHora = fechaHora.withHour(hora);
    }

    public void setMinutos(int minutos) {
        fechaHora = fechaHora.withMinute(minutos);
    }

    public String getFechaHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return fechaHora.format(formatter);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return fechaHora.format(formatter);
    }
}
