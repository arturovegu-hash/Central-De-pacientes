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
    private Paciente cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    /**
     * Agrega un nuevo paciente al final de la lista.
     * @param paciente El objeto Paciente a agregar.
     */
    public void agregarPaciente(Paciente paciente) {
        if (cabeza == null) {
            cabeza = paciente;
        } else {
            Paciente actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(paciente);
        }
    }

    /**
     * Elimina un paciente de la lista por su identificación.
     * @param identificacion La identificación del paciente a eliminar.
     * @return true si el paciente fue eliminado, false si no se encontró.
     */
    public boolean eliminarPaciente(String identificacion) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getIdentificacion().equals(identificacion)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Paciente actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getIdentificacion().equals(identificacion)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }
        return false;
    }

    /**
     * Muestra todos los pacientes en la lista.
     */
    public void mostrarPacientes() {
        if (cabeza == null) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        
        Paciente actual = cabeza;
        System.out.println("--- Lista de Pacientes ---");
        while (actual != null) {
            System.out.println("Nombre: " + actual.getNombre() + ", ID: " + actual.getIdentificacion() + ", Clínica: " + actual.getClinica());
            actual = actual.getSiguiente();
        }
        System.out.println("-------------------------");
    }
    
    /**
     * Busca un paciente por su identificación.
     * @param identificacion La identificación del paciente a buscar.
     * @return El objeto Paciente si se encuentra, o null si no.
     */
    public Paciente buscarPaciente(String identificacion) {
        Paciente actual = cabeza;
        while (actual != null) {
            if (actual.getIdentificacion().equals(identificacion)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
}
