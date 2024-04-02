package gasto;

import java.util.Scanner;

/**
 *
 * @author 57313
 */
public class SeguimientoGastos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaGastos listaGastos = new ListaGastos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de seguimiento de gastos diarios.");

        while (true) {
            System.out.println("\nIngrese un nuevo gasto (o escriba 'fin' para terminar):");

            System.out.print("Categoría: ");
            String categoria = scanner.nextLine();

            if (categoria.equals("fin")) {
                break;
            }

            System.out.print("Monto: ");
            double monto = scanner.nextDouble();
            scanner.nextLine(); // Consume la nueva línea después de nextDouble()

            System.out.print("Fecha (YYYY-MM-DD): ");
            String fecha = scanner.nextLine();

            listaGastos.agregarGasto(categoria, monto, fecha);

            System.out.println("Gasto registrado correctamente.");
        }

        scanner.close();

        // Mostrar resumen de gastos
        System.out.println("\nResumen de gastos:");
        listaGastos.mostrarGastos();
    }

}
