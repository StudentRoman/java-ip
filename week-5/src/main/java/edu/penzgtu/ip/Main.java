package edu.penzgtu.ip;

import edu.penzgtu.ip.factory.Product;
import edu.penzgtu.ip.factory.ProductFactory;
import edu.penzgtu.ip.singleton.DatabaseConnection;
import edu.penzgtu.ip.strategy.BankCard;
import edu.penzgtu.ip.strategy.Cart;
import edu.penzgtu.ip.strategy.Payment;

public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        DatabaseConnection connectionDatabase = DatabaseConnection.getInstance();
        DatabaseConnection connectionDatabaseSec = DatabaseConnection.getInstance();

        // Factory pattern
        Product book = ProductFactory.getInstance("book");
        book.getInformation();

        Product clothes = ProductFactory.getInstance("clothes");
        clothes.getInformation();

        // Strategy pattern
        Cart instance = new Cart();
        Payment card = new BankCard("Visa", "1234567812345678", "01/24");

        instance.pay(card);
    }
}