package edu.penzgtu.ip.adapter;

public interface PaymentGateway {
    void paymentProcess(String type, double amount);
}
