package edu.penzgtu.ip.adapter;

public class NewPaymentGateway {
    public void pay(double amount, String type) {
        System.out.printf("%n Paying via NewPaymentGateway Amount = %s, Payment Type = %s%n", amount, type);
    }
}
