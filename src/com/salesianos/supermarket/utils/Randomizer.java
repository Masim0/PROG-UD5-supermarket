package com.salesianos.supermarket.utils;

import java.util.Random;

public class Randomizer {
    private static final String[] products = {"Manzana", "Harina", "Velas", "Libro", "Cafetera", "Camisa", "Televisor", "Zapatos", "Perfume", "Mesa", "Gafas", "Reloj"};
    private static final String[] names = {"Juan", "María", "Pedro", "Ana", "Luis", "Carla", "Roberto", "Laura", "Sofía", "Javier", "Elena", "Diego", "Lucía", "Carlos", "Patricia", "Andrés", "Marta", "Ricardo", "Valentina", "Gabriel"};
    private static final Random random = new Random();

    public static String getRandomProduct() {
        return products[random.nextInt(products.length)];
    }

    public static String getRandomName() {
        return names[random.nextInt(names.length)];
    }

    public static int getRandomAge() {
        return random.nextInt(60);
    }
}
