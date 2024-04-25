/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import controlador.Banco;

/**
 *
 * @author 57313
 */
public class Vista {

    Banco banco = new Banco();
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {

            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un nuevo cliente:");
            System.out.println("2. Atender al siguiente cliente:");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    banco.agregarCliente();
                    break;
                case 2:
                    banco.atenderCliente();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("la opcion no es valida");
            }
        }
    }
}
