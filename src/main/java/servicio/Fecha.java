package servicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {

    private LocalDateTime fechaHora;

    /**
     * Constructor de la clase Fecha que crea una instancia de Fecha con la
     * fecha y hora actuales.
     */
    public Fecha() {
        fechaHora = LocalDateTime.now();
    }

    /**
     * Obtiene el día del mes de la fecha almacenada en este objeto Fecha.
     *
     * @return El día del mes.
     */
    public int getDia() {
        return fechaHora.getDayOfMonth();
    }

    /**
     * Obtiene el mes de la fecha almacenada en este objeto Fecha.
     *
     * @return El mes.
     */
    public int getMes() {
        return fechaHora.getMonthValue();
    }

    /**
     * Obtiene el año de la fecha almacenada en este objeto Fecha.
     *
     * @return El año.
     */
    public int getAño() {
        return fechaHora.getYear();
    }

    /**
     * Obtiene la hora del día de la fecha almacenada en este objeto Fecha.
     *
     * @return La hora del día.
     */
    public int getHora() {
        return fechaHora.getHour();
    }

    /**
     * Obtiene los minutos de la hora de la fecha almacenada en este objeto
     * Fecha.
     *
     * @return Los minutos de la hora.
     */
    public int getMinutos() {
        return fechaHora.getMinute();
    }

    /**
     * Establece el día del mes de la fecha almacenada en este objeto Fecha.
     *
     * @param dia El nuevo día del mes a establecer.
     */
    public void setDia(int dia) {
        fechaHora = fechaHora.withDayOfMonth(dia);
    }

    /**
     * Establece el mes de la fecha almacenada en este objeto Fecha.
     *
     * @param mes El nuevo mes a establecer.
     */
    public void setMes(int mes) {
        fechaHora = fechaHora.withMonth(mes);
    }

    /**
     * Establece el año de la fecha almacenada en este objeto Fecha.
     *
     * @param año El nuevo año a establecer.
     */
    public void setAño(int año) {
        fechaHora = fechaHora.withYear(año);
    }

    /**
     * Establece la hora del día de la fecha almacenada en este objeto Fecha.
     *
     * @param hora La nueva hora del día a establecer.
     */
    public void setHora(int hora) {
        fechaHora = fechaHora.withHour(hora);
    }

    /**
     * Establece los minutos de la hora de la fecha almacenada en este objeto
     * Fecha.
     *
     * @param minutos Los nuevos minutos de la hora a establecer.
     */
    public void setMinutos(int minutos) {
        fechaHora = fechaHora.withMinute(minutos);
    }

    /**
     * Obtiene la fecha y hora formateadas como una cadena de texto.
     *
     * @return La fecha y hora formateadas en el formato "yyyy/MM/dd HH:mm".
     */
    public String getFechaHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return fechaHora.format(formatter);
    }

    /**
     * Devuelve una representación en cadena de la fecha y hora en el formato
     * "yyyy/MM/dd HH:mm".
     *
     * @return La fecha y hora formateadas como cadena.
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return fechaHora.format(formatter);
    }
}
