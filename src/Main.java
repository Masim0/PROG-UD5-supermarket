import com.salesianos.supermarket.models.Cashier;
import com.salesianos.supermarket.models.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.addToBasket("Apples");
        client1.addToBasket("Milk");
        client1.showBasket();

        Cashier cashier1 = new Cashier();
        cashier1.serveClient(client1);

        System.out.println("Clients served by " + cashier1.getName() + ": " + cashier1.getClientsServed());
    }
}