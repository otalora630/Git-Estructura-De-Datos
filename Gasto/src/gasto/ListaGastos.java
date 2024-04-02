package gasto;

/**
 *
 * @author 57313
 */
public class ListaGastos {

    Gasto cabeza;

    public ListaGastos() {
        this.cabeza = null;
    }

    public void agregarGasto(String categoria, double monto, String fecha) {
        Gasto nuevoGasto = new Gasto(categoria, monto, fecha);
        if (cabeza == null) {
            cabeza = nuevoGasto;
        } else {
            Gasto temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoGasto;
        }
    }

    public void mostrarGastos() {
        if (cabeza == null) {
            System.out.println("No se registraron gastos.");
        } else {
            Gasto temp = cabeza;
            while (temp != null) {
                System.out.println(temp);
                temp = temp.siguiente;
            }
        }
    }
}
