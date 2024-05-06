package com.salesianos.supermarket.models;

public class Cashier extends Person {
    private int clientsServed;

    public Cashier() {
        super();
        this.clientsServed = 0;
    }

    public void serveClient(Client client) {
        System.out.println("Serving " + client.name);
        clientsServed++;
    }

    public int getClientsServed() {
        return clientsServed;
    }

    public String getName() {
        return name;
    }
}
