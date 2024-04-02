package ejerciciocadena;

import static ejerciciocadena.BalanceadorParentesis.estaBalanceada;
import java.util.Scanner;

/**
 *
 * @author 57313
 */
public class EjercicioCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la expresion:");
        String dato=leer.nextLine();
        String cadena1 = "((a+b)*c)";

        System.out.println("Cadena '" + cadena1 + "': " + estaBalanceada(dato));
      
    }
}
