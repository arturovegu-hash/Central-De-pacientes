/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package central.de.pacientes;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class Paciente {
    private String nombre;
    private String identificacion;
    private String clinica;
    private Paciente siguiente;

    public Paciente(String nombre, String identificacion, String clinica) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.clinica = clinica;
        this.siguiente = null;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public Paciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Paciente siguiente) {
        this.siguiente = siguiente;
    }
}
