package modelo;

import java.util.Stack;

/**
 *
 * @author 57313
 */
public class HistorialNavegacion {

    private Stack<PaginaWeb> haciaAtras;
    private Stack<PaginaWeb> haciaAdelante;
    private PaginaWeb paginaActual;

    public HistorialNavegacion() {
        haciaAtras = new Stack<>();
        haciaAdelante = new Stack<>();
        paginaActual = null;
    }

    public void visitarPagina(PaginaWeb pagina) {
        if (paginaActual != null) {
            haciaAtras.push(paginaActual);
            haciaAdelante.clear();
        }
        paginaActual = pagina;
    }

    public PaginaWeb retroceder() {
        if (!haciaAtras.isEmpty()) {
            haciaAdelante.push(paginaActual);
            paginaActual = haciaAtras.pop();
        }
        return paginaActual;
    }

    public PaginaWeb avanzar() {
        if (!haciaAdelante.isEmpty()) {
            haciaAtras.push(paginaActual);
            paginaActual = haciaAdelante.pop();
        }
        return paginaActual;
    }

    public PaginaWeb getPaginaActual() {
        return paginaActual;
    }
}
