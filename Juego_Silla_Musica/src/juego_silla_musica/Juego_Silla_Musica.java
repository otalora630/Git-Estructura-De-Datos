package juego_silla_musica;

import java.util.Scanner;

/**
 *
 * @author 57313
 */
public class Juego_Silla_Musica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de jugadores: ");
        int numJugadores = scanner.nextInt();
        SillaMusical juego = new SillaMusical(numJugadores);
        juego.jugar();
    }

}
