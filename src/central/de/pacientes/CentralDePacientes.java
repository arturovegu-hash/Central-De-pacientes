/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package central.de.pacientes;

import java.util.Scanner;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class CentralDePacientes {
    public static void main(String[] args) {
        ListaEnlazada listaPacientes = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Central de Pacientes ---");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Eliminar paciente");
            System.out.println("3. Buscar paciente");
            System.out.println("4. Mostrar todos los pacientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la identificación: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese la clínica: ");
                    String clinica = scanner.nextLine();
                    Paciente nuevoPaciente = new Paciente(nombre, id, clinica);
                    listaPacientes.agregarPaciente(nuevoPaciente);
                    System.out.println("Paciente agregado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese la identificación del paciente a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    if (listaPacientes.eliminarPaciente(idEliminar)) {
                        System.out.println("Paciente eliminado con éxito.");
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la identificación del paciente a buscar: ");
                    String idBuscar = scanner.nextLine();
                    Paciente pacienteEncontrado = listaPacientes.buscarPaciente(idBuscar);
                    if (pacienteEncontrado != null) {
                        System.out.println("Paciente encontrado:");
                        System.out.println("Nombre: " + pacienteEncontrado.getNombre() + ", ID: " + pacienteEncontrado.getIdentificacion() + ", Clínica: " + pacienteEncontrado.getClinica());
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;
                case 4:
                    listaPacientes.mostrarPacientes();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
    /**
     * @param args the command line arguments
     */
}
