
package ejerciciopilas;

import control.ControladorHistorial;
import modelo.HistorialNavegacion;
import vista.VistaHistorial;

/**
 *
 * @author 57313
 */
public class EjercicioPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        VistaHistorial vista = new VistaHistorial();
        ControladorHistorial controlador = new ControladorHistorial(historial, vista);

        vista.setVisible(true);
    }
    
}
