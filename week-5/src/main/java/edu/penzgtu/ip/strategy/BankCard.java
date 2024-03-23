package edu.penzgtu.ip.strategy;

public class BankCard implements Payment {
    private final String name;
    private final String card;
    private final String date;

    public BankCard(String name, String card, String date) {
        this.name = name;
        this.card = card;
        this.date = date;
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("The card payment was successful");
    }
}
