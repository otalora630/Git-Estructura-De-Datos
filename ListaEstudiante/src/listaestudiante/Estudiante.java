package listaestudiante;

/**
 *
 * @author 57313
 */
public class Estudiante {

    int id;
    String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
