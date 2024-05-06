import com.salesianos.supermarket.utils.Randomizer;

public class Main {
    public static void main(String[] args) {
        String name = Randomizer.getRandomName();
        String product = Randomizer.getRandomProduct();
        int age = Randomizer.getRandomAge();

        System.out.println(name);
        System.out.println(product);
        System.out.println(age);
    }
}