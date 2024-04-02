package ejerciciocadena;

import java.util.Stack;

/**
 *
 * @author 57313
 */
public class BalanceadorParentesis {

    public static boolean estaBalanceada(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char caracter : cadena.toCharArray()) {
            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                if (pila.pop() != '(') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
