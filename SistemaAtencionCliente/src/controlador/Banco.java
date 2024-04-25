package controlador;

import modelo.Cliente;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author 57313
 */
public class Banco {

    Queue<Cliente> colaClientes = new LinkedList<>();
    int contadorTickets = 1;

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            Cliente cliente = colaClientes.poll();
            System.out.println("Atendiendo al cliente " + cliente.getNombre()+ " (Ticket " + cliente.getNumeroTicket() + ")");
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }

    public void agregarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, contadorTickets++);
        colaClientes.offer(cliente);
        System.out.println(cliente.getNombre() + " ha sido agregado a la cola con el Ticket numero:" + cliente.getNumeroTicket());
    }
    
}
