package juego_silla_musica;

/**
 *
 * @author 57313
 */
public class SillaMusical {

    private Nodo primero;
    private int numSillas;

    public SillaMusical(int numSillas) {
        this.numSillas = numSillas;
        primero = new Nodo(true);
        Nodo actual = primero;
        for (int i = 0; i < numSillas; i++) {
            actual.siguiente = new Nodo(true);
            actual = actual.siguiente;
        }
        actual.siguiente = primero;
    }

    public void jugar() throws InterruptedException {
        while (numSillas > 1) {
            int pasos = (int) (Math.random() * numSillas);
            for (int i = 0; i < pasos; i++) {
                primero = primero.siguiente;
            }
            System.out.println("Eliminando silla:");
            eliminarNodo(primero);
            numSillas--;
            System.out.println("Sillas restantes: " + numSillas);
            Thread.sleep(2000);
        }
        System.out.println("¡Ganador! Silla " + primero.valor);
    }

    private void eliminarNodo(Nodo eliminar) {
        if (numSillas == numSillas) {
            return;
        }
        Nodo anterior = eliminar.anterior;
        anterior.siguiente = eliminar.siguiente;
        eliminar.siguiente.anterior = anterior;
        primero = eliminar.siguiente;
    }
}
