package edu.penzgtu.ip.strategy;

public class Cash implements Payment {
    private final String name;

    public Cash(String name) {
        this.name = name;
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("The cash payment was successful");
    }
}
