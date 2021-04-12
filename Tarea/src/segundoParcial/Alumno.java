package segundoParcial;

import java.io.Serializable;

/**
 *
 * @author alave
 */
public class Alumno implements Serializable{
    
    private String nombre;
    private String paterno;
    private String materno;
    private Double calificacion;
    private Carreras carrera;

    public Alumno(String nombre, String paterno, String materno, Double calificacion, Carreras carrera) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.calificacion = calificacion;
        this.carrera = carrera;
    }

    Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Carreras getCarrera() {
        return carrera;
    }

    public void setCarrera(Carreras carrera) {
        this.carrera = carrera;
    }

    
    
    
}

