package juegorondapreguntas;

import java.util.Scanner;

/**
 *
 * @author 57313
 */
public class JuegoRondaPreguntas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular listaParticipantes = new ListaCircular();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de ronda de preguntas.");

        System.out.print("Ingrese el número de participantes: ");
        int numParticipantes = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 1; i <= numParticipantes; i++) {
            System.out.print("Ingrese el nombre del participante " + i + ": ");
            String nombre = scanner.nextLine();
            listaParticipantes.agregarParticipante(nombre);
        }

        // Comenzar el juego
        System.out.println("\nComenzando el juego...");

        while (true) {
            Participante participanteActual = listaParticipantes.obtenerParticipanteActual();
            System.out.println("\nTurno de: " + participanteActual.nombre);
            System.out.print("Presiona enter para pasar al siguiente participante...");
            scanner.nextLine();
            listaParticipantes.pasarTurno();

            System.out.println("¿Desea continuar el juego? (si/no)");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("¡Gracias por jugar!");
       
    }
}

