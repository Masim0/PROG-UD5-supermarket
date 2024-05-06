import com.salesianos.supermarket.utils.Randomizer;

public class Main {
    public static void main(String[] args) {
        String name = Randomizer.getRandomName();
        String product = Randomizer.getRandomProduct();

        System.out.println(name);
        System.out.println(product);
    }
}