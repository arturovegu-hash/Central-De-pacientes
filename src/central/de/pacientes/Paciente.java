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
    private String cedula;
    private String clinica;

    public Paciente(String nombre, String cedula, String clinica) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.clinica = clinica;
    }

    // Métodos getters para acceder a los atributos del paciente
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getClinica() {
        return clinica;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Clínica: " + clinica;
    }
}
