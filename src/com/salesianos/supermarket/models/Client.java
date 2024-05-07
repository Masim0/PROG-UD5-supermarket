package com.salesianos.supermarket.models;

import com.salesianos.supermarket.utils.Randomizer;

import java.util.Stack;

public class Client extends Person {
    private final Stack<String> shoppingBasket;

    public Client() {
        super();
        this.shoppingBasket = Randomizer.generateRandomBasket();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente\n");
        sb.append("===================================\n");
        sb.append("* Name: ").append(name).append("\n");
        sb.append("* Total products: ").append(shoppingBasket.size()).append("\n");
        sb.append("* Items in the basket:\n");
        for (String product : shoppingBasket) {
            sb.append(product).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }

}
