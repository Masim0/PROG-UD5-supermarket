package com.salesianos.supermarket.utils;

import java.util.Random;
import java.util.Stack;
import java.util.UUID;

public class Randomizer {
    private static final String[] products = {"Manzana", "Harina", "Velas", "Libro", "Cafetera", "Camisa", "Televisor", "Zapatos", "Perfume", "Mesa", "Gafas", "Reloj"};
    private static final String[] names = {"Juan", "María", "Pedro", "Ana", "Luis", "Carla", "Roberto", "Laura", "Sofía", "Javier", "Elena", "Diego", "Lucía", "Carlos", "Patricia", "Andrés", "Marta", "Ricardo", "Valentina", "Gabriel"};
    private static final Random random = new Random();

    private static String getRandomProduct() {
         return products[random.nextInt(products.length)];
    }

    public static Stack<String> generateRandomBasket() {
        int basketSize = random.nextInt(11) + 1;
        Stack<String> products = new Stack<>();
        for (int i = 0; i < basketSize; i++) {
            products.push(getRandomProduct());
        }
        return products;
    }

    public static String getRandomName() {
        return names[random.nextInt(names.length)];
    }

    public static int getRandomAge() {
        return random.nextInt(60);
    }

    public static String generateRandomUUID() {
        return UUID.randomUUID().toString();
    }
}
