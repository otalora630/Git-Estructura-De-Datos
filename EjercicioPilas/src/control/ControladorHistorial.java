package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelo.HistorialNavegacion;
import modelo.PaginaWeb;
import vista.VistaHistorial;

/**
 *
 * @author 57313
 */
public class ControladorHistorial implements ActionListener {

    private HistorialNavegacion historial;
    private VistaHistorial vista;

    public ControladorHistorial(HistorialNavegacion historial, VistaHistorial vista) {
        this.historial = historial;
        this.vista = vista;
        this.vista.agregarListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            if (boton.getText().equals("Visitar Página")) {
                String url = vista.obtenerURL();
                historial.visitarPagina(new PaginaWeb(url, "Página Personalizada"));
                vista.mostrarPagina(historial.getPaginaActual());
                vista.habilitarRetroceder(true);
                vista.habilitarAvanzar(false);
            } else if (boton.getText().equals("Retroceder")) {
                PaginaWeb pagina = historial.retroceder();
                vista.mostrarPagina(pagina);
                vista.habilitarRetroceder(!historial.getPaginaActual().equals(pagina));
                vista.habilitarAvanzar(true);
            } else if (boton.getText().equals("Avanzar")) {
                PaginaWeb pagina = historial.avanzar();
                vista.mostrarPagina(pagina);
                vista.habilitarRetroceder(true);
                vista.habilitarAvanzar(!historial.getPaginaActual().equals(pagina));
            }
        }
    }
}
