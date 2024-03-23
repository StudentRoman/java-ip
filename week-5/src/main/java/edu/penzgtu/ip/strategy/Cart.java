package edu.penzgtu.ip.strategy;

import edu.penzgtu.ip.factory.Book;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Book> books = new ArrayList<>();

    public int getTotalPrice() {
        int total = 0;

        for (Book book : books) {
            total += book.getPrice();
        }

        return total;
    }

    public void pay(Payment method) {
        method.pay(getTotalPrice());
    }
}
