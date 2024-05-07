package com.salesianos.supermarket.models;

import com.salesianos.supermarket.utils.Randomizer;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier extends Person {
    private final String id;
    private final Queue<Client> clientQueue;

    public Cashier() {
        super();
        this.id = Randomizer.generateRandomUUID();
        this.clientQueue = new LinkedList<>();
    }

    public void serveNextClient() {
        if (!clientQueue.isEmpty()) {
            Client nextClient = clientQueue.poll();
            System.out.println("Cajer@ " + name + " " + id + " atendiendo a " + nextClient.getName());
        } else {
            System.out.println("Cajer@ " + name + " " + id + " no tiene clientes en la cola");
        }
    }

    public void addToQueue(Client client) {
        clientQueue.offer(client);
    }

    public Queue<Client> getClientQueue() {
        return clientQueue;
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
