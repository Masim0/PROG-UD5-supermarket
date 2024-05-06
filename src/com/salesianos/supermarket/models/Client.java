package com.salesianos.supermarket.models;

import java.util.List;
import java.util.ArrayList;

public class Client extends Person {
    private List<String> shoppingBasket;

    public Client() {
        super();
        this.shoppingBasket = new ArrayList<>();
    }

    public void addToBasket(String product) {
        shoppingBasket.add(product);
    }

    public void showBasket() {
        System.out.println("Shopping basket of " + name + ":");
        for (String product : shoppingBasket) {
            System.out.println("- " + product);
        }
    }
}
