
package ete;

import java.io.Serializable;


class Alumno implements Serializable{
    
    private String numCuenta;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private float calificacion;

    public Alumno(String numCuenta, String nombre, String apellidoP, String apellidoM, float calificacion) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.calificacion = calificacion;
    }

    public String getCuenta() {
        return numCuenta;
    }

    public void setCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
}
