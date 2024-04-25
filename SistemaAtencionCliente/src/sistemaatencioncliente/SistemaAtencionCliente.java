package sistemaatencioncliente;

import controlador.Banco;
import java.util.Scanner;
import vista.Vista;

/**
 *
 * @author 57313
 */
public class SistemaAtencionCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vista vista=new Vista();
       Banco banco=new Banco();
       vista.mostrarMenu();
       banco.agregarCliente();
       banco.atenderCliente();
    }
}


