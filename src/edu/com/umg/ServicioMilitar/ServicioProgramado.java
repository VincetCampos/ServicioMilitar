package edu.com.umg.ServicioMilitar;

import java.time.LocalDate;

public class ServicioProgramado {

    private Servicio servicio;

    private Soldado soldado;

    private LocalDate fecha;

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
