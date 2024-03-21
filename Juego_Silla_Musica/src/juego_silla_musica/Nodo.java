package juego_silla_musica;

/**
 *
 * @author 57313
 */
public class Nodo {

    boolean valor;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(boolean valor) {
        this.valor = valor;
        siguiente = null;
        anterior = null;
    }
}
