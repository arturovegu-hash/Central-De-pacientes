/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package central.de.pacientes;

import java.util.Scanner;

/**
 *
 * @author Arturo_Velásquez_G
 */
public class CentralPacientes {
    public static void main(String[] args) {
        ListaEnlazada listaPacientes = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Central de Pacientes ---");
            System.out.println("1. Agregar nuevo paciente");
            System.out.println("2. Mostrar todos los pacientes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cédula del paciente: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Ingrese la clínica del paciente: ");
                    String clinica = scanner.nextLine();
                    Paciente nuevoPaciente = new Paciente(nombre, cedula, clinica);
                    listaPacientes.agregar(nuevoPaciente);
                    System.out.println("Paciente agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("\n--- Lista de Pacientes ---");
                    listaPacientes.mostrarPacientes();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
