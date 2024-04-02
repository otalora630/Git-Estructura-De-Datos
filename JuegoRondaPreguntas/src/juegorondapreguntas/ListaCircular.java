package juegorondapreguntas;

/**
 *
 * @author 57313
 */
public class ListaCircular {

    Participante cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    public void agregarParticipante(String nombre) {
        Participante nuevoParticipante = new Participante(nombre);
        if (cabeza == null) {
            cabeza = nuevoParticipante;
            cabeza.siguiente = cabeza; // Lista apunta a sí misma al ser circular
        } else {
            Participante temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoParticipante;
            nuevoParticipante.siguiente = cabeza; // Cerrar el círculo
        }
    }

    public void pasarTurno() {
        cabeza = cabeza.siguiente; // El siguiente se convierte en el primero
    }

    public Participante obtenerParticipanteActual() {
        return cabeza;
    }
}
