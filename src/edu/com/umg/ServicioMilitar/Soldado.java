package edu.com.umg.ServicioMilitar;

public class Soldado extends Entidad {

    //Atributos

    private String nombreSoldado;

    private String apellidoSoldado;

    private String graduacionSoldado;

    //Soldados integredos con el cuartel, compañia, cuerpo y los servicios que realizan

    private Cuartel cuartel;

    private Compañia compañia;

    private CuerpoMilitar cuerpoMilitar;


    public String getNombreSoldado() {
        return nombreSoldado;
    }

    public void setNombreSoldado(String nombreSoldado) {
        this.nombreSoldado = nombreSoldado;
    }

    public String getApellidoSoldado() {
        return apellidoSoldado;
    }

    public void setApellidoSoldado(String apellidoSoldado) {
        this.apellidoSoldado = apellidoSoldado;
    }

    public String getGraduacionSoldado() {
        return graduacionSoldado;
    }

    public void setGraduacionSoldado(String graduacionSoldado) {
        this.graduacionSoldado = graduacionSoldado;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public Compañia getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
    }

    public CuerpoMilitar getCuerpoMilitar() {
        return cuerpoMilitar;
    }

    public void setCuerpoMilitar(CuerpoMilitar cuerpoMilitar) {
        this.cuerpoMilitar = cuerpoMilitar;
    }

}
