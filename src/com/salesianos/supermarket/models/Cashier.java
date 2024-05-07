package com.salesianos.supermarket.models;

import com.salesianos.supermarket.utils.Randomizer;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier extends Person {
    private final String id;
    private final Queue<Client> clientQueue;
    private int clientsServed;

    public Cashier() {
        super();
        this.id = Randomizer.generateRandomUUID();
        this.clientQueue = new LinkedList<>();
        this.clientsServed = 0;
    }

    public void serveNextClient() {
        if (!clientQueue.isEmpty()) {
            Client nextClient = clientQueue.poll();
            System.out.println("Cashier " + name + " " + id + " serving client " + nextClient.getName());
            clientsServed++;
        } else {
            System.out.println("Cashier " + name + " " + id + " has no clients to serve.");
        }
    }

    public void addToQueue(Client client) {
        clientQueue.offer(client);
    }

    public String getName() {
        return name;
    }

    public int getClientsServed() {
        return clientsServed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cajero\n");
        sb.append("===================================\n");
        sb.append("* Número de caja: ").append(id).append("\n");
        sb.append("* Total de clientes: ").append(clientQueue.size()).append("\n");
        sb.append("* Clientes en la fila:\n");
        for (Client client : clientQueue) {
            sb.append(client.getName()).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }
}
