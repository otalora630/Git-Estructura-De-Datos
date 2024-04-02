package juegorondapreguntas;

/**
 *
 * @author 57313
 */
public class Participante {

    String nombre;
    Participante siguiente;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}
