package listaestudiante;

/**
 *
 * @author 57313
 */
public class Nodo {

    Estudiante estudiante;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
        this.anterior = null;
    }
}
