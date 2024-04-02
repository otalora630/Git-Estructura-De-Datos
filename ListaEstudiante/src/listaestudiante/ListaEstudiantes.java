package listaestudiante;

/**
 *
 * @author 57313
 */
public class ListaEstudiantes {

    Nodo cabeza;

    public ListaEstudiantes() {
        this.cabeza = null;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp;
        }
    }

    public void eliminarEstudiante(int id) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.estudiante.id == id) {
                if (temp == cabeza) {
                    cabeza = temp.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    }
                } else {
                    temp.anterior.siguiente = temp.siguiente;
                    if (temp.siguiente != null) {
                        temp.siguiente.anterior = temp.anterior;
                    }
                }
                System.out.println("Estudiante con ID " + id + " eliminado correctamente.");
                return;
            }
            temp = temp.siguiente;
        }

        System.out.println("Estudiante con ID " + id + " no encontrado.");
    }

    public void mostrarAscendente() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.estudiante);
            temp = temp.siguiente;
        }
    }

    public void mostrarDescendente() {
        Nodo temp = cabeza;
        if (temp == null) {
            return;
        }
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        while (temp != null) {
            System.out.println(temp.estudiante);
            temp = temp.anterior;
        }
    }
}
