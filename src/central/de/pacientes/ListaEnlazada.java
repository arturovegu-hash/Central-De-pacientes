/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package central.de.pacientes;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class ListaEnlazada {
   private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo paciente a la lista
    public void agregar(Paciente paciente) {
        Nodo nuevoNodo = new Nodo(paciente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para mostrar todos los pacientes en la lista
    public void mostrarPacientes() {
        if (cabeza == null) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getPaciente());
            actual = actual.getSiguiente();
        }
    }
}