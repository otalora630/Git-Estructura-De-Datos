package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import modelo.PaginaWeb;

/**
 *
 * @author 57313
 */
public class VistaHistorial extends JFrame{

    private JTextArea areaTexto;
    private JButton retrocederButton;
    private JButton avanzarButton;
    private JButton visitarButton;

    public VistaHistorial() {
        setTitle("Gestor de Historial de Navegación");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        areaTexto = new JTextArea(1, 20);
        panel.add(areaTexto);

        retrocederButton = new JButton("Retroceder");
        retrocederButton.setBackground(Color.LIGHT_GRAY);
        panel.add(retrocederButton);

        avanzarButton = new JButton("Avanzar");
        avanzarButton.setBackground(Color.LIGHT_GRAY);
        panel.add(avanzarButton);

        visitarButton = new JButton("Visitar Página");
        visitarButton.setBackground(Color.LIGHT_GRAY);
        panel.add(visitarButton);
    }

    public void agregarListener(ActionListener listener) {
        retrocederButton.addActionListener(listener);
        avanzarButton.addActionListener(listener);
        visitarButton.addActionListener(listener);
    }

    public String obtenerURL() {
        return areaTexto.getText();
    }

    public void mostrarPagina(PaginaWeb pagina) {
        JOptionPane.showMessageDialog(this, "Mostrando página: " + pagina.getTitulo() + " - " + pagina.getUrl());
    }

    public void habilitarRetroceder(boolean habilitado) {
        retrocederButton.setEnabled(habilitado);
    }

    public void habilitarAvanzar(boolean habilitado) {
        avanzarButton.setEnabled(habilitado);
    }
}
