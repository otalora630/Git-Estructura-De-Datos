package listaestudiante;

import java.util.Scanner;

/**
 *
 * @author 57313
 */
public class ListaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEstudiantes lista = new ListaEstudiantes();
        Scanner scanner = new Scanner(System.in);

        // Ingreso de estudiantes 
        System.out.println("Ingrese la i nformación de los estudiantes (ID y Nombre), escriba 'fin' para finalizar:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("fin")) {
                break;
            }
            String[] partes = input.split(" ");
            if (partes.length != 2) {
                System.out.println("Formato incorrecto. Debe ser 'ID Nombre'.");
                continue;
            }
            try {
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                Estudiante estudiante = new Estudiante(id, nombre);
                lista.agregarEstudiante(estudiante);
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Debe ser un número entero.");
            }
        }

        // Mostrar lista ascendente
        System.out.println("Lista de estudiantes en orden ascendente:");
        lista.mostrarAscendente();

        // Eliminar un estudiante
        System.out.print("\nIngrese el ID del estudiante que desea eliminar: ");
        int idEliminar = scanner.nextInt();
        lista.eliminarEstudiante(idEliminar);

        // Mostrar lista descendente después de eliminar un estudiante
        System.out.println("\nLista de estudiantes en orden descendente después de eliminar un estudiante:");
        lista.mostrarDescendente();

        scanner.close();
    }

}
