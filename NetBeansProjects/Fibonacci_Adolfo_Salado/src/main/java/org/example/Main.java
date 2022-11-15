package org.example;

public class Main {
    public static void main(String[] args) {
        Hebra hebra = new Hebra(10);
        hebra.start();

        try {
            hebra.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}