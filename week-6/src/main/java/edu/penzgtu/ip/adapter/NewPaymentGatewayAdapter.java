package edu.penzgtu.ip.adapter;

public class NewPaymentGatewayAdapter implements PaymentGateway {
    private final NewPaymentGateway newPaymentGateway;

    public NewPaymentGatewayAdapter(NewPaymentGateway newPaymentGateway) {
        this.newPaymentGateway = newPaymentGateway;
    }

    @Override
    public void paymentProcess(String type, double amount) {
        newPaymentGateway.pay(amount, type);
    }
}
