package modelo;

/**
 *
 * @author 57313
 */
public class Cliente {

    String nombre;
    int numeroTicket;

    public Cliente(String nombre, int numeroTicket) {
        this.nombre = nombre;
        this.numeroTicket = numeroTicket;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }
}
