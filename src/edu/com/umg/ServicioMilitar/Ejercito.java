package edu.com.umg.ServicioMilitar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ejercito {

    private List<Soldado> soldados;

    private List<Cuartel> cuarteles;

    private List<Compañia> compañias;

    private List<CuerpoMilitar> cuerpos;

    private List<Servicio> servicios;


    public Ejercito(){

        soldados = new ArrayList<>();

        cuarteles = new ArrayList<>();

        compañias = new ArrayList<>();

        cuerpos = new ArrayList<>();

        servicios = new ArrayList<>();

        servpro = new ArrayList<>();

    }

    public void agregarCuartel(Cuartel nuevoCuartel){

        cuarteles.add(nuevoCuartel);
    }

    public void agregarSoldado(Soldado nuevoSoldado){

        soldados.add(nuevoSoldado);
    }

    public void agregarCompañia(Compañia nuevaCompañia){

        compañias.add(nuevaCompañia);
    }

    public void agregarCuerpos(CuerpoMilitar nuevoCuerpo){

        cuerpos.add(nuevoCuerpo);
    }
    public void agregarServicios(Servicio nuevoServicio){

        servicios.add(nuevoServicio);
    }

    public void imprimirSoldados(){
        System.out.println("Listados de los Soldados");
        for (Soldado soldado : soldados) {

            System.out.println("Codigo: " + soldado.getCodigo() + " Nombre: " + soldado.getNombreSoldado()
            + " Apellido: " + soldado.getApellidoSoldado() + " Graduacion: " + soldado.getGraduacionSoldado() +
            " Cuartel: " + soldado.getCuartel().getCodigo() + " Compañia: " + soldado.getCompañia().getNoCompañia()
            + "Cuerpo: " + soldado.getCuerpoMilitar().getCodigo());
            System.out.println();

        }
    }

    public List<ServicioProgramado> servpro;

    public void asignarservi(Servicio servicio, Soldado soldado, LocalDate fecha){
        ServicioProgramado servicioProgramado = new ServicioProgramado();
        servicioProgramado.setServicio(servicio);
        servicioProgramado.setSoldado(soldado);
        servicioProgramado.setFecha(fecha);
        servpro.add(servicioProgramado);
    }

    public void imprimirservpro(){
        System.out.println("Actividades programadas");
        for (ServicioProgramado servicioProgramado : servpro) {
            System.out.println("Servicio: " + servicioProgramado.getServicio().getDescripcionServicio() + "" +
                    " Soldado: " + servicioProgramado.getSoldado().getCodigo() + " Fecha: " + servicioProgramado.getFecha());
            System.out.println();
        }
    }

    public void imprimirCuarteles(){
        System.out.println("Lista de los Cuarteles");
        for (Cuartel cuartel : cuarteles){
            System.out.println("Codigo : " + cuartel.getCodigo() + " Nombre: " + cuartel.getNombreCuarel()
            + " Ubicacion: " + cuartel.getUbicacionCuartel());
            System.out.println();
        }
    }

    public void imprimirCompañia(){
        System.out.println("Lista de las compañias");
        for (Compañia compañia : compañias){
            System.out.println("No. de Compañia : " + compañia.getNoCompañia() + " Actividad Principal: "
                    + compañia.getActividadPrincipal());
            System.out.println();
        }
    }

    public void imprimirCuerpo(){
        System.out.println("Listas de los Cuerpos Militares");
        for (CuerpoMilitar cuerpoMilitar : cuerpos){
            System.out.println("Codigo: " + cuerpoMilitar.getCodigo() + " Descripcion: "
                    + cuerpoMilitar.getDenominacioncuerpo());
            System.out.println();
        }
    }

    public void imprimirServicios(){
        System.out.println("Listas de los Servicios de los Militares");
        for (Servicio servicio : servicios){
            System.out.println("Codigo: " + servicio.getCodigo() +
                    "\nDescripcion: " + servicio.getDescripcionServicio());
            System.out.println();
        }
    }

}
