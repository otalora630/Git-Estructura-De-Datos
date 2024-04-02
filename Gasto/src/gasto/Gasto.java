package gasto;

/**
 *
 * @author 57313
 */
public class Gasto {

    String categoria;
    double monto;
    String fecha;
    Gasto siguiente;

    public Gasto(String categoria, double monto, String fecha) {
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = fecha;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoria + ", Monto: $" + monto + ", Fecha: " + fecha;
    }
}
