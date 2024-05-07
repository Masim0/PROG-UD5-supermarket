import com.salesianos.supermarket.models.Cashier;
import com.salesianos.supermarket.models.Client;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cashier cashier = new Cashier();
        boolean cashierOpen = false;

        while (true) {
            System.out.println("========== Menú ==========");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.println("==========================\n");

            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    if (!cashierOpen) {
                        System.out.println("Caja abierta.");
                        cashierOpen = true;
                    } else {
                        System.out.println("La caja ya estaba abierta.");
                    }
                    break;
                case 2:
                    if (cashierOpen) {
                        Client newCustomer = new Client();
                        cashier.addToQueue(newCustomer);
                        System.out.println("Nuevo cliente añadido a la cola:");
                        System.out.println(newCustomer);
                    } else {
                        System.out.println("La caja está cerrada.");
                    }
                    break;
                case 3:
                    if (!cashier.getClientQueue().isEmpty()) {
                        cashier.serveNextClient();
                    } else {
                        System.out.println("No hay clientes en la cola para atender.");
                    }
                    break;
                case 4:
                    System.out.println("Clientes pendientes:");
                    System.out.println(cashier);
                    break;
                case 5:
                    if (!cashier.getClientQueue().isEmpty()) {
                        System.out.println("La caja no se puede cerrar si hay clientes esperando a ser atendidos.");
                    } else {
                        System.out.println("Cerrando supermercado.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
