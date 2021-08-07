package edu.com.umg.ServicioMilitar;


import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Ejercito ejercito = new Ejercito();

        //Cuarteles
        Cuartel cuartel1 = new Cuartel();
        cuartel1.setCodigo("CT01");
        cuartel1.setNombreCuarel("Cuartel No.1");
        cuartel1.setUbicacionCuartel("Guatemala");

        ejercito.agregarCuartel(cuartel1);

        Cuartel cuartel2 = new Cuartel();
        cuartel2.setCodigo("CT02");
        cuartel2.setNombreCuarel("Cuartel No. 2");
        cuartel2.setUbicacionCuartel("Jalapa");

        ejercito.agregarCuartel(cuartel2);

        //Compañia
        Compañia compañia1 = new Compañia();
        compañia1.setNoCompañia("No.1");
        compañia1.setActividadPrincipal("Compañia1");

        ejercito.agregarCompañia(compañia1);

        Compañia compañia2 = new Compañia();
        compañia2.setNoCompañia("No.2");
        compañia2.setActividadPrincipal("Compañia2");

        ejercito.agregarCompañia(compañia2);

        //Cuerpos Militares
        CuerpoMilitar cuerpo1 = new CuerpoMilitar();
        cuerpo1.setCodigo("CRP01");
        cuerpo1.setDenominacioncuerpo("Artilleria");

        ejercito.agregarCuerpos(cuerpo1);

        CuerpoMilitar cuerpo2 = new CuerpoMilitar();
        cuerpo2.setCodigo("CRP02");
        cuerpo2.setDenominacioncuerpo("Infanteria");

        ejercito.agregarCuerpos(cuerpo2);

        CuerpoMilitar cuerpo3 = new CuerpoMilitar();
        cuerpo3.setCodigo("CRP03");
        cuerpo3.setDenominacioncuerpo("Armada");

        ejercito.agregarCuerpos(cuerpo3);

        //Servicios
        Servicio servicio1 = new Servicio();
        servicio1.setCodigo("SV001");
        servicio1.setDescripcionServicio("Llevar viveres a personas de aldeas");

        ejercito.agregarServicios(servicio1);

        Servicio servicio2 = new Servicio();
        servicio2.setCodigo("SV002");
        servicio2.setDescripcionServicio("Hacer guardias por las garitas");

        ejercito.agregarServicios(servicio2);

        //Soldados
        Soldado soldado1 = new Soldado();
        soldado1.setCodigo("8-44");
        soldado1.setNombreSoldado("Vincet");
        soldado1.setApellidoSoldado("Campos");
        soldado1.setGraduacionSoldado("Bachiller");

        soldado1.setCuartel(cuartel1);

        soldado1.setCompañia(compañia1);

        soldado1.setCuerpoMilitar(cuerpo1);

        ejercito.asignarservi(servicio1, soldado1, LocalDate.parse("2021-07-05"));

        ejercito.asignarservi(servicio2, soldado1, LocalDate.parse("2021-11-08"));

        ejercito.agregarSoldado(soldado1);

        Soldado soldado2 = new Soldado();
        soldado2.setCodigo("7-554");
        soldado2.setNombreSoldado("Alejandro");
        soldado2.setApellidoSoldado("Samayoa");
        soldado2.setGraduacionSoldado("Perito");

        soldado2.setCuartel(cuartel1);

        soldado2.setCompañia(compañia2);

        soldado2.setCuerpoMilitar(cuerpo2);

        ejercito.asignarservi(servicio2, soldado2, LocalDate.parse("2021-07-05"));

        ejercito.asignarservi(servicio1, soldado2, LocalDate.parse("2021-11-08"));

        ejercito.agregarSoldado(soldado2);

        Soldado soldado3 = new Soldado();
        soldado3.setCodigo("2-8628");
        soldado3.setNombreSoldado("Jose");
        soldado3.setApellidoSoldado("Campos");
        soldado3.setGraduacionSoldado("Bachillerato");

        soldado3.setCuartel(cuartel2);

        soldado3.setCompañia(compañia2);

        soldado3.setCuerpoMilitar(cuerpo3);

        ejercito.asignarservi(servicio1, soldado3, LocalDate.parse("2021-07-05"));

        ejercito.agregarSoldado(soldado3);

        ejercito.imprimirCuarteles();

        ejercito.imprimirCompañia();

        ejercito.imprimirCuerpo();

        ejercito.imprimirServicios();

        ejercito.imprimirSoldados();

        ejercito.imprimirservpro();

    }
}
