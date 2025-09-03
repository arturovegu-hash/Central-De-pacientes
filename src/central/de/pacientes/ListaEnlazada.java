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

    // Método para agregar un paciente al final de la lista
    public void agregarPaciente(Paciente paciente) {
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

    // Método para buscar un paciente por ID
    public Paciente buscarPaciente(String id) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPaciente().getId().equals(id)) {
                return actual.getPaciente();
            }
            actual = actual.getSiguiente();
        }
        return null; // Si no se encuentra el paciente
    }

    // Método para eliminar un paciente por ID
    public boolean eliminarPaciente(String id) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getPaciente().getId().equals(id)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getPaciente().getId().equals(id)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return false;
    }

    // Método para obtener una representación en String de todos los pacientes
    public String obtenerPacientes() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        if (cabeza == null) {
            return "No hay pacientes registrados.";
        }
        while (actual != null) {
            sb.append(actual.getPaciente().toString()).append("\n");
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }
}